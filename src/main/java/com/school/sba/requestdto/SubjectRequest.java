package com.school.sba.requestdto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SubjectRequest {

	private List<String> subjectNames;

	public List<String> getSubjectNames() {
		return subjectNames;
	}

	public void setSubjectNames(List<String> subjectNames) {
		this.subjectNames = subjectNames;
	}
	
	
}
