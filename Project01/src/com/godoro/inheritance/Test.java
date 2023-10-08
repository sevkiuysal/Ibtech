package com.godoro.inheritance;

public class Test {
	
	public static void main(String[] args) {
		Customer customer=new Customer(401,"Ne�et","Erta�",3450);
		customer.setEmailAddress("nesat@godoro.com");
		
		Person person=new Customer(402,"Mahzuni","�erif",6540);
		person.setEmailAddress("mahzuni@godoro.com");
		
		
		Supplier supplier=new Supplier(701,"Orhan" , "Gencebay", 8125);
		supplier.setEmailAddress("orhan@godoro.com");
		
		System.out.println(customer.getGreeting()+" "+customer.getFullName());
		System.out.println(person.getGreeting()+" "+person.getFullName());
		System.out.println(supplier.getGreeting()+" "+supplier.getFullName());
		
		sendMail(customer);
		sendMail(person);
		sendMail(supplier);
		
	}
	
	public static void sendMail(Person person)
	{
		System.out.println();
		System.out.println("Kime: "+person.getEmailAddress());
		System.out.println("Konu: "+person.getGreeting());
		System.out.println("G�vde: "+person.getFullName());
	}

}
