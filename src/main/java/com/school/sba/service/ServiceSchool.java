package com.school.sba.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.sba.Util.ResponseStructure;
//
//import com.school.sba.Util.ResponseStructure;
//import com.school.sba.entity.School;
//import com.school.sba.repository.SchoolRepository;
//import com.school.sba.serviceimpl.SchoolServiceImpl;
//
@Service
public class ServiceSchool {
//	@Autowired
//	private SchoolRepository schoolRepository;
//	@Autowired
//	ResponseStructure<School> responseStructure;
//	@Autowired
//	ResponseStructure<List<School>> listResponseStructure;
//
//	@Override
//	public ResponseEntity<ResponseStructure<List<School>>> getAllSchool() {
//		List<School> findAll = schoolRepository.findAll();
//		if (!findAll.isEmpty()) {
//			listResponseStructure.setStatus(HttpStatus.OK.value());
//			listResponseStructure.setMessage("School data Found!!!");
//			listResponseStructure.setData(findAll);
//			return new ResponseEntity<ResponseStructure<List<School>>>(listResponseStructure, HttpStatus.OK);
//		} else {
//			listResponseStructure.setStatus(HttpStatus.NOT_FOUND.value());
//			listResponseStructure.setMessage("School data Not Found !!!");
//			return new ResponseEntity<ResponseStructure<List<School>>>(listResponseStructure, HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<School>> saveSchool(School school) {
//		School sch = schoolRepository.save(school);
//		if ((sch != null)) {
//			responseStructure.setStatus(HttpStatus.FOUND.value());
//			responseStructure.setMessage("School data saved !!!");
//			responseStructure.setData(sch);
//			return new ResponseEntity<ResponseStructure<School>>(responseStructure, HttpStatus.FOUND);
//		} else
//			return null;
//	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<School>> getSchoolById(School school) {
//		Optional<School> findById = schoolRepository.findById(school.getSchoolId());
//		if (findById.isPresent()) {
//			responseStructure.setStatus(HttpStatus.OK.value());
//			responseStructure.setMessage("School data Found!!!");
//			responseStructure.setData(findById.get());
//			return new ResponseEntity<ResponseStructure<School>>(responseStructure, HttpStatus.OK);
//		} else {
//			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
//			responseStructure.setMessage("School data Not Found !!!");
//			return new ResponseEntity<ResponseStructure<School>>(responseStructure, HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<School>> updateSchool(int id, School updateschool) {
//		Optional<School> findById = schoolRepository.findById(id);
//		if (findById.isPresent()) {
//			School exStd = findById.get();
//			exStd = mapBySchool(exStd, updateschool);
//			schoolRepository.save(exStd);
//			responseStructure.setStatus(HttpStatus.OK.value());
//			responseStructure.setMessage("School data Updated !!!");
//			responseStructure.setData(exStd);
//			return new ResponseEntity<ResponseStructure<School>>(responseStructure, HttpStatus.OK);
//		} else {
//			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
//			responseStructure.setMessage("School data Not Found !!!");
//			return new ResponseEntity<ResponseStructure<School>>(responseStructure, HttpStatus.NOT_FOUND);
//		}
//	}
//
//	private School mapBySchool(School exStd, School updateSchool) {
//		exStd.setSchoolName(updateSchool.getSchoolName());
//		exStd.setEmailId(updateSchool.getEmailId());
//		exStd.setShedule(updateSchool.getShedule());
//		exStd.setContactNo(updateSchool.getContactNo());
//		exStd.setAddress(updateSchool.getAddress());
//		return exStd;
//	}
//
//	@Override
//	public ResponseEntity<ResponseStructure<School>> deleteSchoolById(School school) {
//		Optional<School> findById = schoolRepository.findById(school.getSchoolId());
//		if (findById.isPresent()) {
//			responseStructure.setStatus(HttpStatus.GONE.value());
//			responseStructure.setMessage("School data Deleted !!!");
//			responseStructure.setData(findById.get());
//			schoolRepository.deleteById(school.getSchoolId());
//			return new ResponseEntity<ResponseStructure<School>>(responseStructure, HttpStatus.GONE);
//		} else {
//			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
//			responseStructure.setMessage("School data Not Found !!!");
//			return new ResponseEntity<ResponseStructure<School>>(responseStructure, HttpStatus.NOT_FOUND);
//		}
//	}
	
	
//	*******************************************                          ********************************************************
	
	

}


