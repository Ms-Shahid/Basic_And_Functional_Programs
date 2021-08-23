package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		System.out.println("Enter the Number : ");
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number%2 ==0) {
			System.out.println(number + " is an Even Number");
		}else
		{
			System.out.println(number + " is an Odd Number");
		}
		scanner.close();
	}

}
