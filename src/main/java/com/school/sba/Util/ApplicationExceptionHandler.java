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

import com.school.sba.Exception.AcademicProgramNotFoundById;
import com.school.sba.Exception.AdminCannotBeAssignedToAcademicException;
import com.school.sba.Exception.DuplicateEntryException;
import com.school.sba.Exception.InvalidUserException;
import com.school.sba.Exception.ScheduleIsPresentException;
import com.school.sba.Exception.ScheduleNotFoundById;
import com.school.sba.Exception.SchoolAlreadyPresentForAdminException;
import com.school.sba.Exception.SchoolNotFoundException;
import com.school.sba.Exception.UserNotFoundByIdException;

@RestControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{

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

	private ResponseEntity<Object> errorStructure(HttpStatus status,String message,Object rootCause){		
		return new ResponseEntity<Object>(Map.of("status",status.value(),
				"message",message,
				"rootcause",rootCause),status);
	}

	@ExceptionHandler(InvalidUserException.class)
	public ResponseEntity<Object> handlerForInvalidUserTypeException(InvalidUserException iue)
	{
		return errorStructure(HttpStatus.BAD_REQUEST, iue.getMessage(), "Only ADMIN'S are allowed to sign in here!!");
	}
	@ExceptionHandler(DuplicateEntryException.class)
	public ResponseEntity<Object> handlerForDuplicateEntryException(DuplicateEntryException dee){
		return errorStructure(HttpStatus.BAD_REQUEST, dee.getMessage(), "Duplicate entry is not allowed.change username and try again!!");

	}
	@ExceptionHandler(UserNotFoundByIdException.class)
	public ResponseEntity<Object> handleUserNotFoundByIdException(UserNotFoundByIdException ex){
		return errorStructure(HttpStatus.NOT_FOUND, ex.getMessage(), "User id not found");
	}

	@ExceptionHandler(ScheduleIsPresentException.class)
	public ResponseEntity<Object> scheduleAlreadyPresentException(ScheduleIsPresentException ex){
		return errorStructure(HttpStatus.NOT_FOUND, ex.getMessage(), "School is already scheduled");
	}

	@ExceptionHandler(SchoolAlreadyPresentForAdminException.class)
	public ResponseEntity<Object> schoolAlreadyPresentForAdmin (SchoolAlreadyPresentForAdminException ex){
		return errorStructure(HttpStatus.BAD_REQUEST,ex.getMessage(), "You are trying to create more than one school for a ADMIN");
	}

	@ExceptionHandler(SchoolNotFoundException.class)
	public ResponseEntity<Object> invalidFormat(SchoolNotFoundException ex){
		return errorStructure(HttpStatus.BAD_REQUEST,ex.getMessage(), "PLEASE ENTER PASSWORD IN A VALID SCHOOL");
	}
	
	@ExceptionHandler(ScheduleNotFoundById.class)
	public ResponseEntity<Object> scheduleNotFoundByIdException(ScheduleNotFoundById ex){
		return errorStructure(HttpStatus.NOT_FOUND,ex.getMessage(), "Schedule not found in respected id");
	}
	@ExceptionHandler(AcademicProgramNotFoundById.class)
	public ResponseEntity<Object> academicProgramNotFoundByIdException(AcademicProgramNotFoundById ex){
		return errorStructure(HttpStatus.NOT_FOUND,ex.getMessage(), "Academic Program not found in respected id");
	}
	@ExceptionHandler(AdminCannotBeAssignedToAcademicException.class)
	public ResponseEntity<Object> AdminCannotBeAssignedToAcademic(AdminCannotBeAssignedToAcademicException ex){
		return errorStructure(HttpStatus.BAD_REQUEST,ex.getMessage(), "Admin cannot be added to any academic program.only students and teachers can be assigned");
	}
}
