package day_5_practice_problems.functional_problems;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter the temperature in fahreinheit : ");
			double fahreinheit = scanner.nextInt();
			
			System.out.println("Enter the wind speed in miles per hour : ");
			double windspeed = scanner.nextInt();
			
			if (Math.abs(fahreinheit) > 50 || windspeed > 120 || windspeed < 3) {
				System.out.println("enter correct input");
			} else {
				WindChill(fahreinheit, windspeed);
			}
		} catch (Exception e) {
			System.out.println("enter proper values");
		}
		scanner.close();
			
		}
	
	static void WindChill(double fahreinheit, double windspeed) {
		
		double w = 35.74 + 0.62158 * fahreinheit + (0.4275 * fahreinheit - 35.75) * Math.pow(windspeed, 0.16);
		System.out.println("Windchill is : " + w);
	}

}
