package com.school.sba.responsedto;

import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Component;

import com.school.sba.enumuration.ProgramType;

@Component
public class AcademicProgramResponse {

	private int programId;
	private String programName;
	private LocalTime beginsAt;
	private LocalTime endsAt;
	private ProgramType programType;
	private List<String> subjects;
	public int getProgramId() {
		return programId;
	}
	public void setProgramId(int programId) {
		this.programId = programId;
	}
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
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
//	public AcademicProgramResponse(int programId, String programName, LocalTime beginsAt, LocalTime endsAt,
//			ProgramType programType, List<String> subjects) {
//		super();
//		this.programId = programId;
//		this.programName = programName;
//		this.beginsAt = beginsAt;
//		this.endsAt = endsAt;
//		this.programType = programType;
//		this.subjects = subjects;
//	}
//	
	
}
