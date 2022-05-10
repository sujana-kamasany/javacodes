import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number : ");
		int n = in.nextInt();
		System.out.println(isPronic(n) == true ? n + " is a Pronic Number." : n + " is not a Pronic Number");
	}

	/**
	 * Returns true if number is pronic, and false otherwise
	 * 
	 * @param num
	 * @return
	 */
	private static boolean isPronic(int num) {
		for (int i = 0; i < num; i++) {
			if (i * (i + 1) == num)
				return true;
		}
		return false;
	}

}
