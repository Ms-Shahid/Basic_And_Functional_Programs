package day_5_practice_problems.functional_problems;

import java.util.Scanner;

public class Sum_of_Three_Numbers {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter no. of inputs");
		int n = scanner.nextInt();
		Calculate(n);
	}
	
	static void Calculate(int n) {
		int[] arr_sum = new int[n];
		int count =0;
		
		System.out.println("Enter the Numbers :");
		for (int i=0;i<n;i++) {
			arr_sum[i] = scanner.nextInt();
		}
		
		for(int i=0;i<arr_sum.length;i++) {
			for(int j=i;j<arr_sum.length;j++) {
				for(int k=j+1;k<arr_sum.length;k++) {
					if(arr_sum[i] + arr_sum[j] + arr_sum[k]==0) {
						count++;
						System.out.println(arr_sum[i] + "+" + arr_sum[j] + "+" + arr_sum[k]+ "=" + "0");
					}
				}
			}
		}
		System.out.println("Total pairs of numbers evaluate to 0 are :"+ count);
	}

}
