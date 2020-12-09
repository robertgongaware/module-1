package com.techelevator;

public class Bid {  //

	private String bidder; //who bid
	private int bidAmount; //how much was bid

	public Bid(String bidder, int bidAmount) { //constructor...who you are, how much
		this.bidder = bidder; //good reason to not use setters
		this.bidAmount = bidAmount;
	}

	public String getBidder() { //need to get the bidder?
		return bidder;
	}

	public int getBidAmount() { //need to get their bid amount?
		return bidAmount;
	}
}




// POJO
// Plain Ol' Java Object - nothing in particular, just data/helpers. allows to create custom data objects. in this case, create the struture of a bid.