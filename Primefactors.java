package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class Primefactors {

	public static void main(String[] args) {
		System.out.println("Enter the Number to find Prime factors : ");

		Scanner scanner = new Scanner(System.in);
		int prime = scanner.nextInt();
		if (prime == 1) {
			System.out.println(prime +" is Not a prime Number ");
		}
		else {
			for(int i=2;i*i<=prime;i++) {
				while (prime%i == 0) {
					System.out.println(i);
					prime = prime/i;
					}
				}
			if(prime > 2) {
				System.out.println(prime);
			}
		}
		scanner.close();
	}
}
