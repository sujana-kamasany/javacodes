import java.util.Scanner;

/*
 * This program will take in a number and check if it is unique.
 * A unique number is a number that has no repeating digits.
 * For example, 1234 is a unique number, but 1224 is not.
 */
public class UniqueNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the number
        int number = input.nextInt();

        // Check if the number is unique
        if (isUnique(number)) {
            System.out.println(number + " is a unique number.");
        } else {
            System.out.println(number + " is not a unique number.");
        }
    }

    /**
     * This method will take in a number and check if it is unique.
     *
     * @param number The number to check if it is unique
     * @return true if the number is unique, false otherwise
     */
    public static boolean isUnique(int number) {
        // Create an array to store the number of times each digit appears
        // Digits can be from 0 to 9, so the array will have 10 elements
        // The digits will represent indexes of the array
        int[] array = new int[10];

        // Loop through each digit of the number
        while (number > 0) {
            // Get the last digit of the number
            int digit = number % 10;

            // Increment the number of times the digit appears
            array[digit]++;

            // Remove the last digit from the number
            number /= 10;
        }

        // Loop through the array
        for (int j : array) {
            // If a digit appears more than once, the number is not unique
            if (j > 1) {
                return false;
            }
        }

        // If the loop finishes, the number is unique
        return true;
    }
}
