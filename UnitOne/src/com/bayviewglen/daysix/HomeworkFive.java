package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		
		int wins = 110;
		int losses = 44;
		int total = 154;
		
		double winPercentage = (double) wins/total;
		double winPercentageRounded = (int)(winPercentage*100000)/1000.0;
				
		System.out.println("The 1927 New York Yankees winning percentage is " + winPercentageRounded + "%.");
		

	}

}
