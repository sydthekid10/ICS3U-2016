package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		
		Scanner hippo = new Scanner(System.in);
		
		System.out.println("Enter a five-digit number:");
		
		int num = hippo.nextInt();
		
		int digit2 = num % 10000 / 1000;
		int digit4 = num % 100 / 10;
		
		System.out.println("The fourth digit is: " + digit4);
		

	}

}
