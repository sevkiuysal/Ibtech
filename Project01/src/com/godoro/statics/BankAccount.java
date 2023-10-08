package com.godoro.statics;

public class BankAccount {
	
	public final static int MONTHS_IN_A_YEAR=12;
	private static double rate;
	
	private double investment;
	
	public double getAmount(int month)
	{
		return investment*(1+month*rate/(MONTHS_IN_A_YEAR*100));
	}
	
	public double getAmount()
	{
		return getAmount(MONTHS_IN_A_YEAR);
	}

	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		BankAccount.rate = rate;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

}
