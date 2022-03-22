package com.company;
import java.util.Scanner;
public class BuzzNumber {

    public static void main(String[] args) {
        boolean isPositive = false;
        // while loop and isPositive flag will assure integer entered is positive
        while (isPositive == false) {
            int checkBuzz = -1;
            System.out.println("Input an integer: ");
            boolean validEntry = false;
            // while loop with try catch to make sure input is valid integer
            while (validEntry == false) {
                try {
                    Scanner in = new Scanner(System.in);
                    checkBuzz = in.nextInt();
                    validEntry = true;
                } catch (Exception e) {
                    System.out.println("You didn't enter an integer. Re-enter...");
                }
            }
            // if statement to continue loop if input was a negative number.
            if (checkBuzz < 0) {
                continue;
            }
            boolean isBuzzNumber = false;
            if (checkBuzz % 7 == 0 || checkBuzz % 10 == 7){ // Checks if input can be divisible by 7 or ends with 7
                isBuzzNumber = true;
            }
            isPositive = true;
            System.out.println("isBuzzNumber: " + isBuzzNumber);

        }
        
        
    }
}
