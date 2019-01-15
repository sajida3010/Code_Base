package Matrix;

public class Rotation {
    public static void main(String[] args) {
        int a[][] = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16} };
        int R = 4, C = 4;
        rotatematrix(R, C, a);
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotatematrix(int r, int c, int[][] a) {
        int k = 0, l = 0;

        while(k < r && l < c){

//            if (k + 1 == r || l + 1 == c)
//                break;

            int prev = a[k + 1][l];
            for(int i = l; i < c; i++){
                int curr = a[k][i];
                a[k][i] = prev;
                prev = curr;
            }
            k++;
            for(int i = k; i < r; i++) {
                int curr = a[i][c - 1];
                a[i][c - 1] = prev;
                prev = curr;
            }
            c--;
            if(k < r) {
                for(int i = c - 1; i >= l; i--){
                    int curr = a[r - 1][i];
                    a[r - 1][i] = prev;
                    prev = curr;
                }
                r--;
            }
            if(l < c) {
                for(int i = r - 1; i >= k; i--){
                    int curr = a[i][l];
                    a[i][l] = prev;
                    prev = curr;
                }
            }
            l++;
        }
    }
}
