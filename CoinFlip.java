package day5_practice_programs.basicproblems;

import java.util.Scanner;

public class CoinFlip {

	public static void main(String[] args) {
		int count = 0;
		int head = 0, tail = 0;
		float Head_Percent, Tail_Percent;
		//Taking input from user
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Number to flip a coin : ");
		float coin = in.nextFloat();
		while (count <= coin){
			int rand = (int)Math.floor(Math.random() * 10) % 3;
			switch(rand) {
			case 0: System.out.println("Head Wins");head++;count++;break;
			case 1: System.out.println("Tail Wins");tail++;count++;break;
			default:count++;
			}
		System.out.println("Number of Heads " + head);
		System.out.println("Number of tails " + tail);
		
		Head_Percent = (float) ((head/coin)*100);
		Tail_Percent = (float) ((tail/coin)*100);
		System.out.println("Percentage of Heads is " + Head_Percent + "%");
		System.out.println("Percentage of Tail is " + Tail_Percent + "%");
		System.out.println("--------------------------------");
		in.close();
		}

	}
}
