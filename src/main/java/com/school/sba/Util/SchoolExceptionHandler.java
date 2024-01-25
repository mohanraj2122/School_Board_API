//package com.school.sba.Util;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import com.school.sba.Exception.SchoolNotFoundException;
//
//@RestControllerAdvice 
//public class SchoolExceptionHandler {
//
//private ResponseStructure<String> structure;
//
//
//	
//	@ExceptionHandler(SchoolNotFoundException.class)
//	public ResponseEntity<ResponseStructure<String>> invalidFormat(SchoolNotFoundException schoolNotFoundException)
//	
//	{
//		
//		structure.setMessage(schoolNotFoundException.getMessage());
//		structure.setRootCause("PLEASE ENTER PASSWORD IN A VALID SCHOOL");
//		structure.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
//		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_ACCEPTABLE);
//		
//	}
//	
//}
