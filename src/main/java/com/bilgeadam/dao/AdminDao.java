package com.bilgeadam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bilgeadam.dto.AdminDto;

public class AdminDao implements IDAOImplements<AdminDto> {
	
	// admin_name character varying,
	// admin_surname character varying,
	// admin_tel_number character varying,
	// admin_email_addres character varying,
	// admin_password character varying,
	
	public static void main(String[] args) {
		// ekleme
		// AdminDto adminDto = new AdminDto();
		// adminDto.setName("Hamit");
		// adminDto.setSurName("Mızrak");
		// adminDto.setTelNumber("44444");
		// adminDto.setEmailAddress("hamitmizrak@gmail.com");
		// adminDto.setPassword("şifre");
		//
		// AdminDao adminDao = new AdminDao();
		// adminDao.insert(adminDto);
		
		// güncelleme
		// AdminDto adminDto2 = new AdminDto();
		// adminDto2.setName("Hamit11");
		// adminDto2.setSurName("Mızrak11");
		// adminDto2.setTelNumber("11");
		// adminDto2.setEmailAddress("hamitmizrak11@gmail.com");
		// adminDto2.setPassword("şifre11");
		// adminDto2.setId(1);
		//
		// AdminDao adminDao2 = new AdminDao();
		// adminDao2.update(adminDto2);
		
		// silme
		// AdminDto adminDto3 = new AdminDto();
		// adminDto3.setId(9);
		//
		// AdminDao adminDao3 = new AdminDao();
		// adminDao3.delete(adminDto3);
		
		AdminDao adminDao4 = new AdminDao();
		
		ArrayList<AdminDto> temp = adminDao4.list();
		temp.forEach(System.out::println);
		
	}
	
	@Override
	public void insert(AdminDto t) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "insert into admin_blog (admin_name,admin_surname,admin_tel_number,admin_email_addres,admin_password) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, t.getName());
			preparedStatement.setString(2, t.getSurName());
			preparedStatement.setString(3, t.getTelNumber());
			preparedStatement.setString(4, t.getEmailAddress());
			preparedStatement.setString(5, t.getPassword());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(AdminDao.class + " Ekleme başarılı");
			} else {
				System.out.println("Ekleme sırasında bir hata meydana geldi");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " AdminDao insert Hata meydana geldi  ");
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(AdminDto t) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "update  admin_blog set admin_name=?,admin_surname=?,admin_tel_number=?,admin_email_addres=?,admin_password=? where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, t.getName());
			preparedStatement.setString(2, t.getSurName());
			preparedStatement.setString(3, t.getTelNumber());
			preparedStatement.setString(4, t.getEmailAddress());
			preparedStatement.setString(5, t.getPassword());
			preparedStatement.setInt(6, t.getId());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(AdminDao.class + " Güncelleme başarılı");
			} else {
				System.out.println("Güncelleme sırasında bir hata meydana geldi");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " AdminDao Update Hata meydana geldi  ");
			e.printStackTrace();
		}
	}
	
	@Override
	public void delete(AdminDto t) {
		try (Connection connection = getInterfaceConnection()) {
			String sql = "delete from  admin_blog where admin_id=? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, t.getId());
			int rowEffected = preparedStatement.executeUpdate();
			if (rowEffected > 0) {
				System.out.println(AdminDao.class + " Silme başarılı");
			} else {
				System.out.println("Silme sırasında bir hata meydana geldi");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " AdminDao Delete Hata meydana geldi  ");
			e.printStackTrace();
		}
	}
	
	// DQL
	// listelemek
	@Override
	public ArrayList<AdminDto> list() {
		ArrayList<AdminDto> list2 = new ArrayList<AdminDto>();
		AdminDto adminDto;
		// =?,=?,=?,=?,
		try (Connection connection = getInterfaceConnection()) {
			String sql = "select * from  admin_blog";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				adminDto = new AdminDto();
				adminDto.setId(resultSet.getInt("admin_id"));
				adminDto.setEmailAddress(resultSet.getString("admin_email_addres"));
				adminDto.setName(resultSet.getString("admin_name"));
				adminDto.setPassword(resultSet.getString("admin_password"));
				adminDto.setSurName(resultSet.getString("admin_surname"));
				adminDto.setCreateDate(resultSet.getDate("created_date"));
				adminDto.setRegisterNumberOfRecords(resultSet.getInt("admin_number_of_records"));
				adminDto.setTelNumber(resultSet.getString("admin_tel_number"));
				list2.add(adminDto);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage() + " AdminDao Delete Hata meydana geldi  ");
			e.printStackTrace();
		}
		return list2;
	}
	
}
