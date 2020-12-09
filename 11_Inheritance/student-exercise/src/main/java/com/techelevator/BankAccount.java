package com.techelevator;

public class BankAccount {
	
	private String accountHolderName;
	private String accountNumber;
	protected int balance;

	public static void main(String[] args) {

	}
	
	public BankAccount(String accountHolderName, String accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
	}
	
	public BankAccount(String accountHolderName, String accountNumber, int balance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public int deposit(int amountToDeposit) {
		return balance += amountToDeposit;
		
	}
	
	public int withdraw(int amountToWithdraw) {
		if(balance >= 0) {
		}return balance -= amountToWithdraw;
	}
	
	
	
	
	
}
