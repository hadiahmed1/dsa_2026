// 3761. Minimum Absolute Distance Between Mirror Pairs

// You are given an integer array nums.
// A mirror pair is a pair of indices (i, j) such that: 0 <= i < j < nums.length, and
// reverse(nums[i]) == nums[j], where reverse(x) denotes the integer formed by reversing the digits of x. Leading zeros are omitted after reversing, for example reverse(120) = 21.
// Return the minimum absolute distance between the indices of any mirror pair. The absolute distance between indices i and j is abs(i - j).
// If no mirror pair exists, return -1.

// Runtime 44 ms Beats 98.48%
// Memory 99.02 MB Beats 31.47%

import java.util.HashMap;

public class Q3761 {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> r = new HashMap<>();
        int n = nums.length;
        int min = n;
        for(int i = 0; i < n ; i++) {
            if(r.containsKey(nums[i])) min = Math.min(min, i - r.get(nums[i]));
            if(min ==1 && min!=n) return 1; // no need to check further as min can't be less than 1
            r.put(rev(nums[i]), i);
        }
        return min == n ? -1 : min;
    }
    private static int rev(int n) {
        int r = 0;
        while(n>0) {
            r = r*10 + n%10;
            n/=10;
        }
        return r;
    }
}
