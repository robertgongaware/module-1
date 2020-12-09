package com.techelevator;

public class Grader {

	public static void main(String[] args) {
//		HomeworkAssignment home = new HomeworkAssignment(100, "Bob");
//		home.setEarnedMarks(91);
//		
//		System.out.println(home.getSubmitterName() + " got a(n): " + home.getLetterGrade());

		
		Airplane shirley = new Airplane("1", 10, 100);
		System.out.println(shirley.reserveSeats(false,  55));
		System.out.println(shirley.reserveSeats(false,  55));
	}

}
