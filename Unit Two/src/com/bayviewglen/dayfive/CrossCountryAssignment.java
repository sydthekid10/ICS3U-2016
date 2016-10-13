package com.bayviewglen.dayfive;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		
		final int SECONDS_PER_MINUTES = 60;

		Scanner pegasus = new Scanner(System.in);

		DecimalFormat secondsFormatter = new DecimalFormat("00.000");

		// Runner One//

		System.out.print("Please enter your first and last name: ");
		String runnerOneName = pegasus.nextLine();
		String FirstNameOne = runnerOneName.split(" ")[0];
		String LastNameOne = runnerOneName.split(" ")[1];

		System.out.println(FirstNameOne + ", please enter your Mile One Time (mm:ss.ss): ");
		String runnerOneTimeOne = pegasus.nextLine();
		int minutes = Integer.parseInt(runnerOneTimeOne.split(":")[0]);
		double seconds = Double.parseDouble(runnerOneTimeOne.split(":")[1]);

		System.out.println(FirstNameOne + ", please enter your time to the end of the second mile (mm:ss.ss): ");
		String runnerOneTimeTwo = pegasus.nextLine();
		int minutesRunnerOneTimeTwo = Integer.parseInt(runnerOneTimeTwo.split(":")[0]);
		double secondsRunnerOneTimeTwo = Double.parseDouble(runnerOneTimeTwo.split(":")[1]);

		System.out.println(FirstNameOne + ", please enter your time to the end of the 5km (mm:ss.ss): ");
		String runnerOneTotal = pegasus.nextLine();
		int minutesRunnerOneTotal = Integer.parseInt(runnerOneTotal.split(":")[0]);
		double secondsRunnerOneTotal = Double.parseDouble(runnerOneTotal.split(":")[1]);

		System.out.println("");
		System.out.println("Runner One Summary\n******************\n ");
		System.out.println("Runner: " + runnerOneName);

		// Split 1//
		int minutesSplitOneRunnerOne = Integer.parseInt(runnerOneTimeOne.split(":")[0]);
		double secondsSplitOneRunnerOne = Double.parseDouble(runnerOneTimeOne.split(":")[1]);
		double timeOneRunnerOne = minutes * SECONDS_PER_MINUTES + seconds;

		minutesSplitOneRunnerOne = (int) (timeOneRunnerOne / SECONDS_PER_MINUTES);
		secondsSplitOneRunnerOne = timeOneRunnerOne % SECONDS_PER_MINUTES;

		String secondsConvertedOneSplitOne = secondsFormatter.format(secondsSplitOneRunnerOne);
		String convertedSplitOneRunnerOne = minutesSplitOneRunnerOne + ":" + secondsConvertedOneSplitOne;
		System.out.println("Split One: " + convertedSplitOneRunnerOne);

		// Split 2//
		int minutesSplitTwoRunnerOne = Integer.parseInt(runnerOneTimeTwo.split(":")[0]);
		double secondsSplitTwoRunnerOne = Double.parseDouble(runnerOneTimeTwo.split(":")[1]);
		double timeTwoRunnerOne = minutesRunnerOneTimeTwo * SECONDS_PER_MINUTES + secondsRunnerOneTimeTwo;

		double splitTwoRunnerOne = (timeTwoRunnerOne - timeOneRunnerOne);
		minutesSplitTwoRunnerOne = (int) (splitTwoRunnerOne / SECONDS_PER_MINUTES);
		secondsSplitTwoRunnerOne = splitTwoRunnerOne % SECONDS_PER_MINUTES;

		String secondsConvertedOneSplitTwo = secondsFormatter.format(secondsSplitTwoRunnerOne);
		String convertedSplitTwoRunnerOne = minutesSplitTwoRunnerOne + ":" + secondsConvertedOneSplitTwo;
		System.out.println("Split Two: " + convertedSplitTwoRunnerOne);

		// Split 3//
		double timeTotalRunnerOne = minutesRunnerOneTotal * SECONDS_PER_MINUTES + secondsRunnerOneTotal;
		double splitThreeRunnerOne = (timeTotalRunnerOne - timeTwoRunnerOne);
		int minutesRunnerOneSplitThree = (int) splitThreeRunnerOne / SECONDS_PER_MINUTES;
		double secondsRunnerOneSplitThree = splitThreeRunnerOne % SECONDS_PER_MINUTES;

		String secondsConvertedOneSplitThree = secondsFormatter.format(secondsRunnerOneSplitThree);
		String convertedSplitThreeRunnerOne = minutesRunnerOneSplitThree + ":" + secondsConvertedOneSplitThree;
		System.out.println("Split Three: " + convertedSplitThreeRunnerOne);

		// Total//
		minutesRunnerOneTotal = Integer.parseInt(runnerOneTotal.split(":")[0]);
		secondsRunnerOneTotal = Double.parseDouble(runnerOneTotal.split(":")[1]);
		String secondsConvertedRunnerOneTotal = secondsFormatter.format(secondsRunnerOneTotal);
		String convertedTotalRunnerOne = minutesRunnerOneTotal + ":" + secondsConvertedRunnerOneTotal;
		System.out.println("Total: " + convertedTotalRunnerOne);

		// Runner Two//

		System.out.print("Please enter your first and last name: ");
		String runnerTwoName = pegasus.nextLine();
		String FirstNameTwo = runnerTwoName.split(" ")[0];
		String LastNameTwo = runnerTwoName.split(" ")[1];

		System.out.println(FirstNameTwo + ", please enter your Mile One Time (mm:ss.ss): ");
		String runnerTwoTimeOne = pegasus.nextLine();
		int minutesTwo = Integer.parseInt(runnerTwoTimeOne.split(":")[0]);
		double secondsTwo = Double.parseDouble(runnerTwoTimeOne.split(":")[1]);

		System.out.println(FirstNameTwo + ", please enter your time to the end of the second mile (mm:ss.ss): ");
		String runnerTwoTimeTwo = pegasus.nextLine();
		int minutesRunnerTwoTimeTwo = Integer.parseInt(runnerTwoTimeTwo.split(":")[0]);
		double secondsRunnerTwoTimeTwo = Double.parseDouble(runnerTwoTimeTwo.split(":")[1]);

		System.out.println(FirstNameTwo + ", please enter your time to the end of the 5km (mm:ss.ss): ");
		String runnerTwoTotal = pegasus.nextLine();
		int minutesRunnerTwoTotal = Integer.parseInt(runnerTwoTotal.split(":")[0]);
		double secondsRunnerTwoTotal = Double.parseDouble(runnerTwoTotal.split(":")[1]);

		System.out.println("");
		System.out.println("Runner Two Summary\n******************\n ");
		System.out.println("Runner: " + runnerTwoName);

		// Split 1//
		int minutesSplitOneRunnerTwo = Integer.parseInt(runnerTwoTimeOne.split(":")[0]);
		double secondsSplitOneRunnerTwo = Double.parseDouble(runnerTwoTimeOne.split(":")[1]);
		double timeOneRunnerTwo = minutesTwo * SECONDS_PER_MINUTES + secondsTwo;

		minutesSplitOneRunnerTwo = (int) (timeOneRunnerTwo / SECONDS_PER_MINUTES);
		secondsSplitOneRunnerTwo = timeOneRunnerTwo % SECONDS_PER_MINUTES;

		String secondsConvertedTwoSplitOne = secondsFormatter.format(secondsSplitOneRunnerTwo);
		String convertedSplitOneRunnerTwo = minutesSplitOneRunnerTwo + ":" + secondsConvertedTwoSplitOne;
		System.out.println("Split One: " + convertedSplitOneRunnerTwo);

		// Split 2//
		int minutesSplitTwoRunnerTwo = Integer.parseInt(runnerTwoTimeTwo.split(":")[0]);
		double secondsSplitTwoRunnerTwo = Double.parseDouble(runnerTwoTimeTwo.split(":")[1]);
		double timeTwoRunnerTwo = minutesRunnerTwoTimeTwo * SECONDS_PER_MINUTES + secondsRunnerTwoTimeTwo;

		double splitTwoRunnerTwo = (timeTwoRunnerTwo - timeOneRunnerTwo);
		minutesSplitTwoRunnerTwo = (int) (splitTwoRunnerTwo / SECONDS_PER_MINUTES);
		secondsSplitTwoRunnerTwo = splitTwoRunnerTwo % SECONDS_PER_MINUTES;

		String secondsConvertedTwoSplitTwo = secondsFormatter.format(secondsSplitTwoRunnerTwo);
		String convertedSplitTwoRunnerTwo = minutesSplitTwoRunnerTwo + ":" + secondsConvertedTwoSplitTwo;
		System.out.println("Split Two: " + convertedSplitTwoRunnerTwo);

		// Split 3//
		double timeTotalRunnerTwo = minutesRunnerTwoTotal * SECONDS_PER_MINUTES + secondsRunnerTwoTotal;
		double splitThreeRunnerTwo = (timeTotalRunnerTwo - timeTwoRunnerTwo);
		int minutesRunnerTwoSplitThree = (int) splitThreeRunnerTwo / SECONDS_PER_MINUTES;
		double secondsRunnerTwoSplitThree = splitThreeRunnerTwo % SECONDS_PER_MINUTES;

		String secondsConvertedTwoSplitThree = secondsFormatter.format(secondsRunnerTwoSplitThree);
		String convertedSplitThreeRunnerTwo = minutesRunnerTwoSplitThree + ":" + secondsConvertedTwoSplitThree;
		System.out.println("Split Three: " + convertedSplitThreeRunnerTwo);

		// Total//
		minutesRunnerTwoTotal = Integer.parseInt(runnerTwoTotal.split(":")[0]);
		secondsRunnerTwoTotal = Double.parseDouble(runnerTwoTotal.split(":")[1]);
		String secondsConvertedRunnerTwoTotal = secondsFormatter.format(secondsRunnerTwoTotal);
		String convertedTotalRunnerTwo = minutesRunnerTwoTotal + ":" + secondsConvertedRunnerTwoTotal;
		System.out.println("Total: " + convertedTotalRunnerTwo);

		// Runner Three//

		System.out.print("Please enter your first and last name: ");
		String runnerThreeName = pegasus.nextLine();
		String FirstNameThree = runnerThreeName.split(" ")[0];
		String LastNameThree = runnerThreeName.split(" ")[1];

		System.out.println(FirstNameThree + ", please enter your Mile One Time (mm:ss.ss): ");
		String runnerThreeTimeOne = pegasus.nextLine();
		int minutesThree = Integer.parseInt(runnerThreeTimeOne.split(":")[0]);
		double secondsThree = Double.parseDouble(runnerThreeTimeOne.split(":")[1]);

		System.out.println(FirstNameThree + ", please enter your time to the end of the second mile (mm:ss.ss): ");
		String runnerThreeTimeTwo = pegasus.nextLine();
		int minutesRunnerThreeTimeTwo = Integer.parseInt(runnerThreeTimeTwo.split(":")[0]);
		double secondsRunnerThreeTimeTwo = Double.parseDouble(runnerThreeTimeTwo.split(":")[1]);

		System.out.println(FirstNameThree + ", please enter your time to the end of the 5km (mm:ss.ss): ");
		String runnerThreeTotal = pegasus.nextLine();
		int minutesRunnerThreeTotal = Integer.parseInt(runnerThreeTotal.split(":")[0]);
		double secondsRunnerThreeTotal = Double.parseDouble(runnerThreeTotal.split(":")[1]);

		System.out.println("");
		System.out.println("Runner Three Summary\n******************\n ");
		System.out.println("Runner: " + runnerThreeName);

		// Split 1//
		int minutesSplitOneRunnerThree = Integer.parseInt(runnerThreeTimeOne.split(":")[0]);
		double secondsSplitOneRunnerThree = Double.parseDouble(runnerThreeTimeOne.split(":")[1]);
		double timeOneRunnerThree = minutesThree * SECONDS_PER_MINUTES + secondsThree;

		minutesSplitOneRunnerThree = (int) (timeOneRunnerThree / SECONDS_PER_MINUTES);
		secondsSplitOneRunnerThree = timeOneRunnerThree % SECONDS_PER_MINUTES;

		String secondsConvertedThreeSplitOne = secondsFormatter.format(secondsSplitOneRunnerThree);
		String convertedSplitOneRunnerThree = minutesSplitOneRunnerThree + ":" + secondsConvertedThreeSplitOne;
		System.out.println("Split One: " + convertedSplitOneRunnerThree);

		// Split 2//
		int minutesSplitTwoRunnerThree = Integer.parseInt(runnerThreeTimeTwo.split(":")[0]);
		double secondsSplitTwoRunnerThree = Double.parseDouble(runnerThreeTimeTwo.split(":")[1]);
		double timeTwoRunnerThree = minutesRunnerThreeTimeTwo * SECONDS_PER_MINUTES + secondsRunnerThreeTimeTwo;

		double splitTwoRunnerThree = (timeTwoRunnerThree - timeOneRunnerThree);
		minutesSplitTwoRunnerThree = (int) (splitTwoRunnerThree / SECONDS_PER_MINUTES);
		secondsSplitTwoRunnerThree = splitTwoRunnerThree % SECONDS_PER_MINUTES;

		String secondsConvertedThreeSplitTwo = secondsFormatter.format(secondsSplitTwoRunnerThree);
		String convertedSplitTwoRunnerThree = minutesSplitTwoRunnerThree + ":" + secondsConvertedThreeSplitTwo;
		System.out.println("Split Two: " + convertedSplitTwoRunnerThree);

		// Split 3//
		double timeTotalRunnerThree = minutesRunnerThreeTotal * SECONDS_PER_MINUTES + secondsRunnerThreeTotal;
		double splitThreeRunnerThree = (timeTotalRunnerThree - timeTwoRunnerThree);
		int minutesRunnerThreeSplitThree = (int) splitThreeRunnerThree / SECONDS_PER_MINUTES;
		double secondsRunnerThreeSplitThree = splitThreeRunnerThree % SECONDS_PER_MINUTES;

		String secondsConvertedThreeSplitThree = secondsFormatter.format(secondsRunnerThreeSplitThree);
		String convertedSplitThreeRunnerThree = minutesRunnerThreeSplitThree + ":" + secondsConvertedThreeSplitThree;
		System.out.println("Split Three: " + convertedSplitThreeRunnerThree);

		// Total//
		minutesRunnerThreeTotal = Integer.parseInt(runnerThreeTotal.split(":")[0]);
		secondsRunnerThreeTotal = Double.parseDouble(runnerThreeTotal.split(":")[1]);
		String secondsConvertedRunnerThreeTotal = secondsFormatter.format(secondsRunnerThreeTotal);
		String convertedTotalRunnerThree = minutesRunnerThreeTotal + ":" + secondsConvertedRunnerThreeTotal;
		System.out.println("Total: " + convertedTotalRunnerThree);

		// Runner Four//

		System.out.print("Please enter your first and last name: ");
		String runnerFourName = pegasus.nextLine();
		String FirstNameFour = runnerFourName.split(" ")[0];
		String LastNameFour = runnerFourName.split(" ")[1];

		System.out.println(FirstNameFour + ", please enter your Mile One Time (mm:ss.ss): ");
		String runnerFourTimeOne = pegasus.nextLine();
		int minutesFour = Integer.parseInt(runnerFourTimeOne.split(":")[0]);
		double secondsFour = Double.parseDouble(runnerFourTimeOne.split(":")[1]);

		System.out.println(FirstNameFour + ", please enter your time to the end of the second mile (mm:ss.ss): ");
		String runnerFourTimeTwo = pegasus.nextLine();
		int minutesRunnerFourTimeTwo = Integer.parseInt(runnerFourTimeTwo.split(":")[0]);
		double secondsRunnerFourTimeTwo = Double.parseDouble(runnerFourTimeTwo.split(":")[1]);

		System.out.println(FirstNameFour + ", please enter your time to the end of the 5km (mm:ss.ss): ");
		String runnerFourTotal = pegasus.nextLine();
		int minutesRunnerFourTotal = Integer.parseInt(runnerFourTotal.split(":")[0]);
		double secondsRunnerFourTotal = Double.parseDouble(runnerFourTotal.split(":")[1]);

		System.out.println("");
		System.out.println("Runner Four Summary\n******************\n ");
		System.out.println("Runner: " + runnerFourName);

		// Split 1//
		int minutesSplitOneRunnerFour = Integer.parseInt(runnerFourTimeOne.split(":")[0]);
		double secondsSplitOneRunnerFour = Double.parseDouble(runnerFourTimeOne.split(":")[1]);
		double timeOneRunnerFour = minutesFour * SECONDS_PER_MINUTES + secondsFour;

		minutesSplitOneRunnerFour = (int) (timeOneRunnerFour / SECONDS_PER_MINUTES);
		secondsSplitOneRunnerFour = timeOneRunnerFour % SECONDS_PER_MINUTES;

		String secondsConvertedFourSplitOne = secondsFormatter.format(secondsSplitOneRunnerFour);
		String convertedSplitOneRunnerFour = minutesSplitOneRunnerFour + ":" + secondsConvertedFourSplitOne;
		System.out.println("Split One: " + convertedSplitOneRunnerFour);

		// Split 2//
		int minutesSplitTwoRunnerFour = Integer.parseInt(runnerFourTimeTwo.split(":")[0]);
		double secondsSplitTwoRunnerFour = Double.parseDouble(runnerFourTimeTwo.split(":")[1]);
		double timeTwoRunnerFour = minutesRunnerFourTimeTwo * SECONDS_PER_MINUTES + secondsRunnerFourTimeTwo;

		double splitTwoRunnerFour = (timeTwoRunnerFour - timeOneRunnerFour);
		minutesSplitTwoRunnerFour = (int) (splitTwoRunnerFour / SECONDS_PER_MINUTES);
		secondsSplitTwoRunnerFour = splitTwoRunnerFour % SECONDS_PER_MINUTES;

		String secondsConvertedFourSplitTwo = secondsFormatter.format(secondsSplitTwoRunnerFour);
		String convertedSplitTwoRunnerFour = minutesSplitTwoRunnerFour + ":" + secondsConvertedFourSplitTwo;
		System.out.println("Split Two: " + convertedSplitTwoRunnerFour);

		// Split 3//
		double timeTotalRunnerFour = minutesRunnerFourTotal * SECONDS_PER_MINUTES + secondsRunnerFourTotal;
		double splitThreeRunnerFour = (timeTotalRunnerFour - timeTwoRunnerFour);
		int minutesRunnerFourSplitThree = (int) splitThreeRunnerFour / SECONDS_PER_MINUTES;
		double secondsRunnerFourSplitThree = splitThreeRunnerFour % SECONDS_PER_MINUTES;

		String secondsConvertedFourSplitThree = secondsFormatter.format(secondsRunnerFourSplitThree);
		String convertedSplitThreeRunnerFour = minutesRunnerFourSplitThree + ":" + secondsConvertedFourSplitThree;
		System.out.println("Split Three: " + convertedSplitThreeRunnerFour);

		// Total//
		minutesRunnerFourTotal = Integer.parseInt(runnerFourTotal.split(":")[0]);
		secondsRunnerFourTotal = Double.parseDouble(runnerFourTotal.split(":")[1]);
		String secondsConvertedRunnerFourTotal = secondsFormatter.format(secondsRunnerFourTotal);
		String convertedTotalRunnerFour = minutesRunnerFourTotal + ":" + secondsConvertedRunnerFourTotal;
		System.out.println("Total: " + convertedTotalRunnerFour);

		// Runner Five//

		System.out.print("Please enter your first and last name: ");
		String runnerFiveName = pegasus.nextLine();
		String FirstNameFive = runnerFiveName.split(" ")[0];
		String LastNameFive = runnerFiveName.split(" ")[1];

		System.out.println(FirstNameFive + ", please enter your Mile One Time (mm:ss.ss): ");
		String runnerFiveTimeOne = pegasus.nextLine();
		int minutesFive = Integer.parseInt(runnerFiveTimeOne.split(":")[0]);
		double secondsFive = Double.parseDouble(runnerFiveTimeOne.split(":")[1]);

		System.out.println(FirstNameFive + ", please enter your time to the end of the second mile (mm:ss.ss): ");
		String runnerFiveTimeTwo = pegasus.nextLine();
		int minutesRunnerFiveTimeTwo = Integer.parseInt(runnerFiveTimeTwo.split(":")[0]);
		double secondsRunnerFiveTimeTwo = Double.parseDouble(runnerFiveTimeTwo.split(":")[1]);

		System.out.println(FirstNameFive + ", please enter your time to the end of the 5km (mm:ss.ss): ");
		String runnerFiveTotal = pegasus.nextLine();
		int minutesRunnerFiveTotal = Integer.parseInt(runnerFiveTotal.split(":")[0]);
		double secondsRunnerFiveTotal = Double.parseDouble(runnerFiveTotal.split(":")[1]);

		System.out.println("");
		System.out.println("Runner Five Summary\n******************\n ");
		System.out.println("Runner: " + runnerFiveName);

		// Split 1//
		int minutesSplitOneRunnerFive = Integer.parseInt(runnerFiveTimeOne.split(":")[0]);
		double secondsSplitOneRunnerFive = Double.parseDouble(runnerFiveTimeOne.split(":")[1]);
		double timeOneRunnerFive = minutesFive * SECONDS_PER_MINUTES + secondsFive;

		minutesSplitOneRunnerFive = (int) (timeOneRunnerFive / SECONDS_PER_MINUTES);
		secondsSplitOneRunnerFive = timeOneRunnerFive % SECONDS_PER_MINUTES;

		String secondsConvertedFiveSplitOne = secondsFormatter.format(secondsSplitOneRunnerFive);
		String convertedSplitOneRunnerFive = minutesSplitOneRunnerFive + ":" + secondsConvertedFiveSplitOne;
		System.out.println("Split One: " + convertedSplitOneRunnerFive);

		// Split 2//
		int minutesSplitTwoRunnerFive = Integer.parseInt(runnerFiveTimeTwo.split(":")[0]);
		double secondsSplitTwoRunnerFive = Double.parseDouble(runnerFiveTimeTwo.split(":")[1]);
		double timeTwoRunnerFive = minutesRunnerFiveTimeTwo * SECONDS_PER_MINUTES + secondsRunnerFiveTimeTwo;

		double splitTwoRunnerFive = (timeTwoRunnerFive - timeOneRunnerFive);
		minutesSplitTwoRunnerFive = (int) (splitTwoRunnerFive / SECONDS_PER_MINUTES);
		secondsSplitTwoRunnerFive = splitTwoRunnerFive % SECONDS_PER_MINUTES;

		String secondsConvertedFiveSplitTwo = secondsFormatter.format(secondsSplitTwoRunnerFive);
		String convertedSplitTwoRunnerFive = minutesSplitTwoRunnerFive + ":" + secondsConvertedFiveSplitTwo;
		System.out.println("Split Two: " + convertedSplitTwoRunnerFive);

		// Split 3//
		double timeTotalRunnerFive = minutesRunnerFiveTotal * SECONDS_PER_MINUTES + secondsRunnerFiveTotal;
		double splitThreeRunnerFive = (timeTotalRunnerFive - timeTwoRunnerFive);
		int minutesRunnerFiveSplitThree = (int) splitThreeRunnerFive / SECONDS_PER_MINUTES;
		double secondsRunnerFiveSplitThree = splitThreeRunnerFive % SECONDS_PER_MINUTES;

		String secondsConvertedFiveSplitThree = secondsFormatter.format(secondsRunnerFiveSplitThree);
		String convertedSplitThreeRunnerFive = minutesRunnerFiveSplitThree + ":" + secondsConvertedFiveSplitThree;
		System.out.println("Split Three: " + convertedSplitThreeRunnerFive);

		// Total//
		minutesRunnerFiveTotal = Integer.parseInt(runnerFiveTotal.split(":")[0]);
		secondsRunnerFiveTotal = Double.parseDouble(runnerFiveTotal.split(":")[1]);
		String secondsConvertedRunnerFiveTotal = secondsFormatter.format(secondsRunnerFiveTotal);
		String convertedTotalRunnerFive = minutesRunnerFiveTotal + ":" + secondsConvertedRunnerFiveTotal;
		System.out.println("Total: " + convertedTotalRunnerFive);

		System.out.println("\n");
		
		//// CHART////

		String headerName = "Name of Runner";
		String headerSplitOne = "Split One";
		String headerSplitTwo = "Split Two";
		String headerSplitThree = "Split Three";
		String headerTotal = "Total Time";

		System.out.printf("%-20s %-20s %-20s %-20s %-20s", headerName, headerSplitOne, headerSplitTwo, headerSplitThree,
				headerTotal);
		System.out.println("\n");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s", runnerOneName, convertedSplitOneRunnerOne,
				convertedSplitTwoRunnerOne, convertedSplitThreeRunnerOne, convertedTotalRunnerOne);
		System.out.println("\n");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s", runnerTwoName, convertedSplitOneRunnerTwo,
				convertedSplitTwoRunnerTwo, convertedSplitThreeRunnerTwo, convertedTotalRunnerTwo);
		System.out.println("\n");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s", runnerThreeName, convertedSplitOneRunnerThree,
				convertedSplitTwoRunnerThree, convertedSplitThreeRunnerThree, convertedTotalRunnerThree);
		System.out.println("\n");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s", runnerFourName, convertedSplitOneRunnerFour,
				convertedSplitTwoRunnerFour, convertedSplitThreeRunnerFour, convertedTotalRunnerFour);
		System.out.println("\n");
		System.out.printf("%-20s %-20s %-20s %-20s %-20s", runnerFiveName, convertedSplitOneRunnerFive,
				convertedSplitTwoRunnerFive, convertedSplitThreeRunnerFive, convertedTotalRunnerFive);

		pegasus.close();
	}

}
