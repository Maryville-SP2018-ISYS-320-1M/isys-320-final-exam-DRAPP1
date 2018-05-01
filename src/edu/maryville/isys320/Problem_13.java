package edu.maryville.isys320;

import java.util.Scanner;

public class Problem_13 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int total_Score;
		System.out.println("What is par for this course? ");
		String Par = console.nextLine();
		
		System.out.println("Enter your score ");
		int score1 = console.nextInt();
		
		System.out.println("Enter your score ");
		int score2 = console.nextInt();
		
		System.out.println("Enter your score ");
		int score3 = console.nextInt();
		
		total_Score = ((score1 + score2 + score3) -70);
		
		System.out.println("On this course your total score is" + total_Score);
		
		
	}

}