package com.school.sba.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.school.sba.Exception.InvalidUserException;
import com.school.sba.Exception.SchoolAlreadyPresentForAdminException;
import com.school.sba.Exception.UserNotFoundByIdException;
import com.school.sba.Util.ResponseStructure;
import com.school.sba.entity.School;
import com.school.sba.entity.User;
import com.school.sba.enumuration.UserRole;
import com.school.sba.repository.SchoolRepo;
import com.school.sba.repository.UserRepositary;
import com.school.sba.requestdto.SchoolRequest;
import com.school.sba.responsedto.SchoolResponse;
import com.school.sba.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{
//	ResponseEntity<ResponseStructure<List<School>>> getAllSchool() ;
//
//	ResponseEntity<ResponseStructure<School>> saveSchool(School school);
//
//	ResponseEntity<ResponseStructure<School>> getSchoolById(School school);
//
//	ResponseEntity<ResponseStructure<School>> deleteSchoolById(School school);
//
//	ResponseEntity<ResponseStructure<School>> updateSchool(int id,School updateschool);
	
	
//	*****************************         *******************************************
	
	@Autowired
	private SchoolRepo schoolRepo;
	
	@Autowired
	private ResponseStructure<SchoolResponse> structure;
	
	@Autowired
	private UserRepositary userRepo;
	
	
	@Override
	public ResponseEntity<ResponseStructure<SchoolResponse>> createSchool(SchoolRequest schoolRequest) {
		String userName=SecurityContextHolder.getContext().getAuthentication().getName();   // directly getting the username that has been logged in
		User admin=userRepo.findByUserName(userName).orElseThrow(()-> new UserNotFoundByIdException("User Id not exist"));
		if(admin.getUserRole()!=UserRole.ADMIN) {
			throw new InvalidUserException("only ADMIN can create school");
		}
		if(admin.getSchool()!=null) {
			throw new SchoolAlreadyPresentForAdminException("School already exists");
		}

		School school=schoolRepo.save(mapToSchoolRequest(schoolRequest));
		admin.setSchool(school);
		userRepo.save(admin);
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage("School created for ADMIN");
		structure.setData(mapToSchoolResponse(school));
		return new ResponseEntity<ResponseStructure<SchoolResponse>>(structure,HttpStatus.CREATED);
	}
	
	
	private School mapToSchoolRequest(SchoolRequest request) {
		System.err.println(request.getAddress());
		     School school=new School();
			  school.setSchoolName(request.getSchoolName());
			  school.setContactNo(request.getContactNo());
			  school.setEmailId(request.getEmailId());
			  school.setAddress(request.getAddress());
			  return school;
				
	}
	
	private SchoolResponse mapToSchoolResponse(School school) {
		SchoolResponse schoolResponse=new SchoolResponse();
				schoolResponse.setSchoolName(school.getSchoolName());
				schoolResponse.setContactNo(school.getContactNo());
				schoolResponse.setEmailId(school.getEmailId());
				schoolResponse.setAddress(school.getAddress());
				schoolResponse.setSchoolId(school.getSchoolId());
				return schoolResponse;
	}

}




//************************************************************ *********************** ***************************************


//@Override
//public ResponseEntity<ResponseStructure<SchoolResponse>> createSchool(SchoolRequest schoolRequest, int userId){
//	return userRepo.findById(userId).map(u ->{
//		
//		if(u.getUserRole().equals(UserRole.ADMIN)) {
//			
//			if(u.getSchool()==null) {
//				School school=mapToSchoolRequest(schoolRequest);
//				school=schoolRepo.save(school);
//				u.setSchool(school);
//				userRepo.save(u); 
//				structure.setStatus(HttpStatus.CREATED.value());
//				structure.setMessage("School saved Successfully");
//				structure.setData(mapToSchoolResponse(school));
//				return new ResponseEntity<ResponseStructure<SchoolResponse>>(structure, HttpStatus.CREATED);
//			}else
//				throw new RuntimeException();
//			
//		}else
//			throw new RuntimeException();
//	}).orElseThrow(() -> new UserNotFoundByIdException("Failed To save School"));
