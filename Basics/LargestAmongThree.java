import java.util.*;

public class LargestAmongThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first numbers:");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter the second numbers:");												//Enter the oneNumber/line
		int secondNumber = scanner.nextInt();
		System.out.println("Enter the third numbers:");
		int thirdNumber = scanner.nextInt();
		System.out.println("The largest Number is: " + (firstNumber > secondNumber && firstNumber > thirdNumber ? firstNumber : secondNumber > thirdNumber ? secondNumber : thirdNumber));
	}
}