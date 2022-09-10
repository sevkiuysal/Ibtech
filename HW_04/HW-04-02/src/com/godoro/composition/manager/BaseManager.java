package com.godoro.composition.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public abstract class BaseManager <E> {
	
	private String url="jdbc:postgresql://localhost/dbgodoro1";
	private String user="postgres";
	private String password="sevkiuysal";
	private String driver="org.postgresql.Driver";
	
	protected Connection connection;
	
	public BaseManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void connect() throws SQLException {
		connection =DriverManager.getConnection(url,user,password);
	}
	
	public void disconnect() throws SQLException {
		if(connection!=null) {
		connection.close();
		}
	}
	
	public List<E> parseList(ResultSet resultSet) throws Exception{
		List<E> entityList=new ArrayList<>();
		while(resultSet.next())
		{
			E entity=parse(resultSet);
			entityList.add(entity);
		}
		return entityList;
	}
	
	public abstract E parse(ResultSet resultSet) throws Exception;
	
}
