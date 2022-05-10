import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber {
	
	public static void main(String[] args) {
		
		//first method
		Random r = new Random();
		
		//separate random integers
		int r1 = r.nextInt(1000);//range 0 to 999
		int r2 = r.nextInt(1000);
		
		System.out.println("Random Integer using java.util.random #1: "+r1);
		System.out.println("Random Integer using java.util.random #2: "+r2);
		
		//second method
		System.out.println("");
		System.out.println("Random doubles using math.random() #1: "+ Math.random());//range 0.0 to 1.0
		System.out.println("Random doubles using math.random() #2: "+ Math.random());
		
		//third method
		System.out.println("");
		int i1 = ThreadLocalRandom.current().nextInt();
        int i2 = ThreadLocalRandom.current().nextInt();
        
        System.out.println("Random Integers using ThreadLocalRandom class #1: " + i1);//range -2147483648 to 2147483647
        System.out.println("Random Integers using ThreadLocalRandom class #2: " + i2);
	}
}
