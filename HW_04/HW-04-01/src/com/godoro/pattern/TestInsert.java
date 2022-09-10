package com.godoro.pattern;

public class TestInsert {
	public static void main(String[] args) {
		Customer customer=new Customer(0,"Buzdolabý",4350);
		CustomerManager customerManager=new CustomerManager();
		try {
			boolean inserted=customerManager.insert(customer);
			if(inserted)
			{
				System.out.println("Ürün Sokuldu.");
			}
			else
			{
				System.out.println("Sokulmadý!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
