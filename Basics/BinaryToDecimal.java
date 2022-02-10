
public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println("GOAL :10 ++++++ "+getDecimalFromBinary1(1010));
        // TEST 4  Binary  to Decimal  1
        System.out.println("GOAL :1111011 ++++++ ");
        int [] binary = getBinaryFromDecimal1(123);
        for(int i = binary.length-1;i >= 0;i--){
            System.out.print(binary[i]);

        }
    }

    private static int getDecimalFromBinary1(int binary) {
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    private static int[] getBinaryFromDecimal1(int decimal) {
        int binary[] = new int[40];
        int binaryreturn =0;
        int index = 0;
        while(decimal > 0){
            binary[index++] = decimal%2;
            decimal = decimal/2;
        }
        return binary;
    }


}