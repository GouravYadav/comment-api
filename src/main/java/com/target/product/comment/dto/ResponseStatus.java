package com.target.product.comment.dto;

public class ResponseStatus {

	Status status;
	String error;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public ResponseStatus(Status status, String error) {
		super();
		this.status = status;
		this.error = error;
	}
}
