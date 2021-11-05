package com.bilgeadam.dto;

// MVC:
// Model alanıdır: DTO:Data Transfer Object
public class AdminDto extends CommonPropery {
	private static final long serialVersionUID = -6214174547778684454L;
	
	// özelliği
	private int registerNumberOfRecords;
	
	// parametresiz constructor
	public AdminDto() {
		// TODO Auto-generated constructor stub
	}
	
	// parametresiz constructor
	public AdminDto(String name, String surName, String telNumber, String emailAddress, String password,
			int registerNumberOfRecords) {
		super(name, surName, telNumber, emailAddress, password);
		this.registerNumberOfRecords = registerNumberOfRecords;
	}
	// getter and setter
	
	public int getRegisterNumberOfRecords() {
		return registerNumberOfRecords;
	}
	
	public void setRegisterNumberOfRecords(int registerNumberOfRecords) {
		this.registerNumberOfRecords = registerNumberOfRecords;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
