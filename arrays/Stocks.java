import java.util.*;
 public class Stocks 
{
        public static void main(String arg[])
        {
            Scanner sc =new Scanner(System.in);5
             System.out.println("Enter the size of Array");
            int size=sc.nextInt();
            int prices[]=new int[size];
            for(int i=0;i<size;i++)
            {
                 prices[i]=sc.nextInt();

             }   
        System.out.println("Best Time To Sell Stocks = "+maxProfit(prices));

        }
        public static  int maxProfit(int[] prices)
         {
            int buy=Integer.MAX_VALUE,sell=0;
            for(int i=0;i<prices.length;i++)
            {
             buy=Math.min(buy,prices[i]);
                sell=Math.max(sell,prices[i]-buy);
            }
            return sell;
            
        }
    }
   

