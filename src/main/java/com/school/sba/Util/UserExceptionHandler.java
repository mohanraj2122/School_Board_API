package com.school.sba.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.school.sba.Exception.DuplicateEntryException;
import com.school.sba.Exception.InvalidUserException;

@RestControllerAdvice
public class UserExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
			List<ObjectError> allErrors = ex.getAllErrors();
			Map<String, String> errors=new HashMap<>();
			allErrors.forEach(error -> {
			FieldError fieldError=(FieldError) error;
			errors.put(fieldError.getField(), fieldError.getDefaultMessage());
		});
		return errorStructure(HttpStatus.BAD_REQUEST, ex.getMessage(), errors);
	}
	
	private ResponseEntity<Object> errorStructure(HttpStatus status,String message,Object rootCause){		return new ResponseEntity<Object>(Map.of("status",status.value(),
				"message",message,
				"rootcause",rootCause),status);
	}

	@ExceptionHandler(InvalidUserException.class)
	public ResponseEntity<Object> handlerForInvalidUserTypeException(InvalidUserException iue)
	{
		return errorStructure(HttpStatus.BAD_REQUEST, iue.getMessage(), "THIS EXCEPTION IS DUE TO THAT THE ADMIN IS ALREADY PRESENT");

	}
	@ExceptionHandler(DuplicateEntryException.class)
	public ResponseEntity<Object> handlerForDuplicateEntryException(DuplicateEntryException dee){
		return errorStructure(HttpStatus.BAD_REQUEST, dee.getMessage(), "THIS EXCEPTION IS DUE TO THAT THE USERNAME OR CONTACT OR EMAIL ALREADY PRESENT");

	}
}
