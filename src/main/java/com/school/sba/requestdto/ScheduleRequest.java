package com.school.sba.requestdto;

import java.time.LocalTime;

import org.springframework.stereotype.Component;

@Component
public class ScheduleRequest {
	
	private LocalTime OpensAt;
	private LocalTime CloseAt;
	private int classHourPerDay;
	private int classHourLengthInMinutes;
	private LocalTime breakTime;
	private int breakLengthInMinutes;
	private LocalTime lunchTime;
	private int lunchLengthInMinutes;
	public LocalTime getOpensAt() {
		return OpensAt;
	}
	public void setOpensAt(LocalTime opensAt) {
		OpensAt = opensAt;
	}
	public LocalTime getCloseAt() {
		return CloseAt;
	}
	public void setCloseAt(LocalTime closeAt) {
		CloseAt = closeAt;
	}
	public int getClassHourPerDay() {
		return classHourPerDay;
	}
	public void setClassHourPerDay(int classHourPerDay) {
		this.classHourPerDay = classHourPerDay;
	}
	public int getClassHourLengthInMinutes() {
		return classHourLengthInMinutes;
	}
	public void setClassHourLengthInMinutes(int classHourLengthInMinutes) {
		this.classHourLengthInMinutes = classHourLengthInMinutes;
	}
	public LocalTime getBreakTime() {
		return breakTime;
	}
	public void setBreakTime(LocalTime breakTime) {
		this.breakTime = breakTime;
	}
	public int getBreakLengthInMinutes() {
		return breakLengthInMinutes;
	}
	public void setBreakLengthInMinutes(int breakLengthInMinutes) {
		this.breakLengthInMinutes = breakLengthInMinutes;
	}
	public LocalTime getLunchTime() {
		return lunchTime;
	}
	public void setLunchTime(LocalTime lunchTime) {
		this.lunchTime = lunchTime;
	}
	public int getLunchLengthInMinutes() {
		return lunchLengthInMinutes;
	}
	public void setLunchLengthInMinutes(int lunchLengthInMinutes) {
		this.lunchLengthInMinutes = lunchLengthInMinutes;
	}
	
	

}
