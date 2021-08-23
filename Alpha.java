package day5_practice_programs.basicproblems;
import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		
		System.out.println("Enter a Alphabet ");
		Scanner scanner = new Scanner(System.in);
		char alpha = scanner.next().charAt(0);
		
		if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' || alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O'
                || alpha == 'U') {
            System.out.println(alpha + " is Vowel");
        } else {
            System.out.println(alpha + " is Consonant");
        }
		scanner.close();	
	}

}
