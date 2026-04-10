// 3740. Minimum Distance Between Three Equal Elements I
// You are given an integer array nums.
// A tuple (i, j, k) of 3 distinct indices is good if nums[i] == nums[j] == nums[k].
// The distance of a good tuple is abs(i - j) + abs(j - k) + abs(k - i), where abs(x) denotes the absolute value of x.
// Return an integer denoting the minimum possible distance of a good tuple. If no good tuples exist, return -1.

// Runtime 1 ms Beats 100.00% 
// Memory 44.45 MB Beats 59.16%

public class Q3740 {
    public int linearSearch(int[] arr, int t, int l) {
        for (int i = l; i < arr.length; i++) {
            if (arr[i] == t)
                return i;
        }
        return -1;
    }

    public int minimumDistance(int[] nums) {
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = linearSearch(nums, nums[i], i + 1);
            if (j == -1)
                continue;
            int k = linearSearch(nums, nums[i], j + 1);
            if (k == -1)
                continue;
            distance = Math.min(distance, 2 * (k - i));
        }

        if (distance == Integer.MAX_VALUE)
            return -1;
        return distance;
    }
}
