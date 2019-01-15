package Matrix;

/*First element from 1st row
1st element from last column
last element from last row
last elemnt from 1st column*/
public class RotationBy90Degree_Set1 {
    public static void main(String[] args) {
        DisplayMatrix displayObj = new DisplayMatrix();
        int N = 4;
        // Test Case 1
        int mat[][] =
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                };
        rotateMatrix(N, mat);
        displayObj.displayMatrix(N, mat);
    }
    public static void rotateMatrix(int N, int mat[][]){
        //N is the size of matrix e.g 4*4
        for(int x = 0; x < N / 2; x++){
            for(int y = x; y < N - 1 - x; y++){
                int temp = mat[x][y];
                // move values from right to top
                mat[x][y] = mat[y][N - 1 - x];

                // move values from bottom to right
                mat[y][N - 1 -x] = mat[N - 1 - x][N - 1 - y];

                //move values from left to bottom
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

                mat[N - 1 - y][x] = temp;
            }
        }
    }
}
