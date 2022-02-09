import java.util.Scanner;

class TransposeMatrix {
    static void transposeMatrix(int[][] A, int[][] B) {
        for (int i = 0; i < A[0].length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i][j] = A[j][i];
            }
        }
    }

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many rows? ");
        int row = reader.nextInt();
        System.out.print("How many columns? ");
        int col = reader.nextInt();

        int[][] A = new int[row][col];
        for (int i = 0; i < A.length; i++) {
	        for (int j = 0; j < A[0].length; j++) {
                System.out.print("Enter a value: ");
    	        A[i][j] = reader.nextInt();
            }
        }
        int[][] B = new int[col][row];
        transposeMatrix(A, B);

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
        System.out.print("\n");
        }
    }
}