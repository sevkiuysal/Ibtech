package com.godoro.pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CustomerManager {
	private String url="jdbc:postgresql://localhost/dbgodoro1";
	private String user="postgres";
	private String password="sevkiuysal";
	private String driver="org.postgresql.Driver";
	
	public CustomerManager() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public Customer parse(ResultSet resultSet) throws Exception {
		long customerId=resultSet.getLong("customerId");
		String customerName=resultSet.getString("customerName");
		double totalDebit=resultSet.getDouble("totalDebit");
		Customer customer=new Customer(customerId, customerName, totalDebit);
		return customer;
	}
	
	public List<Customer> parseList(ResultSet resultSet) throws Exception{
		List<Customer> customerList=new ArrayList<>();
		while(resultSet.next())
		{
			Customer customer=parse(resultSet);
			customerList.add(customer);
		}
		return customerList;
	}
	public List<Customer> listByTotalDebitGreater(double totalDebitMin) throws Exception{
		
		Connection connection =DriverManager.getConnection(url,user,password);
		String sql="select *from customer where totalDebit>=?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setDouble(1, totalDebitMin);
		ResultSet resultSet=statement.executeQuery();		
		List<Customer> customerList=parseList(resultSet);		
		connection.close();
		return customerList;
	}
	
	public List<Customer> listByCustomerNameLike(String customerNamePattern) throws Exception{
		Connection connection =DriverManager.getConnection(url,user,password);
		String sql="select *from customer where customerName like ?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1, "%"+customerNamePattern+"%");
		ResultSet resultSet=statement.executeQuery();	
		
		List<Customer> customerList=parseList(resultSet);	
		
		connection.close();
		return customerList;
	}

	public Customer find(long customerId) throws Exception {
		Customer customer=null;
		Connection connection =DriverManager.getConnection(url,user,password);
		String sql="select *from customer where customerId=?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setDouble(1, customerId);
		ResultSet resultSet=statement.executeQuery();
		
		if(resultSet.next())
		{
			customer=parse(resultSet);
		}		
		
		connection.close();
		return customer;
	}
	public List<Customer> list() throws Exception{
		Connection connection =DriverManager.getConnection(url,user,password);
		String sql="select *from customer";
		PreparedStatement statement=connection.prepareStatement(sql);
		ResultSet resultSet=statement.executeQuery();
		
		List<Customer> customerList=parseList(resultSet);
		
		connection.close();
		return customerList;
	}
	public boolean delete(long customerId) throws Exception{
		Connection connection=DriverManager.getConnection(url,user,password);
		
		String sql="delete from customer where customerId=?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setLong(1, customerId);
		int deleted=statement.executeUpdate();
		
		connection.close();
		System.out.println("Etkilenmiþ: "+deleted);
		return deleted>0;
	}
	
	public boolean update(Customer customer) throws Exception{
		Connection connection =DriverManager.getConnection(url,user,password);
		
		String sql="update  customer set customerName=?,totalDebit=? where customerId=?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1,customer.getCustomerName());
		statement.setDouble(2, customer.getTotalDebit());
		statement.setLong(3, customer.getCustomerId());
		int updated=statement.executeUpdate();
		
		connection.close();		
		System.out.println("Etkilenmiþ: "+updated);
		return updated>0;
	}
	
	public boolean insert(Customer customer) throws Exception 
	{		
	Connection connection =DriverManager.getConnection(url,user,password);
	
	String sql="insert into customer(customerName,totalDebit)values(?,?)";
	PreparedStatement statement=connection.prepareStatement(sql);
	statement.setString(1,customer.getCustomerName());
	statement.setDouble(2, customer.getTotalDebit());
	int affected=statement.executeUpdate();
	
	connection.close();	
	System.out.println("Etkilenmiþ: "+affected);
	return affected>0;
}

}
