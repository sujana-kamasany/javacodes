public class StringReverse {

    public static void main(String args[]) {
        String Str = new String("2023 fest hacktober for");
        String []arr =Str.split("\\s");
        String []revarr=new String[5];
        int i,j;

       for(i=arr.length-1,j=0;i>=0 ;i--,j++)
       {
        
            revarr[j]=arr[i];
        
       }
       for(i=0;i<arr.length;i++)
       {
           System.out.print(revarr[i]+" ");
       }
       System.out.println("\n\n");
    }
 }
