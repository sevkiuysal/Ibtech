package com.godoro.inventory;

public class CustomerTest2 {

	public static void main(String[] args) {
		Customer customer=new Customer(501,"Neþet Ertaþ",4350);
		System.out.println("Müþter Özdeþliði: "+customer.getCustomerId());
		System.out.println("Müþteri Adý: "+customer.getCustomerName());

		System.out.println("Toplam Borcu: "+customer.getTotalDebit());

	}

}
