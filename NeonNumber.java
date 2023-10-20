public class Main {
    public static void main(String[] args) {
        int n = 6;
        boolean ans = isNeon(n);
        if(ans) System.out.println("Yes, it's neon");
        else System.out.println("No, it's not neon");
    }
    private static boolean isNeon(int n) {
        int square = n*n;
        int temp = 0;
        while(square > 0) {
            int d = square % 10;
            temp += d;
            square /= 10;
        }
        if(temp == n) return true;
        else return false;
    }
}
