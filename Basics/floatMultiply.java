import java.util.Scanner;

public class floatMultiply {

    public static void main(String[] args){
        //Creates two scanners, one for each float
        Scanner input1 = new Scanner(System.in);
        
        //Asks for the floats to multiply
        System.out.println("Enter the first float: ");
        Float float1 = input1.nextFloat();
        System.out.println("Enter the second float: ");
        Float float2 = input1.nextFloat();

        //Closing the scanners is generally a good practice
        input1.close(); 

        // println() prints the following line to the output screen
        System.out.println("The product is: " + float1 * float2);
    }
}