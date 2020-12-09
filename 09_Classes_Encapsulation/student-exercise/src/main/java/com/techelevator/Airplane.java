package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int totalFirstClassSeats; // fixed number
	private int bookedFirstClassSeats; // flexible number
	private int totalCoachSeats; // fixed number
	private int bookedCoachSeats; // flexible number
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		boolean success = false;
		
		if(forFirstClass) {
			if(totalNumberOfSeats <= getAvailableFirstClassSeats()) {
				bookedFirstClassSeats += totalNumberOfSeats;
				success = true;
			} 
		} else {
			if(totalNumberOfSeats <= getAvailableCoachSeats()) {
				bookedCoachSeats += totalNumberOfSeats;
				success = true;
			}
			
		}
		return success;
	}
	
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}


}
