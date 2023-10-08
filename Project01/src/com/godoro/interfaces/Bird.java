package com.godoro.interfaces;

public class Bird extends Animal implements Flyable {

	public Bird(String name) {
		super(name);
		
	}

	public void fly() {
		System.out.println("Kuþ "+name+" uçuyor...");		
	}

	public void land() {
		System.out.println("Kuþ "+name+" konuyor...");		
		
	}

}
