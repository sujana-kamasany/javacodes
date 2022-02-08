package JavaTut;

import java.util.Scanner;

public class Positive_or_negative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number=sc.nextInt();
        if(number>=0){
            System.out.println("Positve number ");
        }
        else{
            System.out.println("Negative number ");
        }
    }
}
