package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int temp;
		System.out.println("Enter the First Number : ");
		Scanner first_scanner = new Scanner(System.in);
		int first_number = first_scanner.nextInt();
		
		System.out.println("Enter the Second Number : ");
		Scanner second_scanner = new Scanner(System.in);
		int second_number = second_scanner.nextInt();
		
		System.out.println("Before Swapping First_Number is "+ first_number);
		System.out.println("Before Swapping Second_Number is "+ second_number);
		
		temp = first_number;
		first_number = second_number;
		second_number = temp;
		
		System.out.println("----------------------------------------------");
		System.out.println("After Swapping First_Number is "+ first_number);
		System.out.println("After Swapping Second_Number is "+ second_number);

		first_scanner.close();
		second_scanner.close();
		
	}

}
