import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class LargestAmongThree
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The First Number :-");
        int a=sc.nextInt();
        System.out.print("\nEnter The second Number :-");
        int b=sc.nextInt();
        System.out.print("\nEnter The Third Number :-");
        int c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.print("\nThe Largest Number is :"+a);
        }
        else if(b>c)
        {
            System.out.print("\nThe Largest Number is :"+b);
        }
        else 
        {
            System.out.print("\nThe Largest Number is :"+c);
        }
        
    }    
}