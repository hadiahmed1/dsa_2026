// 198. House Robber

// You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

// Runtime 0 ms Beats 100.00% 
// Memory 42.33 MB Beats 97.69%

import java.util.Arrays;

public class Q198 {
    int[] dp;

    int robRecursive(int start, int[] arr) {
        if (start >= arr.length)
            return 0;
        if (dp[start] != -1)
            return dp[start];
        // include start
        int val1 = arr[start] + robRecursive(start + 2, arr);
        // don't take start
        int val2 = robRecursive(start + 1, arr);

        return dp[start] = Math.max(val1, val2);
    }

    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return robRecursive(0, nums);
    }
}
