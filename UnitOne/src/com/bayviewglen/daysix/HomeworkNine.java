package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		
		Scanner ostrich = new Scanner(System.in);
		
		double pay = 0.27;
		
		System.out.print("Please enter the number of items sold: ");
		double items = ostrich.nextDouble();
		
		double totalPay = pay*items;
		
		System.out.println("The amount of pay due is $" + totalPay + ".");
		

	}

}
