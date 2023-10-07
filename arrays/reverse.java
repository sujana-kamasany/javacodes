import java.util.Arrays;
import java.util.Scanner;

public class reverse {
  
  // method to reverse an array using another array
  public static int[] reverse(int[] realArr) {
    // declare variables
    int size = 0;
    int reverseArr[] = null;
    
    // find length of the given array
    size = realArr.length;
    
    // temporary array of the same size
    reverseArr = new int[size];
    
    // find reverse and store to temporary array
    // initialize iterator variables
    int i = 0;
    int j = size-1;
    
    while(i < size) {
      // assign element
      reverseArr[i] = realArr[j];
      
      // update iterator variables
      i++;
      j--;
    }
        
    // return result 
    return reverseArr;
  }

  public static void main(String[] args) {
    // declare variables
    Scanner scan = null;
    int size = 0;
    int numbers[] = null;
    int rev[] = null;
    
    // create Scanner class object to take input
    scan = new Scanner(System.in);
    
    // read array size
    System.out.print("Enter array size: ");
    size = scan.nextInt();
    
    // assign length to array
    numbers = new int[size];
    
    // read array elements 
    System.out.println("Enter array elements: ");
    for(int i=0; i<size; i++) {
      numbers[i] = scan.nextInt();
    }
    
    // find reverse and store to rev
    rev = reverse(numbers);
    
    // display reverse of the array
    System.out.println("Reverse = " + Arrays.toString(rev));
    
    // close Scanner 
    scan.close();
  }
}
