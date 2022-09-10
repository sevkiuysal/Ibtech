package com.godoro.console;

import java.util.Scanner;

public class AccountConverterTest {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Account account=new Account();
		
		System.out.println("AccountId: ");
		account.setAccountId(scan.nextLong());
		
		System.out.println("AccountName: ");
		String name =scan.next();
		name+=scan.nextLine();
		account.setAccountName(name);
		
		System.out.println("AmountLocal: ");
		account.setAmountLocal(scan.nextDouble());		
		
		AccountConverter converter=new AccountConverter();
		String string=converter.format(account);
		
		System.out.println("\n"+string);
		
		Account account2=converter.parse(string);

		System.out.println(account2.getAccountId()+" "
				+account2.getAccountName()+" "
				+account2.getAmountLocal());
		scan.close();
		
		
	}

}
