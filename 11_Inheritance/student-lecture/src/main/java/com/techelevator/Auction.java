package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction {

	private String itemForSale;
	private Bid currentHighBid; //tracks current high bid
	private List<Bid> allBids; //list of all bids

	public Auction(String itemForSale) { //when we instantiate an item for sale
		this.itemForSale = itemForSale;
		this.currentHighBid = new Bid("", 0); // when an auction starts, there are no high bidders yet. hence, empty string, and zero amount.
		allBids = new ArrayList<>(); // instantiate an empty list to keep track of all new bids
	}

	public boolean placeBid(Bid offeredBid) { // allows user to place a bid, returns boolean whether true or false. accepted or denied.
		allBids.add(offeredBid); // adds bid
		boolean isCurrentWinningBid = false;
		if (offeredBid.getBidAmount() > currentHighBid.getBidAmount()) { // is bid amount higher than the current high bid?
			currentHighBid = offeredBid; //if so, the new bid is higher, and is stored as the new current high bid.
			isCurrentWinningBid = true; // if true, flips current bid to true
		}
		return isCurrentWinningBid; // if bid amount is less, returns false
	}

	public Bid getHighBid() { // no setters
		return currentHighBid; //finds out who's winning
	}

	public List<Bid> getAllBids() { // this gets our list, but doesn't return the list. this makes a copy of the list, and provides the copy as an arraylist including allBids, which is already an array
		return new ArrayList<>(allBids);
	}

	public String getItemForSale() { // gets item for sale
		return itemForSale;
	}
}
