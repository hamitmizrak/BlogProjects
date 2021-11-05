package com.bilgeadam.dto;

import java.io.Serializable;

/*
 * isActive:boolean
 * HesCodes: String
 * temporaryUUID: UUID
 */
public class UserDto extends CommonPropery implements Serializable {
	private static final long serialVersionUID = -6909316477482845301L;
	
	// genel özellikleri
	private boolean isActive;
	private String HesCodes;
	
	public UserDto() {
		this.isActive = true;
	}
	
	@Override
	public String toString() {
		return "UserDto [isActive=" + isActive + ", HesCodes=" + HesCodes + "]";
	}
	
	public UserDto(String name, String surName, String telNumber, String emailAddress, String password,
			boolean isActive, String hesCodes) {
		super(name, surName, telNumber, emailAddress, password);
		this.isActive = isActive;
		HesCodes = hesCodes;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public String getHesCodes() {
		return HesCodes;
	}
	
	public void setHesCodes(String hesCodes) {
		HesCodes = hesCodes;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
