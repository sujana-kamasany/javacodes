import java.util.Scanner;

/**
 * A Java program to check whether a given number is a buzz number.
 * A number is considered a buzz number if it is divisible by 7 or it ends with 7.
 * For example, 7, 17, 27, 37, 47 are buzz numbers because they end with 7.
 * Similarly, 7, 14, 21, 28, 35, 49 are buzz numbers because they are divisible by 7.
 */
public class BuzzNumberChecker {
    /**
     * Main method to take user input and check if a number is a buzz number.
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        if (isBuzzNumber(number)) {
            System.out.println(number + " is a buzz number.");
        } else {
            System.out.println(number + " is not a buzz number.");
        }
    }

    /**
     * Checks whether a given number is a buzz number.
     * @param num The number to be checked.
     * @return True if the number is a buzz number, otherwise, false.
     */
    public static boolean isBuzzNumber(int num) {
        // Check if the number is divisible by 7 or ends with 7
        return (num % 7 == 0) || (num % 10 == 7);
    }
}
