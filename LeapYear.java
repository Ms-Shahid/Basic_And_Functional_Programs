package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year : ");
		Scanner yr = new Scanner(System.in);
		int year = yr.nextInt();
		
		if ( (year%4) == 0 || (year % 400 == 0) ) {	
			System.out.println(year + " is a leap year");
		}
		else if( (year % 100) == 0) {
			System.out.println(year + " is a not leap year");
		}
		else {
			System.out.println(year + " is a not leap year");
		}
		yr.close();
	}
}
