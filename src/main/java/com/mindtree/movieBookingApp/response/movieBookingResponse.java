package com.mindtree.movieBookingApp.response;

public class movieBookingResponse {
	String message;
	int code;
	
	public movieBookingResponse(String message) {
		super();
		this.message = message;
	}
	public movieBookingResponse(int code, String message) {
		super();
		this.message = message;
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public movieBookingResponse() {
		super();
	}
	
}
