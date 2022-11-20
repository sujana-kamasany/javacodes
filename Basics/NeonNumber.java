package Basics;

class NeonNumber {
    public static void main(String[] args) {
        System.out.println("This code checks for neon number");
        if(args==null || args.length<1){
           System.out.println("Usage : java NeonNumber <inputNumber>");
           return;
        }
        int n = args[0];

        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int r = square % 10;
            sum += r;
            square = square / 10;
        }

        System.out.println(sum == n ? n + " is a Neon Number." : n + " is not a Neon Number");

    }
}
