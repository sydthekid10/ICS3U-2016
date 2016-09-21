package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkTen {

	public static void main(String[] args) {
		
		Scanner penguin = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
		double length = penguin.nextDouble();
		
		System.out.print("Enter the width of the rectangle: ");
		double width = penguin.nextDouble();

		double perimeter = 2*(length + width);
		double area = length*width;
		
		System.out.println("The perimeter of the rectangle is " + perimeter + ".");
		System.out.println("The area of the rectangle is " + area + ".");
	}

}
