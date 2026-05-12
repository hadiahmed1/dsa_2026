// Q70. Climbing Stairs

// Runtime 0 ms Beats 100.00%
// Memory 42.1 MB Beats 35.03%

import java.util.*;

class Q70 {
    static int[] memo;

    static int climbStairsRecursive(int n) {
        return memo[n] = memo[n] !=-1 ? memo[n]:climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }

    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 1;
        memo[1] = 1;

        return climbStairsRecursive(n);
    }
}
