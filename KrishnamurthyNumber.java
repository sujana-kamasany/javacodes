import java.util.Scanner;

/*
 * A Krishnamurthy number (or strong number) is a number whose sum of the factorial of digits is equal to the number itself.
 * For example 145, 1! + 4! + 5! = 1 + 24 + 120 = 145.
 */
public class KrishnamurthyNumber {
    public static void main(String[] args) {
        // Initialize the scanner class to take input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter number to check if it is Krishnamurthy or not : ");

        // Take input
        int num = sc.nextInt();

        // Check if number is Krishnamurthy and print the desired message
        if (isKrishnamurthy(num))
            System.out.println("This number is a Krishnamurthy Number");
        else
            System.out.println("This number is not a Krishnamurthy Number");

    }

    /**
     * This method checks if a number is Krishnamurthy or not
     * @param number the number to check
     * @return true if number is Krishnamurthy, false otherwise
     */
    public static boolean isKrishnamurthy(int number) {
        // Store the sum of factorial of digits
        int sum = 0;

        // Copy n to temp
        int temp = number;

        // Calculate sum of factorial of digits
        while (temp > 0) {
            // Get the last digit
            sum += factorial(temp % 10);

            // Remove the last digit
            temp /= 10;
        }

        // Check if sum is equal to n
        return sum == number;
    }

    public static int factorial(int n) {
        // 0! = 1
        if (n == 0) return 1;

        // n! = n * (n - 1)!
        return n * factorial(n - 1);
    }
}
