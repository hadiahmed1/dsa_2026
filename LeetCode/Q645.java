// 645. Set Mismatch
// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
// You are given an integer array nums representing the data status of this set after the error.
// Find the number that occurs twice and the number that is missing and return them in the form of an array. {

// Runtime 2 ms Beats 94.87%
// Memory 47.77 MB Beats 43.07%

public class Q645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n];

        for (int num : nums)
            freq[num - 1]++;

        int missing = -1;
        int duplicate = -1;

        for (int i = 1; i <= n; i++) {
            if (freq[i - 1] > 1)
                duplicate = i;
            else if (freq[i - 1] == 0)
                missing = i;
        }

        return new int[] { duplicate, missing };

    }
}