package com.godoro.pattern;

public class TestUpdate {
	public static void main(String[] args) {
		Customer customer=new Customer(4,"Mikser",450);
		CustomerManager customerManager=new CustomerManager();
		try {
			boolean inserted=customerManager.update(customer);
			if(inserted)
			{
				System.out.println("Güncellendi.");
			}
			else
			{
				System.out.println("Güncellenmedi!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
