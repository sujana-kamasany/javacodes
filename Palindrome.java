
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		// *******************************************************************
		// Palindrome.java Reads in a string and prints a message saying whether it
		// is a palindrome.
		// *******************************************************************

		String testString;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string: ");
		testString = scan.nextLine();

		if (palindrome(testString)) {
			System.out.println("It's a palindrome!");
		} else {
			System.out.println("It's not a palindrome.");
		}
	}

	// ----------------------------------------------------------
	// Recursively determines whether s is a palindrome.
	// It is if
	// -- it's 0 or 1 char in length, or
	// -- the first and last letters are the same and the
	// string without those letters is also a palindrome
	// ----------------------------------------------------------

	private static boolean palindrome(String s) {
		if (s.length() == 0 || s.length() == 1) {
			return true;
		}
		if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}

		return palindrome(s.substring(1, s.length() - 1));
	}

	// CREATE A INTEGER length THAT STORES THE LENGTH OF THE STRING PARAMETER s

	// 1) TEST IF length IS GREATER THAN 1 -
	// 2) IF length IS GREATER THAN 1, CHECK IF THE FIRST CHARACTER OF s IS EQUAL TO
	// THE CHARACTER AT length - 1
	// 3) IF THE CHARACTERS ARE EQUAL, TEST THE NEXT SET OF CHARACTERS (MAKE A
	// RECURSIVE
	// CALL AND TEST THE VALUE THAT IS RETURNED)
	// 4) IF NONE OF THESE TEST CASES ARE true, RETURN false
	// (HINT: YOU SHOULD RETURN false 3 TIMES)

}
