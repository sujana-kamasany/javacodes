import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int n1 = in.nextInt();
        System.out.println("Enter the second number :");
        int n2 = in.nextInt();
        int sum = n1 +n2;
        System.out.println("Sum of the "+ n1 + " and "+ n2 + " is " + sum);
    }
}
