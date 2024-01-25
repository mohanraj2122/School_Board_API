package com.school.sba.responsedto;

import org.springframework.stereotype.Component;

import com.school.sba.enumuration.UserRole;

@Component
public class UserResponse {

	private int userId;
	private String userName;
	private String userFirstName;
	private String userLastName;
	private long userContactNo;
	private String userEmail;
	private UserRole userRole;
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
//	public UserResponse(int userId, String userName, String userFirstName, String userLastName, long userContactNo,
//			String userEmail, UserRole userRole) {
//		super();
//		this.userId = userId;
//		this.userName = userName;
//		this.userFirstName = userFirstName;
//		this.userLastName = userLastName;
//		this.userContactNo = userContactNo;
//		this.userEmail = userEmail;
//		this.userRole = userRole;
//	}
	
	
	
}
