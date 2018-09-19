package com.target.product.comment.dto;

public class CommentValidateResponse {

	CommentResponseData payload;
	ResponseStatus status;

	public CommentResponseData getPayload() {
		return payload;
	}

	public void setPayload(CommentResponseData payload) {
		this.payload = payload;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

}
