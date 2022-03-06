package JavaTut.SpyNumber;

import java.util.Scanner;

/**
 * 	SpyNumber
 * 	sum of each digit is equals to product of the digits.
 * 	ex) 1124
 * 	sum of digits = 1 + 1 + 2 + 4
 * 	= 6
 * 	product of the digits = 1 * 1 * 2 * 4
 * 	= 6
 */
public class SpyNumber {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);

		String input = inputs.nextLine();
		int number = Integer.parseInt(input);
		int sum = 0;
		int multiples = 1;

		String[] splitNums = input.split("");
		for (String splitNum : splitNums) {
			int toInt = Integer.parseInt(splitNum);
			sum += toInt;
			multiples *= toInt;
		}

		if (sum == multiples) {
			System.out.println(number + " is a spy number");
			return;
		}

		System.out.println(number + " is not a spy number");
	}
	
}
