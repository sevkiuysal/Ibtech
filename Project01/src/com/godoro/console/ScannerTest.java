package com.godoro.console;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Uzun: ");
		long l=scanner.nextLong();
		System.out.println("Sicim: ");
		String s=scanner.next();
		System.out.println("Ýkiþer: ");
		double d=scanner.nextDouble();
		scanner.close();
		
		System.out.printf("Uzun: %d Sicim: %-20s Ýkiþer: %11.2f",l,s,d);
		
	}
}
