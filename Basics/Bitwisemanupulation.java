import java.util.*;
// Program to check whether a number is even or odd using Bitwise Manupulations 
public class Bitwisemanupulation{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        //Reading Number from the user
        System.out.println("Enter the Number to be checked = ");
        int number;
        number= in.nextInt();
        //Using Biwise AND between the number and 1 to extract the last bit(LSB=Least Significant Bit) of our number
        int lastbit = number&1;
        /* Checking if the last bit is 1 , if it is then the no. is odd since all calculations are done in Binary in
        Computers.
        */
        if(lastbit == 1)
        {
            System.out.println("The Number is Odd.");
        }
        else
        {
            System.out.println("The Number is Even.");
        }
    }
}