import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /* Lowest Common Multiple : smallest number that is divisible by two numbers.
         *
         * EXAMPLE : 18 and 36
         * 2 * 3 * 3 = 18
         * 2 * 2 * 3 * 3 = 36
         * common factors = 2 * 2 * 3 * 3 = 36
         * LCM = 36
         * */

        // Declare two integer variables to store input values
        int number1;
        int number2;

        // Create a Scanner object to read input from user
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter first number and read input
        System.out.println("Enter first number : ");
        number1 = scan.nextInt();

        // Prompt user to enter second number and read input
        System.out.println("Enter second number : ");
        number2 = scan.nextInt();

        // Initialize lcm variable to the maximum of the two input numbers
        int lcm = Math.max(number1, number2);

        // Loop until the LCM is found
        while (true) {
            // Check if lcm is divisible by both numbers
            if (lcm % number1 == 0 && lcm % number2 == 0) {
            // If lcm is found, print it and exit the loop
                System.out.println("LCM = "+ lcm);
                break;
            }
            // If lcm is not found, increment it and continue looping
            ++lcm;
        }



    }
}