package assignment4_IfAndSwitch_Statements;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * The date June 10, 1960, is special because when we write it in the following
		 * format, the month times the day equals the year: 6/10/60
		 * 
		 * Write a Java program that lets the user declare a month (in numeric form), a
		 * day, and a two-digit year. The program should then determine whether the
		 * month times the day is equal to the year. If so, it should display a message
		 * saying the date is magic. Otherwise, it should display a message saying the
		 * date is not magic.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you month:");
		int month = scan.nextInt();

		System.out.println("Enter your day:");
		int day = scan.nextInt();

		System.out.println("Enter your year in two digit");
		int year = scan.nextInt();

		if (month * day == year) {
			System.out.println("date is magic");
		} else {
			System.out.println("date is not magic");
		}

	}
}
