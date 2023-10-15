public class NeonNumber 
{
	public static void main(String[] args)
	{
		int n,square,sum=0;
		
        //command line input
        n = Integer.parseInt(args[0]);

		//calculate square.
		square=n*n;

		while(square>0)
		{
			sum=sum+square%10;
			square=square/10;
		}
		//condition for checking sum is equal or not.
		if(sum==n)
			System.out.println("Its a Neon number.");
		else
			System.out.println("Its not a Neon number.");
	}
}
