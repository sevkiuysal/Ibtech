package com.godoro.converter;

public class AccountConverterTest {
	
	public static void main(String[] args) {
		
		String line="601;Kasa Hesabý;23560";
		AccountConverter converter=new AccountConverter();
		Account account=converter.parse(line);

		System.out.println(account.getAccountId()+" "
				+account.getAccountName()+" "
				+account.getAmountLocal());
		
		String string=converter.format(account);
		
		System.out.println("\n"+string);
	}

}
