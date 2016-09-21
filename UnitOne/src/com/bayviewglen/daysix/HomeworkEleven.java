package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkEleven {

	public static void main(String[] args) {
		
		Scanner cat = new Scanner(System.in);
		
		System.out.print("Enter the mass of the object: ");
		double m = cat.nextDouble();
		
		System.out.print("Enter the speed of the object: ");
		double v = cat.nextDouble();
		
		double KE = 0.5*m*v*v;
				
		System.out.println("The kinetic energy of the object is " + KE + "kg m2 / s2.");
		
	}

}
