package com.school.sba.Util;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Controller
public class ResponseStructure<T> {
	private int status;
	private String message;
	private T data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		data = data;
	}


}
