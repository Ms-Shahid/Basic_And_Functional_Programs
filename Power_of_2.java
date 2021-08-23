package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class Power_of_2 {

	public static void main(String[] args) {
		System.out.println("Enter the Power of N : " );
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int power = 2^input;
		while (input <= power) {
			double pow = Math.pow(2,input);
			System.out.println("2 " +"Power "+ input + " is " + (int) pow);
			input--;
			if (input == 0){
				break;
			}
		}
		scanner.close();
	}

}
