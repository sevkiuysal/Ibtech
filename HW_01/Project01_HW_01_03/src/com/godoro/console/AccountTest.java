package com.godoro.console;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account=new Account();
		String line="601;Kasa Hesabý;23560";
		String []tokens=line.split(";");
		account.setAccountId(Long.parseLong(tokens[0]));
		account.setAccountName(tokens[1]);
		account.setAmountLocal(Double.parseDouble(tokens[2]));
		
		System.out.println(account.getAccountId()+" "
				+account.getAccountName()+" "
				+account.getAmountLocal());
		
		StringBuilder builder=new StringBuilder();
		builder.append(account.getAccountId()).append(";");
		builder.append(account.getAccountName()).append(";");
		builder.append(account.getAmountLocal());
		
		String string=builder.toString();
		
		System.out.println(string);
		
		
	}

	
}
