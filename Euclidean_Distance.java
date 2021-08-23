package day_5_practice_problems.functional_problems;

import java.util.Scanner;

public class Euclidean_Distance {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the or-ordinates :");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		Euclidean(x,y);
		scanner.close();
	}
	
	static void Euclidean(int x, int y) {
		
		double distance;
		distance = Math.sqrt(Math.pow(x, x)+ Math.pow(y, y));
		System.out.println("Euclidean distance is : "+distance);
			
	}
	
}
