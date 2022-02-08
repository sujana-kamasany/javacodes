package JavaTut;

import java.util.Scanner;

public class Char_isAlphabet {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a Character: ");
            String str= sc.nextLine();
            if(str instanceof String) {
                if (str.length() == 1) {
                    System.out.println("It is an Alphabet ");
                } else {
                    System.out.println("It is a String");
                }
            }
    }
}
