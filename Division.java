package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		System.out.println("Enter the divident to compute Quotient");
		Scanner scannerQ = new Scanner(System.in);
		
		int quo = scannerQ.nextInt();
		System.out.println("Enter the divisor to compute Remainder"); 
		Scanner scannerR = new Scanner(System.in);
		int rem = scannerR.nextInt();
		
		double Quotient = quo/rem;
		int Remainder = quo%rem;
		
		System.out.println("Quotient is " + Quotient);
		System.out.println("Remainder is " + Remainder);
		
		scannerQ.close();
		scannerR.close();
	}

}
