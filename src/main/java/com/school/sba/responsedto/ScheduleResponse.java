package com.school.sba.responsedto;

import java.time.LocalTime;

public class ScheduleResponse {
	
	private int scheduleId;
	private LocalTime OpensAt;
	private LocalTime ClosesAt;
	private int classHourPerDay;
	private int classHourLengthInMinutes;
	private LocalTime breakTime;
	private int breakLength;
	private LocalTime lunchTime;
	private int lunchLength;
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public LocalTime getOpensAt() {
		return OpensAt;
	}
	public void setOpensAt(LocalTime opensAt) {
		OpensAt = opensAt;
	}
	public LocalTime getClosesAt() {
		return ClosesAt;
	}
	public void setClosesAt(LocalTime closesAt) {
		ClosesAt = closesAt;
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
	public int getBreakLength() {
		return breakLength;
	}
	public void setBreakLength(int breakLength) {
		this.breakLength = breakLength;
	}
	public LocalTime getLunchTime() {
		return lunchTime;
	}
	public void setLunchTime(LocalTime lunchTime) {
		this.lunchTime = lunchTime;
	}
	public int getLunchLength() {
		return lunchLength;
	}
	public void setLunchLength(int lunchLength) {
		this.lunchLength = lunchLength;
	}
	
	

}
