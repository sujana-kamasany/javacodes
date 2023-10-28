package PetersonNumber;

import java.util.Scanner;

public class PetersonNumber {
	/**
	 * Peterson Number is that sum of each digit's factorial equals to number
	 * ex) 145
	 * 1! + 4! + 5!
	 * 1 + 24 + 120 = 145
	 * Peteson Number!
	 *
	 * @author Royce
	 * @since 2022.02.19
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number : ");

		String userInput = input.nextLine();
		try {
			int number = Integer.parseInt(userInput);
			checkPositive(number);
		} catch (NumberFormatException e) {
			System.out.println("Number must be integer more than 1");
			return;
		}

		System.out.println(
			isPetersonNumber(userInput)
		);


	}

	private static void checkPositive(int number) {
		if (number <= 0) {
			throw new NumberFormatException();
		}
	}

	private static String isPetersonNumber(String userInput) {
		int userNumber = Integer.parseInt(userInput);
		String[] digits = userInput.split("");
		int sum = 0;
		for (String digit : digits) {
			sum += factorial(digit);
		}

		if (sum == userNumber) {
			return userNumber + " is Peterson Number!";
		}
		return userNumber + " is not Peterson Number!";
	}

	private static int factorial(String digit) {
		int num = Integer.parseInt(digit);
		int ans = 1;
		for (int i = num; i > 0; i--) {
			ans *= i;
		}
		return ans;
	}

}
