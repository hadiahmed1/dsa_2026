// 1848. Minimum Distance to the Target Element

// Given an integer array nums (0-indexed) and two integers target and start, find an index i such that nums[i] == target and abs(i - start) is minimized. Note that abs(x) is the absolute value of x.
// Return abs(i - start).
// It is guaranteed that target exists in nums.

// Runtime 0 ms Beats 100.00%
// Memory 45.04 MB Beats 32.51%

class Q1848 {
    static int ls(int[] arr, int t, int s) {
        for(int i = s; i < arr.length; i++)
            if(arr[i] == t) return i;
        return -1;
    }
    public int getMinDistance(int[] nums, int target, int start) {
        int index = 0;
        int min = Integer.MAX_VALUE;
        while(true) {
            index = ls(nums, target, index);
            if(index == -1) break;
            min = Math.min(min, Math.abs(start - index));
            index ++;
        }

        return min;
    }
}