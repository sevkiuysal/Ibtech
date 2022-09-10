package com.godoro.pattern;

public class TestFind {
	public static void main(String[] args) throws Exception {
		long customerId=4;
		CustomerManager customerManager=new CustomerManager();
		Customer customer=customerManager.find(customerId);
		System.out.println(customerId+" "+customer.getCustomerName()+" "
				+customer.getTotalDebit());
		
	}

}
