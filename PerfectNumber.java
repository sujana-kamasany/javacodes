import java.util.Scanner;

/*
 * A perfect number is a positive integer that is equal to the sum of its proper divisors.
 * A proper divisor is a positive integer other than the number itself that divides the number evenly.
 * For example, 6 is a perfect number because the sum of its proper divisors, 1, 2, and 3, is equal to 6.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the integer
        int number = sc.nextInt();

        // Check if number is perfect number and print the desired message
        if (isPerfect(number))
            System.out.println(number + " is a perfect number");
        else
            System.out.println(number + " is not a perfect number");
    }

    /**
     * Check if a number is perfect number
     * @param number the number to check
     * @return true if number is perfect number, false otherwise
     */
    public static boolean isPerfect(int number) {
        // Store the sum of proper divisors
        int sum = 0;

        // Find all divisors and add them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Return true if sum is equal to number
        return sum == number;
    }
}
