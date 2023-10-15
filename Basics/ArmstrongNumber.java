package com.sbiswas001.twelveproject;

import java.util.Scanner;

/**
 * Checks if a number is armstrong or not.
 * A number is armstrong if the sum of each digit to the power
 * number of digits is equal to the number itself.
 * @author Sayan Biswas
 * @version 25.04.2022
 */
public class ArmstrongNumber {
    /**
     * Stores the number
     */
    private int number;

    /**
     * Initializes instance variables
     */
    private ArmstrongNumber() {
        number = 0;
    }

    /**
     * Inputs a number from user
     */
    private void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = Integer.parseInt(sc.nextLine());
    }

    /**
     * Returns number of digits of a number
     * @param n Number to be checked
     * @return Number of digits
     */
    private int numberOfDigits(int n) {
        return (int)Math.floor(Math.log10(n))+1;
    }

    /**
     * Checks if a number is armstrong or not.
     * A number is armstrong if the sum of each digit to the
     * power number of digits is equal to the number itself.
     * @param a Number to be checked
     * @return true or false
     */
    private boolean armstrongCheck(int a) {
        int sum = 0;
        while(a > 0) {
            sum += (int)Math.pow(a % 10,
                    numberOfDigits(number));
            a /= 10;
        }
        return sum == number;
    }

    /**
     * Displays if number is armstrong or not
     */
    private void display() {

        System.out.println(armstrongCheck(number) ?
                "Number is armstrong." :
                "Number is not armstrong.");
    }

    /**
     * Calls other methods
     * @param args Arguments passed to main method
     */
    public static void main(String[] args) {
        ArmstrongNumber ob = new ArmstrongNumber();
        ob.input();
        ob.display();
    }
}
