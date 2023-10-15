import java.util.Scanner;
public class PronicNumber{
    public static boolean isPronic(int n){
        for(int i = 0; i < Math.sqrt(n); i++){
            if(n == i * (i+1)) return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        if(isPronic(n)){
            System.out.println(n + " is a pronic number.");
        }
        else{
            System.out.println(n + " is not a pronic number");
        }
        sc.close();
    }
}