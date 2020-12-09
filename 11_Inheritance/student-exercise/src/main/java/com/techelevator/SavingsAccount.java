package com.techelevator;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
		super(accountHolderName, accountNumber, balance);
	}
		
	public SavingsAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
			
	}
		
	@Override
	public int withdraw(int amountToWithdraw) {
		if(super.getBalance() - amountToWithdraw < 150 && super.getBalance() - amountToWithdraw > 0) { // if balance is less than 150 and greater than 0 
			return super.withdraw(amountToWithdraw + 2); //return balance - amount to withdraw + 2 fee
		}
		else if (super.getBalance() - amountToWithdraw > 150) { 
			return super.withdraw(amountToWithdraw);
			 // subtract the withdrawal and subtract $2 fee
					// return the balance
		} else if(super.getBalance() < amountToWithdraw) { // if the current balance is less than the withdrawal amount, fail then
			} 	return super.getBalance(); // return the balance
	}
	
}
