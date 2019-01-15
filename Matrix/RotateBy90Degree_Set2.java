package Matrix;

//First we find the transpose, then we reverse elements of every column
public class RotateBy90Degree_Set2 {
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
        transpose(N, mat);
        reverseColumns(mat);
        displayObj.displayMatrix(N, mat);
    }
    public static void transpose(int N, int m[][]){
        for(int i = 0; i < N - 1; i++){
            for(int j = i; j < N - 1; j++) {
                int tmp = m[i][j + 1];
                m[i][j + 1] = m[j + 1][i];
                m[j + 1][i] = tmp;
            }
        }
    }
    static void reverseColumns(int arr[][])
    {
        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0, k = arr[0].length - 1;
                 j < k; j++, k--) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
    }
}
