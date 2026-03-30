// Q35. Search Insert Position
// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

// Runtime 0ms Beats 100.00% 
// Memory 44.85MB Beats 39.41%

public class Q35 {
    public int searchInsert(int[] arr, int target) {
        int l = 0;
        int r = arr.length -1;
        while(l <= r) {
            int m = l-(l-r)/2;
            if (arr[m] == target) return m;
            else if (arr[m] < target) l = m +1;
            else r = m-1;
        }
        return l;
    }
}
