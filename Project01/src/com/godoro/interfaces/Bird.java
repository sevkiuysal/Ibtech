package com.godoro.interfaces;

public class Bird extends Animal implements Flyable {

	public Bird(String name) {
		super(name);
		
	}

	public void fly() {
		System.out.println("Ku� "+name+" u�uyor...");		
	}

	public void land() {
		System.out.println("Ku� "+name+" konuyor...");		
		
	}

}
