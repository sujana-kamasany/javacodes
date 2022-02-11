
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an integer to see it's factors.");
        int number = scanner.nextInt();

        System.out.printf("\nThese are all factors of %d:\n", number);

        for(int i=1; i<= Math.abs(number)/2; i++){
            if(number % i == 0){
                System.out.printf("%d, -%d, ", i, i);
            }
        }
        if(number == 0){
            System.out.println("All numbers are factors of 0!!!");
        }
        else{
            System.out.printf("%d, -%d", Math.abs(number), Math.abs(number));
        }
    }
}
