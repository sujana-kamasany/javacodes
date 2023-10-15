/**
  Automorphic number is a number which of squaring ends with the same number.
  Example : (25)^2 = 625, 625 ends with 25 so its an Automorphic number
*/

import java.util.*; // import the classes of the util package
public class Automorphic_Number {
  public static boolean isAutomorphic(int n) { // this boolean method checks if a number is automorphic or not
    String st = (n*n) + ""; // this string stores the square of the number
    String s = n + ""; // this string stores the number and converts it explicitly
    return st.endsWith(s); // checking if the square of the number ends with the number itself
  }
  
  public static void main(String[] args) { // this is the main() method
    Scanner in = new Scanner(System.in); // scanner class object creation
    System.out.println("Enter a number : ");
    int n = in.nextInt(); // taking a number input from the user

    // checking if the number is automorphic or by invoking the isAutomorphic method!
    if(isAutomorphic(n))
      System.out.println("The number is a automorphic number.");
    else
      System.out.println("The number is not automorphic number.");

    in.close(); // preventing resource leak!!
  }
}
