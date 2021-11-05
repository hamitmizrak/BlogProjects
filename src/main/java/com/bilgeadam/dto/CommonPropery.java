package com.bilgeadam.dto;

import java.io.Serializable;
import java.sql.Date;

/*
 * commonPropery classının attributesları
 * -id:int
 * -name: String
 * -surname: String
 * -telNumber: String
 * -emailAddress: String
 * -password: String
 * -createDate: Date
 */
public class CommonPropery implements Serializable {
	private static final long serialVersionUID = 1L;
	
	// özellikler
	private int id;
	private String name;
	private String surName;
	private String telNumber;
	private String emailAddress;
	private String password;
	private Date createDate;
	
	public CommonPropery() {
		// TODO Auto-generated constructor stub
	}
	
	public CommonPropery(String name, String surName, String telNumber, String emailAddress, String password) {
		this.name = name;
		this.surName = surName;
		this.telNumber = telNumber;
		this.emailAddress = emailAddress;
		this.password = password;
	}
	
	// getter and setter
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurName() {
		return surName;
	}
	
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getTelNumber() {
		return telNumber;
	}
	
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}
