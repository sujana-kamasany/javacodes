import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        
        // nextInt() reads the first integer from the keyboard
        int number = reader.nextInt();

        // Check if number is negative
        if (number < 0) {
            System.out.println("Number cannot be negative");
        }
        else {
            // Declaring a variable to hold factorial annd calling the function
            int result = factorial(number);
            // println() prints the result  to the output screen
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }

    // Recursive method to calculate the factorial
    public static int factorial(int n) {
        if (n > 0) {
            return (n * (factorial(n - 1)));
        }
        else {
            return 1;
        }
    }
}