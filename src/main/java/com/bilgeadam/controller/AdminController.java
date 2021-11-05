package com.bilgeadam.controller;

import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.dao.AdminDao;
import com.bilgeadam.dao.IDAOImplements;
import com.bilgeadam.dto.AdminDto;

public class AdminController implements IDAOImplements<AdminDto> {
	
	// değişken
	private AdminDto adminDto;
	private AdminDao adminDao;
	private List<AdminDto> adminList;
	
	// parametresiz constructor
	public AdminController() {
		adminDto = new AdminDto();
		adminDao = new AdminDao();
		adminList = new ArrayList<AdminDto>();
	}
	
	@Override
	public void insert(AdminDto t) {
		adminDao.insert(t);
		
	}
	
	@Override
	public void update(AdminDto t) {
		adminDao.update(t);
		
	}
	
	@Override
	public void delete(AdminDto t) {
		adminDao.delete(t);
		
	}
	
	@Override
	public ArrayList<AdminDto> list() {
		return adminDao.list();
	}
	
	// getter and setter
	public AdminDto getAdminDto() {
		return adminDto;
	}
	
	public void setAdminDto(AdminDto adminDto) {
		this.adminDto = adminDto;
	}
	
	public AdminDao getAdminDao() {
		return adminDao;
	}
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	public List<AdminDto> getAdminList() {
		return adminList;
	}
	
	public void setAdminList(List<AdminDto> adminList) {
		this.adminList = adminList;
	}
	
}
