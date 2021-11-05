package com.bilgeadam.dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.bilgeadam.utils.DatabaseConnection;

// CRUD generics DML
public interface IDAOImplements<T> {
	
	// gövdesiz metotlarımızı yazdık
	public void create(T t); // insert into tabloAdi() values()
	
	public void update(T t);// update tabloAdi() set adi=""
	
	public void delete(T t);// delete from tabloAdi where id=5
	
	public ArrayList<T> list();// select
	
	// gövdeli metot
	default Connection getInterfaceConnection() {
		return DatabaseConnection.getInstance().getConnection();
	}
	
}
