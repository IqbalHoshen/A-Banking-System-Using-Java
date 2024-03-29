
package com.mycompany.bankapp;


public abstract class Account implements IBaseRate {

	private String name;
	private String ssn;
	private double balance;
	protected String accNumber;
	protected double rate;
	private static int index = 10000;
	private double accruedInterest;	
	public Account(String name, String ssn, double initialDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initialDeposit;
		index++;
		// set account# method called
		this.accNumber = setAccNo();
		// set base rate
		setRate();
		// find out the accrue interest
		compound();
	}
	private String setAccNo() {
		String lastTwoOfSSN = ssn.substring(ssn.length() - 2, ssn.length());
		int randNo = 257;
		return lastTwoOfSSN + index + randNo;
	}
	public abstract void setRate();
	public void compound() {
		accruedInterest = balance* (rate/100);
		balance += accruedInterest;
	}
	public void showInfo() {
				System.out.println("\t\t Name: " + name + 
						"\n\t\t Acc#: " + accNumber + 
						"\n\t\t Balance: " + balance + 
						"\n\t\t Rate: " + rate + "%" +
						"\n\t\t Accrued Interest: $" + accruedInterest);
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}	
	public String getSsn() {
		return ssn;
	}	
	public String getAccNumber() {
		return accNumber;
	}
	public double getRate() {
		return rate;
	}
	public double getAccruedInterest() {
		return accruedInterest;
	}	
	public void printBalance() {
		System.out.println("\t\t Your balance is: $"+ balance);
	}
}