package com.godoro.console;

public class AccountConverter {
	
	public Account parse(String line)
	{
		Account account=new Account();
		String []tokens=line.split(";");
		account.setAccountId(Long.parseLong(tokens[0]));
		account.setAccountName(tokens[1]);
		account.setAmountLocal(Double.parseDouble(tokens[2]));
		return account;
	}
	
	public String format(Account account)
	{
		StringBuilder builder=new StringBuilder();
		builder.append(account.getAccountId()).append(";");
		builder.append(account.getAccountName()).append(";");
		builder.append(account.getAmountLocal());
		
		String string=builder.toString();
		return string;
	}

}
