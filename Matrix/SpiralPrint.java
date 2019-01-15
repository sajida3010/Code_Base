package Matrix;

public class SpiralPrint {
    public static void main (String[] args)
    {
        int R = 3;
        int C = 6;
        int a[][] = { {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        spiralPrint(R,C,a);
    }

    private static void spiralPrint(int r, int c, int[][] a) {
        //k = starting row index and l = starting column index
        int i, k = 0, l = 0;

        while(k < r && l < c){
            //print 1st row
            for(i = l; i < c; i++){
                System.out.print(a[k][i] + " ");
            }
            k++;
            //print last column
            for(i = k; i < r; i++){
                System.out.print(a[i][c - 1] + " ");
            }
            c--;
            //print last row
            if(k < r) {
                for(i = c - 1; i >= l ; i--){
                    System.out.print(a[r - 1][i] + " ");
                }
                r--;
            }
            //print 1st column
            if(l < c) {
                for(i = r - 1; i >= k; i--) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }
}
