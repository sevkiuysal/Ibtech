package com.godoro.pattern;

import java.util.List;

public class TestFilter {
	private static void printList(List<Customer> customerList) {
		for(Customer customer:customerList)
		{
			System.out.println(customer.getCustomerId()+" "+customer.getCustomerName()+" "
					+customer.getTotalDebit());
		}
	}
	public static void main(String[] args) throws Exception {
		CustomerManager customerManager=new CustomerManager();
		double totalDebitMin=5000;
		List<Customer> customerList=customerManager.listByTotalDebitGreater(totalDebitMin);
		printList(customerList);
		System.out.println();
		
		String customerNamePattern="Bil";
		List<Customer> customerList2=customerManager.listByCustomerNameLike(customerNamePattern);
		printList(customerList2);
		
		
	}

}
