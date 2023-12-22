import java.util.Scanner;

public class KaprekarChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Wrong Input");
        } else {
            if (isKaprekar(number)) {
                System.out.println("Kaprekar Number");
            } else {
                System.out.println("Not Kaprekar");
            }
        }
    }

    private static boolean isKaprekar(int number) {
        int square = number * number;
        String squareStr = String.valueOf(square);
        int length = squareStr.length();

        for (int i = 1; i < length; i++) {
            int partA = Integer.parseInt(squareStr.substring(0, i));
            int partB = Integer.parseInt(squareStr.substring(i));

            if (partA + partB == number && partB > 0) {
                System.out.println(partA + " + " + partB + " = " + number);
                return true;
            }
        }

        return number == 0; // 0 is a Kaprekar number
    }
}
