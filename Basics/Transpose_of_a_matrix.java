package Basics;


import java.util.*;

class Transpose{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];
// Initializing a 2d array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
//Main operation.
        for(int i = 0 ; i < n; i++){
            for(int j = i ; j < m ; j++){
                if(i != j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}