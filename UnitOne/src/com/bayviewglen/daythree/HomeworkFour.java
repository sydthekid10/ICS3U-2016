package com.bayviewglen.daythree;

public class HomeworkFour {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2;
		double slope;
		
		x1 = 5.1;
		y1 = 2.3;

		x2 = 4.8;
		y2 = 1.4;
		
		slope = (y2-y1)/(x2-x1);
		
		System.out.println("The slope of a line with points (" + x1 + ", " + y1 + ") and (" + x2 + ", "+ y2 + ") is " + slope + ".");
	}

}
