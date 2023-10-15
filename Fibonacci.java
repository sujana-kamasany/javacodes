import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int term, a = 0, b = 1, c;
        System.out.print("Enter the number of terms: ");
        Scanner scanner = new Scanner(System.in);
        term = scanner.nextInt();

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= term; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
