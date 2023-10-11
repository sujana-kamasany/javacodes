import java.util.*;

public class starPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // we can Change this value to adjust the height of the pyramid

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
