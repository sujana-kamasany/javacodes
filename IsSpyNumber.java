import java.math.BigInteger;
import java.util.Scanner;

public class IsSpyNumber {
    // Function to check if a number is a spy number
    public static boolean isSpyNumber(BigInteger num) {
        BigInteger sumOfDigits = BigInteger.ZERO;
        BigInteger productOfDigits = BigInteger.ONE;
        BigInteger ten = BigInteger.TEN;

        while (num.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divRem = num.divideAndRemainder(ten);
            BigInteger digit = divRem[1];
            sumOfDigits = sumOfDigits.add(digit);
            productOfDigits = productOfDigits.multiply(digit);
            num = divRem[0];
        }

        return sumOfDigits.equals(productOfDigits);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger number = scanner.nextBigInteger();

        if (isSpyNumber(number)) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }
    }
}
