import java.util.Scanner;

/*
 * A Kaprekar number is a number whose square when divided into two parts
 * and such that sum of parts is equal to the original number and none of the parts has value 0.
 * For example, 45 is a Kaprekar number, because 45^2 = 2025 and 20 + 25 = 45.
 */
public class KaprekarNumber {
    public static void main(String[] args) {
        // Initialize the scanner class to take input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter number to check if it is Kaprekar or not : ");

        // Take input
        int num = sc.nextInt();

        // Check if number is Kaprekar and print the desired message
        if (checkKaprekar(num))
            System.out.println("This number is an Kaprekar Number");
        else
            System.out.println("This number is not an Kaprekar Number");
    }

    public static boolean checkKaprekar(int number){
        // 1. Find square of number
        int square = number * number;

        // 2. Count number of digits in square
        int count = 0;

        // 3. Find sum of digits from right side
        while (square != 0){
            count++;
            square /= 10;
        }

        // 4. Find sum of digits from left side
        square = number * number;

        // 5. Check if sum of digits is equal to original number
        for (int i = 1; i < count; i++){
            int first = (int) (square / Math.pow(10, i));
            int second = (int) (square % Math.pow(10, i));
            if (first + second == number && first != 0 && second != 0){
                return true;
            }
        }
        return false;
    }
}
