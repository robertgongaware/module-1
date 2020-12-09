package com.techelevator;

public class BuyItNowAuction extends Auction {
	
	private int salesPrice;

	public BuyItNowAuction(String itemForSale, int salesPrice) {
		super(itemForSale);
		this.salesPrice = salesPrice;
		
	}
	
	public int getSalesPrice() {
		return this.salesPrice;
	}

	@Override
	public boolean placeBid(Bid incomingBid) {
		if(getHighBid().getBidAmount() >= this.salesPrice ) { // high bid kept track in 'Auction' salesPrice is here
			// Auction is already over
			return false;
			
		
		}
		// Place bid normally
		return super.placeBid(incomingBid);
	}
	
}
