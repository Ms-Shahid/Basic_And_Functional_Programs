package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		
		System.out.println("Enter the First_Number ");
		Scanner scanner1 = new Scanner(System.in);
		int num1 = scanner1.nextInt();
		
		System.out.println("Enter the Second_Number ");
		Scanner scanner2 = new Scanner(System.in);
		int num2 = scanner2.nextInt();
		
		System.out.println("Enter the Third_Number ");
		Scanner scanner3 = new Scanner(System.in);
		int num3 = scanner3.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the Largest Number Among the " + num2 + "," + num3 );
		}else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the Largest Number Among the " + num1 + "," + num3 );
		}else {
			System.out.println(num3 + " is the Largest Number Among the " + num1 + "," + num2);
		}
		scanner1.close();
		scanner2.close();
		scanner3.close();
	}

}
