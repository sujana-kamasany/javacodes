import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEvenNum {
    public static void main(String[] args) {
        boolean complete = false;
        long num;

        //Initialise Scanner
        try (Scanner input = new Scanner(System.in)) {
            while (!complete) {
                try {
                    //User input
                    System.out.println("Enter a number:");
                    num = input.nextLong();

                    //IF input is NOT divisible by 2 then it's an ODD number
                    //ELSE it's an EVEN number
                    if (num % 2 != 0) {
                        System.out.println(num + " is an odd number");
                    } else {
                        System.out.println(num + " is an even number");
                    }
                    complete = true; //Task completed
                } catch (InputMismatchException e) {
                    System.out.println("INPUT NOT VALID: Please enter a number!");
                    input.nextLine();
                }
            }
        }
    }
}
