package com.techelevator;

public class CreditCardAccount implements Accountable {
	
	private int debt;
	private String accountHolder;
	private String accountNumber;
	
	public CreditCardAccount(String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		}

// GETTERS	
	
	public int getDebt() {
		return debt;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
// METHODS
	
	public int pay(int amountToPay) {
		debt = this.debt - amountToPay;
		return debt;
	}

	public int charge(int amountToCharge) {
		debt = this.debt + amountToCharge;
		return debt;
	}

	public int getBalance() {
		return -debt;
	}
}
	
