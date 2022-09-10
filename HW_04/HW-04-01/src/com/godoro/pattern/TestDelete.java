package com.godoro.pattern;

public class TestDelete {
	public static void main(String[] args) {
		long customerId=5;
		CustomerManager customerManager=new CustomerManager();
		try{
			boolean deleted=customerManager.delete(customerId);
			if(deleted) {
				System.out.println("Silindi.");
			}else {
				System.out.println("Silinmedi!");	
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
