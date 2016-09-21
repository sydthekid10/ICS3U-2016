package com.bayviewglen.daysix;

public class HomeworkTwo {

	public static void main(String[] args) {
		
		double length = 4.5;
		double width = 2.3;
		
		double perimeter = 2*(length + width);
		double area = (length * width);
		
		double perimeterRounded = (int)(perimeter*10)/10.0;
		double areaRounded = (int)(area*10)/10.0;

		System.out.println("The perimeter of the rectangle is: " + perimeterRounded + " feet.");
		System.out.println("The area of the rectangle is: " + areaRounded + " feet.");
		
		
	}

}
