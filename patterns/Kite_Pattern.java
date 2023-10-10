// Java Program to print Kite Pattern 
import java.io.*; 

class GFG 
{ 
public static void main(String[] args) 
{ 

	int i, j, k, sp, space = 4; 
	char prt = '$'; 

	for (i = 1; i <= 5; i++) 
	{ 

		// For printing the space 
		for (sp = space; sp >= 1; sp--) 
		{ 
			System.out.print(" "); 
		} 

		// For printing the $ 
		for (j = 1; j <= i; j++) 
		{ 
			System.out.print(prt); 
		} 

		for (k = 1; k <= (i - 1); k++) 
		{ 
			if (i == 1) 
			{ 
				continue; 
			} 

			System.out.print(prt); 
		} 
		System.out.println(); 
		space--; 
	} 

	space = 1; 

	for (i = 4; i >= 1; i--) 
	{ 
		for (sp = space; sp >= 1; sp--) 
		{ 
			System.out.print(" "); 
		} 

		for (j = 1; j <= i; j++) 
		{ 
		System.out.print(prt); 
		} 

		for (k = 1; k <= (i - 1); k++) 
		{ 
			System.out.print(prt); 
		} 

		space++; 
		System.out.println(); 
	} 

	space = 3; 

	for (i = 2; i <= 5; i++) 
	{ 
		if ((i % 2) != 0) 
		{ 
			for (sp = space; sp >= 1; sp--) 
			{ 
				System.out.print(" "); 
			} 

			for (j = 1; j <= i; j++) 
			{ 
				System.out.print(prt); 
			} 
		} 

		if ((i % 2) != 0) 
		{ 
			System.out.println(); 
			space--; 
		} 
	} 
} 
} 

// This code is contributed by inder_verma.. 
