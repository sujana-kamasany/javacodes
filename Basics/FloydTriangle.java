package Basics;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 1;
        for(int i = 0 ; i < a; i++){
            for(int j = 0 ; j < i + 1;j++){
                System.out.print(b++ + " ");
            }
            System.out.println();
            }
        }
    }

