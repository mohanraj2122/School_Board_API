package com.school.sba.responsedto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SubjectResponse {
	List<String> subjectName;

	public List<String> getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(List<String> subjectName) {
		this.subjectName = subjectName;
	}
	
	

}
