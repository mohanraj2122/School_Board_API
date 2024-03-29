package com.school.sba.service;

import org.springframework.http.ResponseEntity;

import com.school.sba.Util.ResponseStructure;
import com.school.sba.requestdto.SubjectRequest;
import com.school.sba.responsedto.AcademicProgramResponse;

public interface SubjectService {
	
	ResponseEntity<ResponseStructure<AcademicProgramResponse>> addSubject(SubjectRequest request,int programId);

	ResponseEntity<ResponseStructure<AcademicProgramResponse>> updateSubject(SubjectRequest request, int programId);

}
