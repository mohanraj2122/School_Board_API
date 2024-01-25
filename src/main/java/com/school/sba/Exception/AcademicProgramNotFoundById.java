package com.school.sba.Exception;

public class AcademicProgramNotFoundById extends RuntimeException{
	private String message;

	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public AcademicProgramNotFoundById(String message) {
		this.message=message;
	}
	
	
}
