package com.godoro.statics;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount.setRate(24);
		
		BankAccount account1=new BankAccount();
		account1.setInvestment(3000);
		System.out.println("Tutar I:"+account1.getAmount());
		
		
	}
}
