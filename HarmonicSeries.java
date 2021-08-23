package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		System.out.println("Enter the Number of Harmonics : ");
		
		Scanner scanner = new Scanner(System.in);
		int harmonics = scanner.nextInt();
		double sum = 0.0;
		for(int count=1;count<=harmonics;count++) {
			sum += 1.0/count;	
		}
		System.out.println("Harmonics series is : " + sum);
		scanner.close();
	}
}
