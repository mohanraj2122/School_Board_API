package com.school.sba.service;

import org.springframework.http.ResponseEntity;

import com.school.sba.Util.ResponseStructure;
import com.school.sba.requestdto.ScheduleRequest;
import com.school.sba.requestdto.UserRequest;
import com.school.sba.responsedto.ScheduleResponse;
import com.school.sba.responsedto.UserResponse;

public interface ScheduleService {

	ResponseEntity<ResponseStructure<ScheduleResponse>> createSchedule(ScheduleRequest request, int schoolId);

	ResponseEntity<ResponseStructure<ScheduleResponse>> findSchedule(int scheduleId);

	ResponseEntity<ResponseStructure<ScheduleResponse>> updateSchedule(int scheduleId, ScheduleRequest request);
}
