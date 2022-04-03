import java.util.Scanner;

class NeonNumber {
    public static void main(String[] args) {
        System.out.print("Input Number to Check: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int r = square % 10;
            sum += r;
            square = square / 10;
        }

        System.out.println(sum == n ? n + " is a Neon Number." : n + " is not a Neon Number");

    }
}
