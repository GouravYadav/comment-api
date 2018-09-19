package com.target.product.comment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.product.comment.dto.CommentResponseData;
import com.target.product.comment.dto.CommentValidateRequest;
import com.target.product.comment.dto.CommentValidateResponse;
import com.target.product.comment.dto.ResponseStatus;
import com.target.product.comment.dto.Status;
import com.target.product.comment.service.ModerateComment;

@RestController
public class CommentController {

	@Autowired
	ModerateComment moderateComment;

	@RequestMapping(method = RequestMethod.POST, value = "/comment")
	public CommentValidateResponse getfeedback(@RequestBody CommentValidateRequest request) {

		CommentValidateResponse response = new CommentValidateResponse();
		CommentResponseData data = new CommentResponseData();
		ResponseStatus status = null;

		if (request == null || request.getPayload() == null || request.getPayload().getComment() == null) {

			data.setFeedback("InValid Request");
			status = new ResponseStatus(Status.FAILED, "Request is invalid. Please submit valid request");
			response.setStatus(status);
			response.setPayload(data);
			return response;
		}

		boolean result = moderateComment.isValid(request.getPayload().getComment());

		if (result) {
			data.setFeedback("Valid Comment");
			status = new ResponseStatus(Status.SUCCESS, "No error");
		} else {
			data.setFeedback("InValid Comment. Please update the comment and then try again!");
			status = new ResponseStatus(Status.FAILED, "Error");
		}

		response.setStatus(status);
		response.setPayload(data);

		return response;
	}
}
