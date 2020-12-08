package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int fibOne = 0;
		int fibTwo = 0;
		int fib = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the Fibonacci number: ");
			int userTyped = input.nextInt();
		for(int i = 0; i <= userTyped; i++) {
			fibOne = fibTwo;
			fibTwo = fib;
			fib = fibOne + fibTwo;
		System.out.print(fibOne + ", ");
		
			//System.out.print(userTyped = (((1.6180339^n)) - (-0.6180339)^n)) / 2.236067977;
			//System.out.print(userTyped = power(1.6180339, n) - power(-0.6180339, n) / 2.236067977);
				
			
		}
		
	//private static void power(double d, double n) {
		// TODO Auto-generated method stub
	}

}


//Fibonacci nth formula: 1.6180339^n - (-0.6180339)^n / 2.236067977
// 