package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		Scanner elephant = new Scanner(System.in);
		
		System.out.println("Enter a mark:");
		int x = elephant.nextInt();
		
		System.out.println("Enter what the test was out of:");
		int y = elephant.nextInt();
		
		double percent = ((double) x/y)*100;
		System.out.println("The student received:\n" + percent + "%");
		
		
	}

}
