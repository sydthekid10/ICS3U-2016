package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BayviewglenPools {

	public static void main(String[] args) {
		
		
		Scanner antelope = new Scanner(System.in);
		
		//Measurements
		System.out.print("Please enter the length of your pool: ");
		double length = antelope.nextDouble();
		
		System.out.print("Please enter the width of your pool: ");
		double width = antelope.nextDouble();
	
		System.out.print("Please enter the depth of your pool's shallow end: ");
		double depthOfShallow = antelope.nextDouble();
		
		System.out.print("Please enter the depth of your pool's deep end: ");
		double depthOfDeep = antelope.nextDouble();
		
		System.out.print("Please enter the length of the transition between the shallow end and the deep end of your pool: ");
		double transition = antelope.nextDouble();
		
		System.out.print("Please enter the length of the shallow end of your pool: ");
		double lengthOfShallow = antelope.nextDouble();
		
		//Liner Costs
		final double LINER_PRICE_ONE = 1.34;
		final double LINER_PRICE_TWO = 2.56;
		final double LINER_PRICE_THREE = 3.78;
		
		//Volume
		double depthDifference = depthOfDeep - depthOfShallow;
		double base = Math.sqrt(Math.pow(transition, 2) - Math.pow(depthDifference, 2));
		double smallRectangle = lengthOfShallow * width * depthDifference;
		double smallTriangle = 2/(base * depthDifference * width);
		double totalVolume = length * width * depthOfDeep;
		double percentage = totalVolume * 0.9;
		System.out.println("The amount of water in 90% of the pool is: " + percentage);
		
		//Surface Area
		double areaOne = (length * depthOfDeep) - ((lengthOfShallow * depthDifference) + (base * depthDifference/2));
		double areaTwo = (depthOfDeep * width)*2;
		double areaThree = length * width;
		double totalSurfaceArea = areaOne + areaTwo + areaThree;
		System.out.println("The amount of liner needed to create the pool is: " + totalSurfaceArea);
		
		//Cost of Liner
		
		
		
	}

}
