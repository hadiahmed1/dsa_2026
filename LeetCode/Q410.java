// Q410. Split Array Largest Sum

// Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
// Return the minimized largest sum of the split.
// A subarray is a contiguous part of the array.

// Runtime 0 ms Beats 100.00% 
// Memory 43.02 MB Beats 59.75% 

public class Q410 {
    static int maxArr(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            if (n > max)
                max = n;
        return max;
    }

    static int sumArr(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += arr[i];
        return sum;
    }

    static int partsForSum(int[] nums, int sum) {
        int parts = 1;
        int sumParts = 0;
        for (int i = 0; i < nums.length; i++) {
            sumParts += nums[i];
            if (sumParts > sum) {
                sumParts = nums[i];
                parts++;
            }
        }
        return parts;
    }

    public int splitArray(int[] nums, int k) {
        int l = maxArr(nums);
        int r = sumArr(nums, 0, nums.length - 1);
        while (l <= r) {
            int mid = l - (l - r) / 2;
            int parts = partsForSum(nums, mid);
            //System.out.println("l" + l + "  r=" + r + "  mid =" + mid + "  parts=" + parts);
            if (parts <= k)
                r = mid - 1;
            else if (parts > k)
                l = mid + 1;
        }
        return r + 1;
    }
}
