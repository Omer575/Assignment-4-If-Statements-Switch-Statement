package assignment4_IfAndSwitch_Statements;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Any year is input by the user. Write a program to determine whether the year
		 * is a leap year or not. Leap Years are any year that can be evenly divided by
		 * 4. A year that is evenly divisible by 100 is a leap year only if it is also
		 * evenly divisible by 400.
		 * 
		 * Example : 1992 Leap Year 2000 Leap Year 1900 NOT a Leap Year
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a year:");
		int year = scan.nextInt();

		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}

		if (leap) {
			System.out.println(year + " Leap Year");
		} else {
			System.out.println(year + " Not Leap Year");
		}
	}
}
