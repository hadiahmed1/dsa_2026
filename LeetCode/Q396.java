// Q396. Rotate Function

// Runtime 3 ms Beats 100.00%
// Memory 90.6 MB Beats 49.30%

import java.util.*;

class Q396 {
    public int maxRotateFunction(int[] nums) {
        int max = 0; //f(0)
        int sum = nums[0];
        int len = nums.length;

        for(int i = 1; i < len ; i ++) {
            max += i*nums[i]; // calcualtin f(0)
            sum+=nums[i];
        }
        
        int prev = max;

        for(int n = 1; n< nums.length; n++) {
            int fn = prev + sum - len*nums[len -n]; //f(n)
            prev = fn;
            if(fn > max) max = fn;
        }

        return max;
    }
}
