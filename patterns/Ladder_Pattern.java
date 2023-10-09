// Java program to print the ladder pattern 
class GFG 
{ 

// Function to print the desired ladder Pattern 
static void ladder_pattern(int N) 
{ 

	for (int i = 0; i <= N; i++) 
	{ 
		
		// Printing the sub-pattern 1 
		// N+1 times 
		System.out.println("* *"); 
		System.out.println("* *"); 

		if (i < N) 
		{ 
			// Printing the sub-pattern 2 
			// N times 
			System.out.println("*****" ); 
		} 
	} 
} 

// Driver Code 
public static void main(String args[]) 
{ 
	// Size of the Pattern 
	int N = 3; 

	// Print the ladder 
	ladder_pattern(N); 
} 
} 

// This code is contributed by Rajput Ji 
