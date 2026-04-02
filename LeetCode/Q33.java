// Q33. Search in Rotated Sorted Array

// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.

// Runtime 0 ms Beats 100.00% 
// Memory 43.82 MB Beats 55.86%

public class Q33 {
    public int search(int[] arr, int target) {
        int l = 0;
        int r = arr.length -1;
        boolean isL = target >= arr[0];
        if(arr[0]<arr[arr.length-1]) {
            while (l <= r) {
                int mid = l - (l-r)/2;
                if(arr[mid]>target) r = mid-1;
                else if (arr[mid] < target) l = mid+1;
                else return mid;
            }
        }
        while (l <= r) {
            int mid = l - (l-r) / 2;
            if (arr[mid] == target)
                return mid;
            if (isL) {
                if (arr[mid] > target)
                    r = mid - 1;
                else {
                    //smaller mid on Left
                    if (arr[mid] >= arr[0])
                        l = mid + 1;
                    //smaller mid on right
                    else
                        r = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    l = mid + 1;
                } else {
                    //larger mid on left
                    if (arr[mid] >= arr[0])
                        l = mid + 1;
                    // larger mid on right
                    else
                        r = mid - 1;
                }
            }

        }
        if(arr[arr.length -1 ] == target) return arr.length-1;
        return -1;
    }
}
