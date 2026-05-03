// Q3917. Count Indices With Opposite Parity

// Runtime 1 ms Beats 100.00%
// Memory 46.7 MB Beats 94.74%

import java.util.*;

class Q3917 {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] e = new int[n];
        int[] o = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i + 1] % 2 == 0) {
                e[i] = e[i + 1] + 1;
                o[i] = o[i + 1];
            } else {
                e[i] = e[i + 1];
                o[i] = o[i + 1] + 1;
            }
        }

        int[] ans = new int[n];

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] % 2 != 0)
                ans[i] = e[i];
            else
                ans[i] = o[i];
        }
        // System.out.println(Arrays.toString(e));
        return ans;
    }
}
