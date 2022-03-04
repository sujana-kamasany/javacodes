package com.company;
import java.util.Scanner;
public class BuzzNumber {

    public static void main(String[] args) {
        System.out.println("Input an integer: "); // Assumes input is a valid non-negative integer
	    Scanner in = new Scanner(System.in);
        int checkBuzz = in.nextInt();
        boolean isBuzzNumber = false;
        if (checkBuzz % 7 == 0 || checkBuzz % 10 == 7){ // Checks if input can be divisible by 7 or ends with 7
            isBuzzNumber = true;
        }
        System.out.println(isBuzzNumber);
    }
}
