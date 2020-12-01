package assignment4_IfAndSwitch_Statements;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to calculate the monthly telephone bills as per the
		 * following rule: Minimum $200 for up to 100 calls. Plus $0.60 per call for the
		 * next 50 calls. Plus $0.50 per call for the next 50 calls. Plus $0.40 per call
		 * for any call beyond 200 calls.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your calls:");
		int calls = scan.nextInt();

		double bill = 200;

		if (calls <= 100) {
			bill = 200;
		} else if (calls > 100 && calls <= 150) {

			calls -= 100;
			bill += (0.60 * calls);

		} else if (calls > 150 && calls <= 200) {

			calls -= 150;
			bill += (0.60 * 50) + (0.50 * calls);

		} else {

			calls -= 200;
			bill += (0.60 * 50) + (0.50 * 50) + (0.40 * calls);
		}
		System.out.println("Your bill is " + bill);
	}
}
