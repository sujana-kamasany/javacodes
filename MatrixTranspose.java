public static void MatrixTranspose(int[][] arr, int n)
{

    //Main operation.
    // Matrix is of size n*n
    for(int i = 0 ; i < n; i++)
    {
        for(int j = i ; j < n ; j++)
        {
            if(i != j)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
    //Print array
    for(int i = 0 ; i < n; i++)
    {
        for(int j = i ; j < n ; j++)
        {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

}