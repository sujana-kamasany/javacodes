package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter terms n of Fibonacci Series : ");
		int n = 0;
		try {
			n = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("n : must be integer over 2");
		}

		int[] series = new int[n];
		series[0] = 1; series[1] = 1;
		printFibonacciNumber(series[0]);
		printFibonacciNumber(series[1]);

		for (int i = 2; i < n; i++) {
			series[i] = series[i - 1] + series[i - 2];
			printFibonacciNumber(series[i]);
		} }

	private static void printFibonacciNumber(int num) {
		System.out.print(num + " ");
	}

}
