package com.school.sba.serviceimpl;

import java.time.Duration;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.school.sba.Exception.ScheduleIsPresentException;
import com.school.sba.Exception.ScheduleNotFoundById;
import com.school.sba.Exception.SchoolNotFoundException;
import com.school.sba.Util.ResponseStructure;
import com.school.sba.entity.Schedule;
import com.school.sba.entity.School;
import com.school.sba.repository.ScheduleRepo;
import com.school.sba.repository.SchoolRepo;
import com.school.sba.requestdto.ScheduleRequest;
import com.school.sba.responsedto.ScheduleResponse;
import com.school.sba.service.ScheduleService;

@Service
public class ScheduleServiceImpl  implements ScheduleService{
	@Autowired
	private ScheduleRepo scheduleRepo;

	@Autowired
	private SchoolRepo schoolRepo;

	@Autowired
	private ResponseStructure<ScheduleResponse> structure;




	@Override
	public ResponseEntity<ResponseStructure<ScheduleResponse>> createSchedule(ScheduleRequest request, int schoolId) {
		School school=schoolRepo.findById(schoolId).orElseThrow(()-> new SchoolNotFoundException("Can't find any school in the given ID"));
		if(school.getSchedule()==null) {
			Schedule schedule=scheduleRepo.save(mapToScheduleRequest(request));
			school.setSchedule(schedule);
			schoolRepo.save(school);
			structure.setStatus(HttpStatus.CREATED.value());
			structure.setMessage("New Schedule is created");
			structure.setData(mapToScheduleResponse(schedule));
		}
		else {
			throw new ScheduleIsPresentException("Schedule is already present for this school");
		}
		return new ResponseEntity<ResponseStructure<ScheduleResponse>>(structure,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<ScheduleResponse>> findSchedule(int scheduleId) {
		Schedule schedule=scheduleRepo.findById(scheduleId).orElseThrow(()-> new ScheduleNotFoundById("Can't find any schedule in the given ID"));
		
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setMessage("Schedule Found");
		structure.setData(mapToScheduleResponse(schedule));
		return new ResponseEntity<ResponseStructure<ScheduleResponse>>(structure,HttpStatus.FOUND);
	}

	@Override
	public ResponseEntity<ResponseStructure<ScheduleResponse>> updateSchedule(int scheduleId, ScheduleRequest request) {
		Schedule schedule=scheduleRepo.findById(scheduleId).orElseThrow(()-> new ScheduleNotFoundById("Can't find any schedule in the given ID"));
	    if (Objects.nonNull(request.getOpensAt())) {
	        schedule.setOpensAt(request.getOpensAt());
	    }
	    if (Objects.nonNull(request.getCloseAt())) {
	        schedule.setClosesAt(request.getCloseAt());
	    }
	    if (Objects.nonNull(request.getBreakTime())) {
	        schedule.setBreakTime(request.getBreakTime());
	    }
	    if (Objects.nonNull(request.getBreakLengthInMinutes())) {
	        schedule.setBreakLength(Duration.ofMinutes(request.getBreakLengthInMinutes()));
	    }
	    if (Objects.nonNull(request.getClassHourPerDay())) {
	        schedule.setClassHoursPerDay(request.getClassHourPerDay());
	    }
	    if (Objects.nonNull(request.getClassHourLengthInMinutes())) {
	        schedule.setClassHoursLength(Duration.ofMinutes(request.getClassHourLengthInMinutes()));
	    } else {
	        schedule.setClassHoursLength(null);
	    }
	    if (Objects.nonNull(request.getLunchTime())) {
	        schedule.setLunchTime(request.getLunchTime());
	    }
	    if (Objects.nonNull(request.getLunchLengthInMinutes())) {
	        schedule.setLunchLength(Duration.ofMinutes(request.getLunchLengthInMinutes()));
	    } else {
	        schedule.setLunchLength(null);
	    }
		scheduleRepo.save(schedule);
		structure.setStatus(HttpStatus.ACCEPTED.value());
		structure.setMessage("Schedule updated");
		structure.setData(mapToScheduleResponse(schedule));
		return new ResponseEntity<ResponseStructure<ScheduleResponse>>(structure,HttpStatus.ACCEPTED);
	}


private Schedule mapToScheduleRequest(ScheduleRequest Schedulerequest) {
	Schedule schedule=new Schedule();
	schedule.setOpensAt(Schedulerequest.getOpensAt());
	schedule.setClosesAt(Schedulerequest.getCloseAt());
	schedule.setClassHoursLength(Duration.ofMinutes(Schedulerequest.getClassHourLengthInMinutes()));
	schedule.setLunchTime(Schedulerequest.getLunchTime());
	schedule.setLunchLength(Duration.ofMinutes(Schedulerequest.getLunchLengthInMinutes()));
	schedule.setBreakTime(Schedulerequest.getBreakTime());
	schedule.setBreakLength(Duration.ofMinutes(Schedulerequest.getBreakLengthInMinutes()));
	schedule.setClassHoursPerDay(Schedulerequest.getClassHourPerDay());
	return schedule;
	}

             private ScheduleResponse mapToScheduleResponse(Schedule schedule) {

            	 ScheduleResponse scheduleResponse=new ScheduleResponse();
            	 scheduleResponse .setScheduleId(schedule.getSheduleId());
            	 scheduleResponse .setOpensAt(schedule.getOpensAt());
            	 scheduleResponse.setClosesAt(schedule.getClosesAt());
            	 scheduleResponse .setClassHourPerDay(schedule.getClassHoursPerDay());
            	 scheduleResponse.setClassHourLengthInMinutes((int) schedule.getClassHoursLength().toMinutes());
            	 scheduleResponse.setBreakTime(schedule.getBreakTime());
            	 scheduleResponse .setClassHourLengthInMinutes((int) schedule.getBreakLength().toMinutes());
            	 scheduleResponse .setLunchTime(schedule.getLunchTime());
            	 scheduleResponse .setClassHourLengthInMinutes((int) schedule.getLunchLength().toMinutes());
                    
            	 return scheduleResponse;
         }

}
























//************************************************                             **********************************************************
//	@Override
//	public ResponseEntity<ResponseStructure<ScheduleResponse>> createSchedule(ScheduleRequest request, int schoolId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//         	private Schedule mapToScheduleRequest(ScheduleRequest request) {
//     		return Schedule.builder()
//     				.opensAt(request.getOpensAt())
//     				.closesAt(request.getClosesAt())
//     				.classHourLength(Duration.ofMinutes(request.getClassHourLengthInMins()))
//     				.lunchTime(request.getLunchTime())
//     				.lunchLength(Duration.ofMinutes(request.getLunchLengthInMins()))
//     				.breakTime(request.getBreakTime())
//     				.breakLength(Duration.ofMinutes(request.getBreakLengthInMins()))
//     				.classHoursPerDay(request.getClassHoursPerDay())
//     				.build();
//     	}

//     	private ScheduleResponse mapToScheduleResponse(Schedule schedule) {
//             return ScheduleResponse.builder()
//                     .scheduleId(schedule.getScheduleId())
//                     .opensAt(schedule.getOpensAt())
//                     .closesAt(schedule.getClosesAt())
//                     .classHoursPerDay(schedule.getClassHoursPerDay())
//                     .classHourLengthInMins((int) schedule.getClassHourLength().toMinutes())
//                     .breakTime(schedule.getBreakTime())
//                     .breakLengthInMins((int) schedule.getBreakLength().toMinutes())
//                     .lunchTime(schedule.getLunchTime())
//                     .lunchLengthInMins((int) schedule.getLunchLength().toMinutes())
//                     .build();
//         }


