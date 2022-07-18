import java.util.Scanner;

public class BuzzNumber {

    public static void main(String[] args) {
        System.out.println("Input an integer: ");
	      Scanner in = new Scanner(System.in);
        int buzz = in.nextInt();
        if (buzz % 7 == 0 || buzz % 10 == 7){ 
            System.out.println(buzz+" is a Buzz Number");
        }else{
            System.out.println(buzz+" is not a Buzz Number");
        }
    }
}
