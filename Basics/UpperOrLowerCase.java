
public class UpperOrLowerCase {

	public static void main(String[] args) {
		char character='A';
		int ascii = (int) character;
		if(isUpperCase(ascii)) {
			System.out.println("Is upper case");
		}
		else {
			System.out.println("Is lower case");
		}
	}
	
	private static boolean isUpperCase(int asciiCode) {
		return asciiCode>=65 && asciiCode<=90;
	}
}
	  

