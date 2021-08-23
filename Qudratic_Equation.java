package day_5_practice_problems.functional_problems;

import java.util.Scanner;

public class Qudratic_Equation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a value");
			int a = scanner.nextInt();
			System.out.println("Enter b value");
			int b = scanner.nextInt();
			System.out.println("Enter c value");
			int c = scanner.nextInt();
			
			Equation(a,b,c);
		}catch(Exception e){
			System.out.println("Enter correct values");
		}
		scanner.close();
	}
	
	static void Equation(int a, int b, int c) {
		
		int delta = Math.abs(b*b - 4*a*c);
		double Root1 = (-b + Math.sqrt(delta))/(2*a);
		double Root2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Roots of Qudratic Equation are: "+Root1 +"," + Root2);
		
	}

}
