package com.dsc.security.auth.response;

public class ErrorResponse {

	private String message;
	private String statusCode;
	private String stausMessage;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStausMessage() {
		return stausMessage;
	}

	public void setStausMessage(String stausMessage) {
		this.stausMessage = stausMessage;
	}

	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", statusCode=" + statusCode + ", stausMessage=" + stausMessage
				+ "]";
	}

}
