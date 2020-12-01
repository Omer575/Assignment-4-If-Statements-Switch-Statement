package assignment4_IfAndSwitch_Statements;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		/*
		 * The body mass index (BMI) is used to estimate the risk of weight-related
		 * problems based on a subject's height and mass. It was designed by the
		 * mathematician Adolphe Quetelet in the 1800s and is sometimes referred to as
		 * the Quetelet index. The BMI is computed as:
		 * 
		 * BMI = mass / (height * height)
		 * 
		 * In this formula, mass is in kilograms and height is in meters. The health
		 * risk associated with a BMI value is
		 * 
		 * - Underweight<18.5
		 * 
		 * - Normal Weight>=18.5 and <25
		 * 
		 * - Overweight>=25 and <30
		 * 
		 * - Obese>=30
		 * 
		 * In this case study, the users input their weight in pounds and height in feet
		 * and inches. The program then outputs the BMI and associated health risk. To
		 * do this we must first make our program convert from pounds to kilograms. One
		 * kilogram is 2.2 pounds. Additionally, the program must convert height in feet
		 * and inches to meters. If we convert the height to all inches, then we can
		 * multiply by 0.0254 to convert inches to meters.
		 * 
		 * Sample Output:
		 * 
		 * Your weight in pounds: 150
		 * 
		 * Your height in feet followed by a space then additional inches: 5 5
		 * 
		 * Your BMI is 25.01349811736
		 * 
		 * Your risk factory is Overweight
		 */

		Scanner scan = new Scanner(System.in);

		System.out.print("You weight in pounds:");
		int weight = scan.nextInt();

		System.out.print("Your height in feet and inches:");
		double height = scan.nextFloat();

		double lbsInKg = weight / 2.2046; // lbs to kg

		double feetInInch = height * 12; // all the inches

		double heightInchToMeter = feetInInch * 0.0254; // all the meters

		double bmi = lbsInKg / (heightInchToMeter * heightInchToMeter);

		System.out.println("Your BMI is " + bmi);

		if (bmi < 18.5) {
			System.out.println("Your risk factory Underweight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normal Weight");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}

	}
}
