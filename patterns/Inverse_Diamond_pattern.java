// Java Code to print 
// the inverse diamond shape 

import java.util.*; 

class GFG { 

	// Function to Print Inverse Diamond pattern 
	// with 2n-1 rows 
	static void printDiamond(int n) 
	{ 
		System.out.println(); 

		int i, j = 0; 

		// for top half 
		for (i = 0; i < n; i++) { 

			// for left * 
			for (j = i; j < n; j++) 
				System.out.print("*"); 

			// for middle " " 
			for (j = 0; j < 2 * i + 1; j++) 
				System.out.print(" "); 

			// for right * 
			for (j = i; j < n; j++) 
				System.out.print("*"); 

			System.out.println(); 
		} 

		// for below half 
		for (i = 0; i < n - 1; i++) { 

			// for left * 
			for (j = 0; j < i + 2; j++) 
				System.out.print("*"); 

			// for middle " " 
			for (j = 0; j < 2 * (n - 1 - i) - 1; j++) 
				System.out.print(" "); 

			// for right * 
			for (j = 0; j < i + 2; j++) 
				System.out.print("*"); 

			System.out.println(); 
		} 

		System.out.println(); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 

		// Define n 
		int n = 3; 
		System.out.println("Inverse Diamond Pattern for n = " + n); 
		printDiamond(n); 

		n = 7; 
		System.out.println("\nInverse Diamond Pattern for n = " + n); 
		printDiamond(n); 
	} 
} 
