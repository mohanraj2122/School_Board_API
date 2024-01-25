package com.school.sba.requestdto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Pattern;

@Component
public class SchoolRequest {
    
	
	@NotNull(message = "School name cannot be null")
	@Pattern(regexp = "^[A-Z][a-zA-Z]*( [A-Z][a-zA-Z]*)?$", 
			message = "School name should start with an uppercase letter, and if there are two names, the second name should start with an uppercase letter.")
	private String schoolName;
	private long contactNo;
	@Email(regexp = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}", message = "invalid email ")
	private String emailId;
	@NotBlank(message ="School Address cannot be blank")
	private String address;
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	public SchoolRequest(
//			@NotNull(message = "School name cannot be null") @Pattern(regexp = "^[A-Z][a-zA-Z]*( [A-Z][a-zA-Z]*)?$", message = "School name should start with an uppercase letter, and if there are two names, the second name should start with an uppercase letter.") String schoolName,
//			long contactNo,
//			@Email(regexp = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}", message = "invalid email ") String emailId,
//			@NotBlank(message = "School Address cannot be blank") String address) {
//		super();
//		this.schoolName = schoolName;
//		this.contactNo = contactNo;
//		this.emailId = emailId;
//		this.address = address;
//	}
	
	
	
	
	
	
	
}
