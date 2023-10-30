
//User function Template for Java

class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int n = matrix.length, m = matrix[0].length;
        int row[] = new int[n];
        int col[] = new int[m];


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=1;
                }
            }
        }
    }
}
