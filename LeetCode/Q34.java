// 34. Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

// Runtime 0 ms Beats 100.00% 
// Memory 48.10 MB Beats 59.92%

class Q34 {
   public static int bS(int arr[], int target, int l, int r) {
        while (l <= r) {
            int mid = l - (l - r) / 2;

            if (arr[mid] < target)
                l = mid + 1;
            else if (arr[mid] > target)
                r = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int start = bS(nums, target, 0, nums.length - 1);
        if (start == -1)
            return new int[] { -1, -1 };
        int end = start;
        //calculating start;
        while (start > 0 && nums[start - 1] == target)
            start--;
        while (end < nums.length - 1 && nums[end + 1] == target)
            end++;

        return new int[] { start, end };
    } 
}
