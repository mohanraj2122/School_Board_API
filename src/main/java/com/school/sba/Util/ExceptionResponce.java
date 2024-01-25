package com.school.sba.Util;

import org.springframework.stereotype.Component;

@Component
public class ExceptionResponce<T> {
	private int status;
	private String message;
	private String rootCause;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRootCause() {
		return rootCause;
	}
	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}
	
	
}
