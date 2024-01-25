package com.school.sba.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.school.sba.enumuration.ProgramType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
@Component
public class AcademicProgram {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int programId;
	private String programName;
	private LocalTime beginsAt;
	private LocalTime endsAt;
	private ProgramType programType;
	
	@ManyToOne
	private School school;
	
	@ManyToMany
	private List<Subject> subjects;
	
	@ManyToMany(mappedBy = "academicProgram")
	private List<User> users=new ArrayList<>();

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

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public AcademicProgram(int programId, String programName, LocalTime beginsAt, LocalTime endsAt,
			ProgramType programType, School school, List<Subject> subjects, List<User> users) {
		super();
		this.programId = programId;
		this.programName = programName;
		this.beginsAt = beginsAt;
		this.endsAt = endsAt;
		this.programType = programType;
		this.school = school;
		this.subjects = subjects;
		this.users = users;
	}

	public AcademicProgram() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
