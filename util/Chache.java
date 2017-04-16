package com.rfc.util;

import java.util.ArrayList;
import java.util.HashMap;

import com.rfc.pojo.AttendancePojo;
import com.rfc.pojo.PlayerDetails;

public class Chache {

	private static Chache chache=null;
	
	private HashMap<String, AttendancePojo>hmAttendanceName=new HashMap<>();
	private HashMap<String,  HashMap<String, String>>hmAttendanceDateWise=new HashMap<>();
	private HashMap<String,PlayerDetails>hmplayerList=new HashMap<>();
	private Chache() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static  Chache getInstance()
	{
	if(chache==null)
	{
		chache=new Chache();
	}
	return chache;
	}


	public HashMap<String, AttendancePojo> getHmAttendanceName() {
		return hmAttendanceName;
	}


	public void setHmAttendanceName(HashMap<String, AttendancePojo> hmAttendanceName) {
		this.hmAttendanceName = hmAttendanceName;
	}




	public HashMap<String, PlayerDetails> getHmplayerList() {
		return hmplayerList;
	}


	public void setHmplayerList(HashMap<String, PlayerDetails> hmplayerList) {
		this.hmplayerList = hmplayerList;
	}


	public HashMap<String, HashMap<String, String>> getHmAttendanceDateWise() {
		return hmAttendanceDateWise;
	}


	public void setHmAttendanceDateWise(HashMap<String, HashMap<String, String>> hmAttendanceDateWise) {
		this.hmAttendanceDateWise = hmAttendanceDateWise;
	}





	
	
	

}
