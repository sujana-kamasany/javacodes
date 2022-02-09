package JavaTut;

import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number :");
        int n1 = input.nextInt();
        System.out.println("Enter the second number :");
        int n2 = input.nextInt();
        int sum = n1 +n2;
        System.out.println("Sum of the "+ n1 + " and "+ n2 + " is " + sum);
        input.close();
    }
}
