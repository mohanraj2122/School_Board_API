package com.school.sba.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.school.sba.enumuration.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(unique = true)
	private String userName;
	private String userPassword;
	private String userFirstName;
	private String userLastName;
	@Column(unique = true)
	private long userContactNo;
	@Column(unique = true)
	private String userEmail;
	private UserRole userRole;
	private boolean isDeleted;
	
	@ManyToOne
	private School school;
	
	@ManyToMany
	private List<AcademicProgram> academicProgram=new ArrayList<>();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public long getUserContactNo() {
		return userContactNo;
	}

	public void setUserContactNo(long userContactNo) {
		this.userContactNo = userContactNo;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public List<AcademicProgram> getAcademicProgram() {
		return academicProgram;
	}

	public void setAcademicProgram(List<AcademicProgram> academicProgram) {
		this.academicProgram = academicProgram;
	}
	
		
}






















//*****************************************************************************************************************
//public int getUserId() {
//	return userId;
//}
//
//public void setUserId(int userId) {
//	this.userId = userId;
//}
//
//public String getUserName() {
//	return userName;
//}
//
//public void setUserName(String userName) {
//	this.userName = userName;
//}
//
//public String getUserPassword() {
//	return userPassword;
//}
//
//public void setUserPassword(String userPassword) {
//	this.userPassword = userPassword;
//}
//
//public String getUserFirstName() {
//	return userFirstName;
//}
//
//public void setUserFirstName(String userFirstName) {
//	this.userFirstName = userFirstName;
//}
//
//public String getUserLastName() {
//	return userLastName;
//}
//
//public void setUserLastName(String userLastName) {
//	this.userLastName = userLastName;
//}
//
//public long getUserContactNo() {
//	return userContactNo;
//}
//
//public void setUserContactNo(long userContactNo) {
//	this.userContactNo = userContactNo;
//}
//
//public String getUserEmail() {
//	return userEmail;
//}
//
//public void setUserEmail(String userEmail) {
//	this.userEmail = userEmail;
//}
//
//public UserRole getUserRole() {
//	return userRole;
//}
//
//public void setUserRole(UserRole userRole) {
//	this.userRole = userRole;
//}
//
//public boolean isDeleted() {
//	return isDeleted;
//}
//
//public void setDeleted(boolean isDeleted) {
//	this.isDeleted = isDeleted;
//}
//
//public School getSchool() {
//	return school;
//}
//
//public void setSchool(School school) {
//	this.school = school;
//}


