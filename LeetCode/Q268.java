// 268. Missing Number
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

// Runtime 1 ms Beats 29.30% 
// Memory 46.94 MB Beats 96.16%


import java.util.Arrays;

public class Q268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        Arrays.fill(arr, -1);

        for (int i = 0; i < n; i++) {
            arr[nums[i]] = nums[i];
        }

        for (int i = 0; i < n + 1; i++) {
            if (arr[i] == -1)
                return i;
        }

        return -1;
    }
}
