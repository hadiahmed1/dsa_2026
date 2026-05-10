// Q3925. Concatenate Array With Reverse

// Runtime 1 ms Beats 99.99%
// Memory 47.6 MB Beats 17.71%

import java.util.*;

class Q3925 {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i<n;i++){
            ans[i] = nums[i];
            ans[2*n -i -1] = nums[i];
        }
        return ans;
    }
}
