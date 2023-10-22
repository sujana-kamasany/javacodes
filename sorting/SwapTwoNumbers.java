public static void swapTwoNumbers(int a,int b) 
{
 
        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
 
        // Swapping using three Variables
        int temp = a;
        a = b;
        b = temp;
 
        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
}