package day_5_practice_problems.functional_problems;

import java.io.PrintWriter;
import java.util.Scanner;


public class Two_Dimensional_Array {
	
	 static Scanner scanner = new Scanner(System.in);
	
	public static int[][] intArray(int m, int n){
		int arr_int[][] = new int[m][n];
		System.out.println();
		System.out.println("Integer 2D Array ");
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr_int[i][j]  = scanner.nextInt();			
		}
	}
	return arr_int;

	}
	
	public static double[][] doubleArray(int m, int n){
		double arr_double[][]  = new double[m][n];
		System.out.println();
		System.out.println("Double 2D Array");
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr_double[i][j]  =scanner.nextDouble();			
			}
		}
	return arr_double;
	}
	
	public static String[][] booleanArray(int m, int n){
		String[][] arr_bool  = new String[m][n];
		System.out.println();
		System.out.println("Boolean 2DArray");
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr_bool[i][j]  =scanner.nextLine();			
			}
		}
	return arr_bool;
	
	}
	
	public static void DisplayArrays(int[][] arr_int, double [][] arr_double,String[][] arr_bool, int m, int n) {
		PrintWriter write = new PrintWriter(System.out,true);
		
		//displaying the integer Array
		System.out.println();
		write.println("2D Interger Array");
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				write.print("\t" + arr_int[i][j] + " ");
			}
			write.println("\t");
		}
		
		//displaying the double Array
		System.out.println();
		write.println("2D Double Array");
		
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				write.print(arr_double[i][j] + " ");
			}
			write.println("\t");
		}
		
		//displaying the boolean Array
				System.out.println();
				write.println("2D boolean Array");
				
				for (int i=0;i<m;i++) {
					for(int j=0;j<n;j++) {
						write.print(arr_bool[i][j] + " ");
					}
					write.println("\t");
			}
	}
	
	<t> void displayArray(t[][] arr_int) {
		PrintWriter pw = new PrintWriter(System.out);

		// display integers
		System.out.println();
		for (int i = 0; i < arr_int.length; i++) {
			for (int j = 0; j < arr_int[i].length; j++) {
				pw.print("\t" + arr_int[i][j] + " ");
			}
			pw.println("\t");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the Number of Rows: ");
		int m = scanner.nextInt();
		
		System.out.println("Enter the Number of columns: ");
		int n = scanner.nextInt();
		
		//Calling Functions
		int [][] arr_int = intArray(m,n);
		double [][] arr_double = doubleArray(m,n);
		String [][] bool_arr = booleanArray(m,n);
		
		//calling display functions
		DisplayArrays(arr_int,arr_double,bool_arr,m,n);
		
	}
	
	

}
	
		

