package com.techelevator;

public class Television {
	
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	public Television() {
		currentChannel = 3;
		currentVolume = 2;
	}
	
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	public void turnOff() {
		boolean power = false;
		isOn = power;
	}
	
	public void turnOn() {
		boolean powerOn = true;
		isOn = powerOn;
	}
	
	public void changeChannel(int newChannel) {
		if(isOn)
		if(newChannel >= 3 && newChannel <= 18) {
		if(currentChannel >= 3 && currentChannel <= 18) {
			currentChannel = newChannel;
			}
		}
		
	}
	
	public void channelUp() {
		if(isOn) {
			currentChannel ++;
		} if(currentChannel > 18) {
			currentChannel = 3;
		}
	}
	
	public void channelDown() {
		if(isOn) {
			currentChannel --;
		} if(currentChannel < 3) {
			currentChannel = 18;
		}
	}
	
	
	public void raiseVolume() {
		if(isOn && currentVolume < 10) {
			currentVolume ++;
		} 
	}
	
	public void lowerVolume() {
		if(isOn && currentVolume > 0) {
			currentVolume --;
		}
	}
	
	
	
	
	
	

}