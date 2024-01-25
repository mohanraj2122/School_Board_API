package com.school.sba.entity;

import java.time.Duration;
import java.time.LocalTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sheduleId;
	private LocalTime opensAt;
	private LocalTime closesAt;
	private int classHoursPerDay;
	private Duration classHoursLength;
	private LocalTime breakTime;
	private Duration breakLength;
	private LocalTime lunchTime;
	private Duration lunchLength;
	public int getSheduleId() {
		return sheduleId;
	}
	public void setSheduleId(int sheduleId) {
		this.sheduleId = sheduleId;
	}
	public LocalTime getOpensAt() {
		return opensAt;
	}
	public void setOpensAt(LocalTime opensAt) {
		this.opensAt = opensAt;
	}
	public LocalTime getClosesAt() {
		return closesAt;
	}
	public void setClosesAt(LocalTime closesAt) {
		this.closesAt = closesAt;
	}
	public int getClassHoursPerDay() {
		return classHoursPerDay;
	}
	public void setClassHoursPerDay(int classHoursPerDay) {
		this.classHoursPerDay = classHoursPerDay;
	}
	public Duration getClassHoursLength() {
		return classHoursLength;
	}
	public void setClassHoursLength(Duration classHoursLength) {
		this.classHoursLength = classHoursLength;
	}
	public LocalTime getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(LocalTime breakTime) {
		this.breakTime = breakTime;
	}
	public Duration getBreakLength() {
		return breakLength;
	}
	public void setBreakLength(Duration breakLength) {
		this.breakLength = breakLength;
	}
	public LocalTime getLunchTime() {
		return lunchTime;
	}
	public void setLunchTime(LocalTime lunchTime) {
		this.lunchTime = lunchTime;
	}
	public Duration getLunchLength() {
		return lunchLength;
	}
	public void setLunchLength(Duration lunchength) {
		this.lunchLength = lunchength;
	}
	
	
	
	

}
