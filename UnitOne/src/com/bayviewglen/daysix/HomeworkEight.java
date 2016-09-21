package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEight {

	public static void main(String[] args) {
		
		Scanner dolphin = new Scanner(System.in);
		
		System.out.print("Enter a postive number: ");
		double positiveNumber = dolphin.nextDouble();
		
		
		double square = positiveNumber*positiveNumber;
		double squareroot = Math.sqrt(positiveNumber);
		
		System.out.println("The square of " + positiveNumber + " is " + square );
		System.out.println("The square root of " + positiveNumber + " is " + (long)squareroot);
	}

}
