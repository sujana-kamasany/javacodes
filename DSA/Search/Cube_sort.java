// Java program for the above approach
import java.util.*;
class GFG {

// Function to sort the cubes of array
static void sortArr(int arr[], int n)
{
	Integer[] ar = new Integer[n];

	for (int i = 0; i < n; i++)
		ar[i] = arr[i];

	// Sort the array
	Arrays.sort(ar, new Comparator<Integer>()
	{
		public int compare(Integer a, Integer b)
		{
			int x = (int)Math.pow(a, 3);
			int y = (int)Math.pow(b, 3);
			return (x < y) ? -1 : 1;
		}
	});

	// Print the array
	for (int i = 0; i < n; i++)
	{
		System.out.print(ar[i] + " ");
	}
}

// Driver code
public static void main(String[] args)
{
	// Given array
	int arr[] = { 4, -1, 0, -5, 6 };
	int n = arr.length;

	// Function Call
	sortArr(arr, n);
}
}
