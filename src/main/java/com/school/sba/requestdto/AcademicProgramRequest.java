package com.school.sba.requestdto;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

import com.school.sba.enumuration.ProgramType;

@Component
public class AcademicProgramRequest {

	private String programName;
	private LocalTime beginsAt;
	private LocalTime endsAt;
	private ProgramType programType;
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public LocalTime getBeginsAt() {
		return beginsAt;
	}
	public void setBeginsAt(LocalTime beginsAt) {
		this.beginsAt = beginsAt;
	}
	public LocalTime getEndsAt() {
		return endsAt;
	}
	public void setEndsAt(LocalTime endsAt) {
		this.endsAt = endsAt;
	}
	public ProgramType getProgramType() {
		return programType;
	}
	public void setProgramType(ProgramType programType) {
		this.programType = programType;
	}
	
	
}
