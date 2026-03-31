// Q852. Peak Index in a Mountain Array
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
// Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.

// Runtime 0 ms Beats 100.00% 
// Memory 80.45 MB Beats 31.16%


public class Q852 {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        if (arr.length == 1)
            return arr[0];
        else if (arr[0] > arr[1])
            return arr[0];
        else if (arr[r] > arr[r - 1])
            return arr[r];

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
