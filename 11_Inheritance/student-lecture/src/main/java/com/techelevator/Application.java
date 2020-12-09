package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
//        System.out.println("Starting a general auction");
//        System.out.println("-----------------");
//
//        Auction generalAuction = new Auction("Tech Elevator t-shirt"); // instantiate what we are selling
//
//        generalAuction.placeBid(new Bid("Josh", 1)); // people bidding
//        generalAuction.placeBid(new Bid("Fonz", 23));
//        generalAuction.placeBid(new Bid("Rick Astley", 13));
//        //....
//        //....
//        // This might go on until the auction runs out of time or hits a max # of bids
//        
//        System.out.println("Auction is over...");
//        System.out.print("Winner is: " + generalAuction.getHighBid().getBidder() + " ");
//        System.out.println("with a bid of " + generalAuction.getHighBid().getBidAmount() + " dollars!");
//        
//        //Auction ra = new Auction("T shirt");
//        //ra = new ReserveAuction("iPhone", 100); //Polymorphism. can achieve inheritance thru polymorphism.
//        //Auction ra = new ReserveAuction("iPhone", 100); // can take a parent and make it a child
//        //ReserveAuction ra = new Auction("iPhone", 100); -> cannot take a child and make it a parent
//        Auction a = new Auction("iPhone");
//        ReserveAuction ra = new ReserveAuction("iPhone", 100);
//        ra.getReservePrice();
//        
//        ra.placeBid(new Bid("Tom", 50));
//        ra.placeBid(new Bid("Tom A", 75));
//        
//        System.out.println("Just sold: " + ra.getItemForSale());
//        System.out.print("Winner is: " + ra.getHighBid().getBidder() + " ");
//        System.out.println("with a bid of " + ra.getHighBid().getBidAmount() + "dollars!");
        
        BuyItNowAuction a = new BuyItNowAuction("iPhone", 250);
        
        a.placeBid(new Bid("Tom", 50));
        a.placeBid(new Bid("Tom A", 75));
        a.placeBid(new Bid("Walt", 150));
        a.placeBid(new Bid("Beth", 100));
        
        System.out.println("Just sold: " + a.getItemForSale());
        System.out.print("Winner is: " + a.getHighBid().getBidder() + " ");
        System.out.println("with a bid of " + a.getHighBid().getBidAmount() + "dollars!");
        
        System.out.println("ALL BIDS:");
        for(Bid b : a.getAllBids()) {
        	System.out.println(b.getBidder() + ": " + b.getBidAmount());
        }

    }
}
