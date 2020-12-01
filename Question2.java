package assignment4_IfAndSwitch_Statements;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Tax Calculator:
		 * 
		 * - Let user enter his income
		 * 
		 * - Calculate the tax amount according to below table
		 * 
		 * - Print the tax amount
		 * 
		 * Income Tax Ratio income ≤150,000,000 %25 income ≤ 300,000,000 %30 income ≤
		 * 600,000,000 %35 income ≤ 1,200,000,000 %40 income > 1,200,000,000 %50 Sample
		 * Output-1
		 * 
		 * Your Income : 1500
		 * 
		 * The tax amount you have to pay : 375.0
		 * 
		 * Sample Output-2
		 * 
		 * Your Income : 1200000
		 * 
		 * The tax amount you have to pay : 300000.0
		 * 
		 * Note: IF Your Income is 200,000,000, your tax will be calculated this way:
		 * %25 for 150,000,000 and %30 for the rest of the amount which is 50,000,000
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your income:");
		double income = scan.nextDouble();

		double tax = 0;

		if (income == 200000000) {
			tax = ((income - 50000000) * 0.25) + ((income - 150000000) * 0.30);

		} else if (income <= 150000000) {
			tax = income * 0.25;
		} else if (income <= 300000000) {
			tax = income * 0.30;
		} else if (income <= 600000000) {
			tax = income * 0.35;
		} else if (income <= 1200000000) {
			tax = income * 0.40;
		} else if (income > 1200000000) {
			tax = income * 0.50;
		}

		System.out.println("The tax you have to pay: " + tax);
	}
}
