package com.rfc.pojo;

public class AttendancePojo {

	public String name;
	public String date;
	
	public String attendance;
	public int playerTotalAttendance;
//	public String Name;
	
	public AttendancePojo() {
		// TODO Auto-generated constructor stub
	}

	
	public AttendancePojo( String date, String attendance,int playerTotalAttendance) {
		super();
	
		this.date = date;
		this.attendance = attendance;
		this.playerTotalAttendance=playerTotalAttendance;
	}

	

	public AttendancePojo(String name, String attendance) {
		super();
		this.name = name;
		this.attendance = attendance;
	}


	public int getPlayerTotalAttendance() {
		return playerTotalAttendance;
	}


	public void setPlayerTotalAttendance(int playerTotalAttendance) {
		this.playerTotalAttendance = playerTotalAttendance;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	
}
