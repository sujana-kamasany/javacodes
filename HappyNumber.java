import java.util.Scanner;

/*
 * A happy number is a number that, when you repeatedly replace it with the sum of the square of its digits,
 * eventually reaches 1.
 * Example: 19 is a happy number because 1^2 + 9^2 = 82, and 8^2 + 2^2 = 68, and so on until it reaches 1.
 */
public class HappyNumber {
    public static void main(String[] args) {
        // Initialize the scanner class to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number to check if it's a Happy Number: ");

        // Take input
        int number = scanner.nextInt();

        // Check if the number is a Happy Number and print the desired message
        if (isHappy(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }
    }

    /**
     * Checks if a given integer is a Happy Number.
     *
     * @param number the number to check.
     * @return true if the input number is a Happy Number, false otherwise.
     */
    public static boolean isHappy(int number) {
        // Initialize the sum of squared digits to 0.
        int sum = 0;

        // Iterate until n becomes 0.
        while (number > 0) {
            // Extract the last digit.
            int temp = number % 10;

            // Square and add the digit to the sum.
            sum += (int) Math.pow(temp, 2);

            // Remove the last digit by integer division.
            number /= 10;
        }

        // Check if the sum of squared digits is 1, indicating a Happy Number.
        if (sum == 1) {
            return true;
        } else if (sum == 4) {
            // If the sum becomes 4, it will never reach 1, so it's not a Happy Number.
            return false;
        } else {
            // Recursively call isHappy with the sum until we reach either 1 or 4.
            return isHappy(sum);
        }
    }
}