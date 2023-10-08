package com.godoro.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDelete {
	public static void main(String[] args) throws Exception {
		String url="jdbc:postgresql://localhost/dbgodoro";
		String user="";
		String password="";
		String driver="org.Postgresql.Driver";
		Class.forName(driver);
		
		Connection connection =DriverManager.getConnection(url,user,password);
		String sql="delete from Product where productId ?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1,"Cep Telefonu");
		statement.setDouble(2, 5465);
		int affected=statement.executeUpdate();
		
		
		connection.close();
		
		System.out.println("Etkilenmiþ: "+affected);

}
}
