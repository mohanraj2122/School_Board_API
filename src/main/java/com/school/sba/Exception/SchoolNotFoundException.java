package com.school.sba.Exception;

public class SchoolNotFoundException extends RuntimeException{
	private String message;
	public SchoolNotFoundException() {
	}
	public SchoolNotFoundException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}

}
