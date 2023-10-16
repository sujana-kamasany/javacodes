
package EncriptionAndDecription;
import java.util.Scanner;

public class CipherMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Encryption Techniques Menu");
        System.out.println("1. Additive Cipher");
        System.out.println("2. Multiplicative Cipher");
        System.out.println("3. Affine Cipher");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.print("Enter the text: ");
                String additiveText = sc.nextLine();
                System.out.print("Enter the shift value: ");
                int shiftValue = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                String additiveCipher = additiveCipher(additiveText, shiftValue);
                System.out.println("Additive Cipher: " + additiveCipher);
                break;

            case 2:
                System.out.println("Multiplicative Cipher");
                System.out.print("Enter the plaintext: ");
                String multiplicativeText = sc.nextLine();
                System.out.print("Enter the shift value: ");
                int multiplicativeShift = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                String multiplicativeCipher = multiplicativeCipher(multiplicativeText, multiplicativeShift);
                System.out.println("Multiplicative Cipher: " + multiplicativeCipher);
                break;

            case 3:
                System.out.println("Affine Cipher");
                System.out.print("Enter the text: ");
                String affineText = sc.nextLine();
                String affineCipher = affineCipher(affineText);
                System.out.println("Affine Cipher: " + affineCipher);
                break;

            case 4:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }

        sc.close();
    }

    // Additive Cipher, Multiplicative Cipher, and Affine Cipher methods here...

    public static String additiveCipher(String text, int s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = (char) (((ch - 'A' + s) % 26) + 'A');
            } else if (Character.isLowerCase(ch)) {
                ch = (char) (((ch - 'a' + s) % 26) + 'a');
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static String multiplicativeCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                ch = (char) (((ch - 'a') * shift % 26) + 'a');
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static String affineCipher(String text) {
        int a = 17;
        int b = 20;
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char encryptedChar = (char) (((a * (ch - 'A') + b) % 26) + 'A');
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
