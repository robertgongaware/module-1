package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
	private String name;
	private String address;
	private String phoneNumber;
	private List<Accountable> customerAccounts = new ArrayList<Accountable>();
		 
	

	public void addAccount(Accountable newAccount) {
		customerAccounts.add(newAccount);
	}
		
	public boolean isVip() {
		int myAccountBalance = 0;
		for(Accountable myAccounts : getAccounts()) {
			myAccountBalance += myAccounts.getBalance();
		}
			if (myAccountBalance >= 25000) {
				return true;
			}
			return false;
	}
 	
// GETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	
	public Accountable[] getAccounts() {
		Accountable[] junk = new Accountable[customerAccounts.size()];
		return customerAccounts.toArray(junk);		
		} 
	

//SETTERS
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
	
}