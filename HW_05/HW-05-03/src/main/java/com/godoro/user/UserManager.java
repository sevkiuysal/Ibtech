package com.godoro.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.jsp.tagext.TryCatchFinally;


public class UserManager {
	private String url="jdbc:postgresql://localhost/dbgodoro1";
	private String user="postgres";
	private String password="sevkiuysal";
	private String driver="org.postgresql.Driver";
	
	Connection connection=null;
	public UserManager() {
		try {
			Class.forName(driver);
			connection =DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	public PreparedStatement connect(String sql) throws SQLException {
		PreparedStatement statement=connection.prepareStatement(sql);
		return statement;
	}
	public void disconnect() throws SQLException {
		connection.close();
	}
	public User findByUserName(String userName) throws Exception{
		
		String sql="select *from userr where userName like ?";
		PreparedStatement statement=connect(sql);
		statement.setString(1, userName);
		ResultSet resultSet=statement.executeQuery();
		
		User user=new User();
		if(resultSet.next())
		{
			int userId=resultSet.getInt("userId"); 
			String password=resultSet.getString("password");
			user=new User(userId,userName,password);
			
		}
		disconnect();
		return user;		
	}
	
	public void create(User user) throws Exception {		
		String sql="insert into Userr(userName,userPassword)values(?,?)";
		PreparedStatement statement=connect(sql);
		statement.setString(1,user.getUserName());
		statement.setString(2, user.getPassword());
		int affected=statement.executeUpdate();
		disconnect();
		System.out.println(affected);
	}
	
}
