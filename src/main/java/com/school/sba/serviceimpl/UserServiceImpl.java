package com.school.sba.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.school.sba.Exception.DuplicateEntryException;
import com.school.sba.Exception.InvalidUserException;
import com.school.sba.Exception.UserNotFoundByIdException;
import com.school.sba.Util.ResponseStructure;
import com.school.sba.entity.User;
import com.school.sba.enumuration.UserRole;
import com.school.sba.repository.UserRepositary;
import com.school.sba.requestdto.UserRequest;
import com.school.sba.responsedto.UserResponse;
import com.school.sba.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	static boolean admin=false;
	@Autowired
	private UserRepositary userRepo;
	@Autowired
	private ResponseStructure<UserResponse> responceStructure;

	@Autowired
	private PasswordEncoder encoder;

	private UserResponse mapToUserResponce(User user) {
		UserResponse userResponse=new UserResponse();
		userResponse.setUserId(user.getUserId());
		userResponse.setUserName(user.getUserName());
		userResponse.setUserFirstName(user.getUserFirstName());
		userResponse.setUserLastName(user.getUserLastName());
		userResponse.setUserEmail(user.getUserEmail());
		userResponse.setUserRole(user.getUserRole());
		userResponse.setUserContactNo(user.getUserContactNo());
		
		return  userResponse;
	}
	private User mapToUser(UserRequest userRequest) {
		User user=new User();
		user.setUserName(userRequest.getUserName());
		user.setUserFirstName(userRequest.getUserFirstName());
		user.setUserLastName(userRequest.getUserLastName());
		user.setUserPassword(encoder.encode(userRequest.getUserPassword()));
		user.setUserContactNo(userRequest.getUserContactNo());
		user.setUserEmail(userRequest.getUserEmail());
		user.setUserRole(userRequest.getUserRole());
		return user;
	}
	


	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> saveAdmin(UserRequest request) {
		if(request.getUserRole()==UserRole.ADMIN) {

			if(userRepo.existsByUserRole(request.getUserRole())==false) {
				User user = userRepo.save(mapToUser(request));
				responceStructure.setStatus(HttpStatus.CREATED.value());
				responceStructure.setMessage("Admin Created");
				responceStructure.setData(mapToUserResponce(user));
				return new ResponseEntity<ResponseStructure<UserResponse>>(responceStructure,HttpStatus.CREATED);

			}
			else {
				throw new DuplicateEntryException("Admin Already Exist");
			}
		}
		else {
			throw new InvalidUserException("Invalid User!!");			
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> saveUser(UserRequest userRequest) {
		if(userRequest.getUserRole()!=UserRole.ADMIN) 
		{	try {
			User user = userRepo.save(mapToUser(userRequest));
			responceStructure.setStatus(HttpStatus.CREATED.value());
			responceStructure.setMessage("Admin Created");
			responceStructure.setData(mapToUserResponce(user));	
			return new ResponseEntity<ResponseStructure<UserResponse>>(responceStructure,HttpStatus.CREATED);
		}
		catch(Exception e) {
			throw new DuplicateEntryException("User already present in same name");
		}
		}
		else {
			throw new DuplicateEntryException("Admin Already present");
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> deleteUser(int userId) {
		User user=userRepo.findById(userId).orElseThrow(()-> new UserNotFoundByIdException("User Id not exist"));
		user.setDeleted(true);
		userRepo.save(user);

		responceStructure.setStatus(HttpStatus.OK.value());
		responceStructure.setMessage("User data deleted");
		responceStructure.setData(mapToUserResponce(user));

		return new ResponseEntity<ResponseStructure<UserResponse>>(responceStructure,HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<UserResponse>> findUserById(int userId) {
		User user=userRepo.findById(userId).orElseThrow(()-> new UserNotFoundByIdException("User Id not exist"));
		responceStructure.setStatus(HttpStatus.OK.value());
		responceStructure.setMessage("User data");
		responceStructure.setData(mapToUserResponce(user));
		return new ResponseEntity<ResponseStructure<UserResponse>>(responceStructure,HttpStatus.OK);
	}

}
//	***********************************************************************************************************************
//	public boolean isPresent(UserRole userrole) throws AdminAlreadyExistsException{
//		boolean existsByUserRole=userRepo.existsByUserRole(UserRole.ADMIN);
//		if(existsByUserRole==true) {
//			throw new AdminAlreadyExistsException("can have only one admin");
//		}
//		return true;
//	}







