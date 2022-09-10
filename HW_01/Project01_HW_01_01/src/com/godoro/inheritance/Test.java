package com.godoro.inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Employee employee=new Employee(201,"Erkan"," Ocaklý",5470);
		employee.setEmailAddress("erkan@godoro.com");
		
		sendMail(employee);
				
	}
	public static void sendMail(Person person)
	{
		System.out.println("Kime: "+person.getEmailAddress());
		System.out.println("Konu: "+person.getGreeting());
		System.out.println("Gövde: "+person.getFullName());
	}

}
