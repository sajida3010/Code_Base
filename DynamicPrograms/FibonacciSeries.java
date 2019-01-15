package DynamicPrograms;

public class FibonacciSeries {
    public static void main (String args[]) {
//        int n = 6;
//        System.out.println("Length of fibonacci series is " + recursiveMethod( n ) + "\n" );
        FibonacciSeries f = new FibonacciSeries();
        int n = 6;
//        f._initialize();
//        System.out.println("Fibonacci number is" + " " + f.memoization(n));

        //driver function for tabulation
        System.out.println("Fibonacci number is" + " " + f.tabulation(n));
    }
    //Java program for Memoized (top Down Approach) version
    final int MAX = 100;
    final int NIL = -1;
    int lookup[] = new int [MAX];
    //function to initialize NIL values in lookup table
    void _initialize() {
        for (int i = 0; i < MAX; i++) {
            lookup[i] = NIL;
        }
    }
    //----------variables and expression for memozied version ends here=======
    //function for nth Fibonacci number using memoized version
    public int memoization(int n) {
        if (lookup[n] == NIL) {
            if (n <= 1) {
                lookup[n] = n;
            }
            else {
                lookup[n] = memoization(n - 1) + memoization(n - 2);
            }
        }
        return  lookup[n];
    }

    public int tabulation(int n) {
        int f[] = new int [n + 1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];

    }

    public static int recursiveMethod(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return recursiveMethod(n - 1) + recursiveMethod(n - 2);
    }
}
