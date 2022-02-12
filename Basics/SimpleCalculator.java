package Basics;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the First number: ");
        int firstValue = reader.nextInt();

        System.out.println("Enter the second number: ");
        int secondValue = reader.nextInt();

        System.out.println("Enter operation option (*, -, +, /): ");
        String operation = reader.next();

        switch (operation) {
            case "*" -> showOperationResult(firstValue ,operation , secondValue , (firstValue * secondValue));
            case "-" -> showOperationResult(firstValue, operation , secondValue , (firstValue - secondValue));
            case "+" -> showOperationResult(firstValue , operation , secondValue , (firstValue + secondValue));
            case "/" -> showOperationResult(firstValue ,operation ,secondValue , (firstValue / secondValue));
            default -> System.out.println("Invalid operation, use *, -, + or /");
        }
    }

    public static void showOperationResult(final int firstValue, final String operation, final int secondValue, final int result) {
        System.out.printf("%s %s %s = %s%n", firstValue, operation, secondValue, result);
    }
}
