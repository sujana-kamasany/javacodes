import java.util.Scanner;

public class CharacterASCII {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        
        char character = sc.next().trim().charAt(0);
        int ascii = (int) character;
        
        System.out.println("ASCII value of '" + character + "' is: " + ascii);
        sc.close();
    }
	
}
