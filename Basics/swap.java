import java.util.*;
import java.io.*;
class Swapping
{
	public static void main(String args[])
	{
		String x = "first";
		String y = "second";

		System.out.println("Strings before swap: a = " +x + " and b = "+y);
		x = x + y;
  	x = y.substring(0,x.length()-y.length());
    x = x.substring(y.length());

		System.out.println("Strings after swap: x = " +
									x + " and y = " + y);	
	}
}
