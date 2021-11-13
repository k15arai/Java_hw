package com.kenjiarai.dojosurvey.classes;

public class DojoSurvey {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	private int id;
	private String fullName;
	private String location;
	private String language;
	private String comment;
	
	// empty constructor
	public DojoSurvey() {}
	
	// constructor with parameters
	public DojoSurvey(int id, String fullName, String location, String language, String comment) {
		this.id = id;
		this.fullName = fullName;
		this.location = location;
		this.language = language;
		this.comment = comment;
	}
}
