// Q509. Fibonacci Number

// Runtime 0 ms Beats 100.00%
// Memory 41.9 MB Beats 68.84%

import java.util.*;

class Q509 {
    static int[] f;
    static int fibo(int n) {
        if(f[n] != -1) return f[n];

        f[n] = fibo(n-1) + fibo(n-2);
        return f[n];
    }
    public int fib(int n) {
        if(n<=1) return n;
        f = new int[n+1];
        Arrays.fill(f, -1);
        f[0] = 0;
        f[1] = 1;
        return fibo(n);
    }
}
