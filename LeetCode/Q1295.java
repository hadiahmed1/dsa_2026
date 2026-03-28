package LeetCode;

// Q: Given an array nums of integers, return how many of them contain an even number of digits.

// Runtime: 1ms Beats 99.54%
// Memory 44.53MB Beats 74.50%

class Q1295 {
    public boolean hasEvenDigits(int n) {
        int digits = (int) Math.floor(Math.log10(n)) + 1;
        return digits % 2 == 0;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int n: nums){
            if(hasEvenDigits(n)) 
                count++;
        }
        return count;
    }
}
