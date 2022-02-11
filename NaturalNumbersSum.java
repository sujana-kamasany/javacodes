public class NaturalNumbersSum {
    public static void main(String[] args){
        int tab[]= {1,2,3,4,5,6};
        System.out.println(sumOfNaturalNumbers(tab));
    }
    public static int sumOfNaturalNumbers(int[] tab){
        int sum = 0;
        for(int i =0; i < tab.length;i++){
            sum = sum + tab[i];
        }
        return sum;
    }
}
