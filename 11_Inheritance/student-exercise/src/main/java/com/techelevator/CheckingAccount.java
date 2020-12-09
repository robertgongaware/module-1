package com.techelevator;

public class CheckingAccount extends BankAccount {
	
	
	public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
		super (accountHolderName, accountNumber, balance);
		
	}
	
	public CheckingAccount(String accountHolderName, String accountNumber) {
		super(accountHolderName, accountNumber);
	}
	
	@Override
	public int withdraw(int amountToWithdraw) {
		//int newBalance = getBalance() - amountToWithdraw; // new var = the balance minus the withdrawal amount
		if(super.getBalance() - amountToWithdraw > 0) { // if the new balance is greater than 0
			//balance = newBalance; // do the operation
			return super.withdraw(amountToWithdraw); // return the balance
		} else if(super.getBalance() <= 0 && super.getBalance() >= -89) { // else if the newbalance is less than 0, AND newbalance is greater than -89 (to account for the $10 fee)
			return super.withdraw(amountToWithdraw - -10); // balance = the new balance - the fee ($10).
		} return super.getBalance(); // return the adjusted balance
	} 
		
}
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	


