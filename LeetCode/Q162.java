// Q162. Find Peak Element

// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.

// Runtime 0 ms Beats 100.00% 
// Memory 44.14 MB Beats 66.78%

public class Q162 {
    public int findPeakElement(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        if (arr.length == 1)
            return 0;
        else if (arr[0] > arr[1])
            return 0;
        else if (arr[r] > arr[r - 1])
            return r;

        while (l <= r) {
            int mid = l - (l - r) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                return mid;
            else if (arr[mid] > arr[mid + 1])
                r = mid - 1;
            else
                l = mid + 1;
        }

        return -1;
    }
}
