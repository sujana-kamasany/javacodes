package Basics;

import java.util.Scanner;

/**
 * Print Pascal Triangle by Java
 *
 * ex. input = 4,
 *
 *    1
 *   1 1
 *  1 2 1
 * 1 3 3 1
 *
 * @author Royce
 * @since 2022.02.15
 */

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a pascal line : ");
		int level = input.nextInt();

		int[][] triangle = new int[level][level];
		triangle[0][0] = 1;

		for (int i = 1; i < triangle.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					triangle[i][j] = 1;
				}
				else {
					triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
				}
			}
		}

		printPascalTriangle(triangle, level);
	}

	private static void printPascalTriangle(int[][] triangle, int level) {
		for (int i = 0; i < level; i++) {
			for (int j = level; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j < level; j++) {
				int number = triangle[i][j];
				if (number == 0) {
					break;
				}
				System.out.print(number + " ");
			}
			System.out.println();
		}
	}

}
