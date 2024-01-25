package com.school.sba.service;

import org.springframework.http.ResponseEntity;

import com.school.sba.Util.ResponseStructure;
import com.school.sba.requestdto.UserRequest;
import com.school.sba.responsedto.UserResponse;

public interface UserService {
	
	
	
	
	
	
	
	ResponseEntity<ResponseStructure<UserResponse>> saveUser( UserRequest userRequest);

	ResponseEntity<ResponseStructure<UserResponse>> deleteUser(int userId);

	ResponseEntity<ResponseStructure<UserResponse>> findUserById(int userId);

	ResponseEntity<ResponseStructure<UserResponse>> saveAdmin(UserRequest request);
	
	
	
	
	
	

//	ResponseEntity<ResponseStructure<UserResponse>> saveUser( UserRequest userRequest);
//
//	ResponseEntity<ResponseStructure<UserResponse>> deleteUser(int userId);
//
//	ResponseEntity<ResponseStructure<UserResponse>> findUserById(int userId);
}
