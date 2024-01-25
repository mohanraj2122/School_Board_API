package com.school.sba.service;

import org.springframework.http.ResponseEntity;

import com.school.sba.Util.ResponseStructure;
import com.school.sba.requestdto.SchoolRequest;
import com.school.sba.responsedto.SchoolResponse;

public interface SchoolService {
	ResponseEntity<ResponseStructure<SchoolResponse>> createSchool(SchoolRequest schoolRequest);

}
