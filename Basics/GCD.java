import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        // Create a sacnner object to read from the console
        Scanner sc = new Scanner(System.in);

        // Read the first number
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        // Read the second number
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("--------------------------------");
        System.out.println(
                "The GCD of " + firstNumber + " and " + secondNumber + " is: " + gcd(firstNumber, secondNumber));

        sc.close();

    }

    public static int gcd(int firstNumber, int secondNumber) {

        if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("Error both number are zero");
            System.exit(0);
        }

        // If the first number is zero return the second number as GCD
        if (firstNumber == 0) {
            return secondNumber;
        }

        // If the second number is zero return the first number as GCD
        if (secondNumber == 0) {
            return firstNumber;
        }

        // If both are equal return one of them as GCD
        if (firstNumber == secondNumber) {
            return firstNumber;
        }

        // Initialize GCD with 1
        int gcd = 1;

        // Loop from 1 to the smallest number
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }

        // return the GCD
        return gcd;

    }
}
