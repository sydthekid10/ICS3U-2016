package com.bayviewglen.daysix;

public class HomeworkFour {

	public static void main(String[] args) {
		
		double lightpersecond = 3E8;
		int secondsperminute = 60;
		int minutesperhour = 60;
		int hoursperday = 24;
		int daysperyear = 365;
		double lightperyear = secondsperminute * minutesperhour * hoursperday * daysperyear * lightpersecond;
		
		System.out.println("A light beam would travel " + (long)lightperyear + "m in one year.");
		

	}

}
