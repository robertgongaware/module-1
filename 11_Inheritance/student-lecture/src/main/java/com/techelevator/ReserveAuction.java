package com.techelevator; // derived class. reserve auction IS A auction

public class ReserveAuction extends Auction { //specialization/child/sub of auction. how you initiate the inheritance. sub class - extends - super class

	private int reservePrice;
	
	public ReserveAuction(String itemForSale, int reservePrice) { // all the data is already in the parent object -> Auction
		super(itemForSale); // have to call the parent object, using super. calls super class constructor and passes the information to the super's constructor
		this.reservePrice = reservePrice;
	} 
	// Annotation @ symbol
	
	@Override // means code originated somewhere else, but I am changing it
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid  = false;
		
		if(offeredBid.getBidAmount() >= this.reservePrice) {// if offered bid is higher than reserve...
			 //go up to super class, retrieve placeBid with offeredBid
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		
		
		
		return isCurrentWinningBid;
	}
	
	
	
	public int getReservePrice() {
		return this.reservePrice;
	}
	
	

}
