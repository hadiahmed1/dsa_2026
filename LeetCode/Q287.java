// 287. Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and using only constant extra space.

// Runtime 2 ms Beats 99.00% 
// Memory 81.57 MB Beats 84.91%

public class Q287 {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n + 1];

        for(int num: nums) {
            if(freq[num] > 0) return num;
            freq[num]++;
        }

        return -1;
    }
}
