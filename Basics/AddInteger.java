import java.util.Scanner;

public class AddInteger {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number 1: ");

        // nextInt() reads the first integer from the keyboard
        int numberOne = reader.nextInt();

        System.out.print("Enter number 2: ");

        // nextInt() reads the second integer from the keyboard
        int numberTwo = reader.nextInt();

        // Declaring a variable to hold the sum of two integers
        long result = numberOne + numberTwo;

        // println() prints the result  to the output screen
        System.out.println("Total is: " + result);
    }
}
