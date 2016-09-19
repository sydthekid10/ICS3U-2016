package com.bayviewglen.daysix;

public class HomeworkThree {

	public static void main(String[] args) {
		
		int minutesinanhour = 60;
		int hoursinaday = 24;
		int daysinayear = 365;
		
		int minutesinayear = minutesinanhour * hoursinaday * daysinayear;
		
		System.out.println("There are " + minutesinayear + " minutes in year.");
	}

}
