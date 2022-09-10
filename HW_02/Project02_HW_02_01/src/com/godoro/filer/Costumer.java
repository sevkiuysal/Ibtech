package com.godoro.filer;

public class Costumer {

	private long costumerId;
	private String costumerName;
	private double totalDebit;
	
	public Costumer(long costumerId, String costumerName, double totalDebit) {
		this.costumerId = costumerId;
		this.costumerName = costumerName;
		this.totalDebit = totalDebit;
	}
	public Costumer() {
	}
	public long getCostumerId() {
		return costumerId;
	}
	public void setCostumerId(long costumerId) {
		this.costumerId = costumerId;
	}
	public String getCostumerName() {
		return costumerName;
	}
	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}
	public double getTotalDebit() {
		return totalDebit;
	}
	public void setTotalDebit(double totalDebit) {
		this.totalDebit = totalDebit;
	}
	
	
}
