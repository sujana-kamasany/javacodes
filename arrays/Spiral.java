package arrays;

//it returns a two-dimensional array representing a table with sizes of the given parameters
//a table contains numbers from 1 up to number received by multiplying number of rows and columns
//numbers fill the table clockwise from the top-level corner in a spiral manner

public class Spiral {
    static int[][] spiral(int rows, int columns) {
        int row = 0;
        int col = 0;

        int boundary = columns - 1;
        int verticalBoundary = rows - 1;
        int horizontalBoundary = columns - 1;

        //determine movement r = right...
        char move = 'r';

        // switching between horizontal and vertical rotations
        char shift = 'v';

        //Creating array
        int[][] matrix = new int[rows][columns];

        // One column case
        if(columns == 1) {
            for (int i = 1; i < rows * columns + 1; i++) {
                matrix[row][col] = i;
                row++;
            }
            return matrix;
        }

        for (int i = 1; i < rows * columns + 1; i++) {
            matrix [row][col] = i;

            //determining the cell's next index
            switch (move) {
                // go right
                case 'r':
                    col += 1;
                    break;
                // go left
                case 'l':
                    col -= 1;
                    break;
                // go up
                case 'u':
                    row -= 1;
                    break;
                // go down
                case 'd':
                    row += 1;
                    break;
            }
            //check if a boundary has been reached
            if(boundary == i){
                switch (shift) {
                    case 'v':
                        if (boundary == i){
                            boundary += verticalBoundary;
                            verticalBoundary -= 1;
                            shift = 'h';
                        }
                    case 'h':
                        if (boundary == i){
                            boundary += horizontalBoundary;
                            horizontalBoundary -= 1;
                            shift = 'v';
                        }
                }
                //change direction
                switch (move) {
                    // go right
                    case 'r':
                        move = 'd';
                        break;
                    // go left
                    case 'l':
                        move = 'u';
                        break;
                    // go up
                    case 'u':
                        move =  'r';
                        break;
                    // go down
                    case 'd':
                        move = 'l';
                        break;
                }
            }
        }
        return matrix;
    }
}
