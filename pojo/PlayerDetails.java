package com.rfc.pojo;

public class PlayerDetails {

	private String name;
	private String age;
	private String playingPositon;
	private String mobileNo;
	private String emailId;
	private String whatsappNo;
	private String company;
	private String department;
	private String achivement;
	
	
	public PlayerDetails() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPlayingPositon() {
		return playingPositon;
	}

	public void setPlayingPositon(String playingPositon) {
		this.playingPositon = playingPositon;
	}

	
	
	
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWhatsappNo() {
		return whatsappNo;
	}

	public void setWhatsappNo(String whatsappNo) {
		this.whatsappNo = whatsappNo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAchivement() {
		return achivement;
	}

	public void setAchivement(String achivement) {
		this.achivement = achivement;
	}

	public PlayerDetails( String age, String playingPositon) {
		super();
		
		this.age = age;
		this.playingPositon = playingPositon;
	}

/*	public PlayerDetails(String name, String age, String playingPositon) {
		super();
		this.name = name;
		this.age = age;
		this.playingPositon = playingPositon;
	}
*/
	public PlayerDetails(String name, String age, String playingPositon, String mobileNo, String emailId,
			String whatsappNo, String company, String department, String achivement) {
		super();
		this.name = name;
		this.age = age;
		this.playingPositon = playingPositon;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.whatsappNo = whatsappNo;
		this.company = company;
		this.department = department;
		this.achivement = achivement;
	}

	
	
}
