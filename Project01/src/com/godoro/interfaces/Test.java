package com.godoro.interfaces;

public class Test {

	public static void main(String[] args) {
		
	}
	
	private static void makeFly(Flyable flyable)
	{
		System.out.println();
		System.out.println("UÇ!");
		flyable.fly();
		System.out.println("KON!");
		flyable.land();
	}
}
