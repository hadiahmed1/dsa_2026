// 442. Find All Duplicates in an Array

// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.
// You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

// Runtime 4 ms Beats 98.48% 
// Memory 60.17 MB Beats 47.95%

import java.util.ArrayList;
import java.util.List;

public class Q442 {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();

        int n = nums.length;
        boolean [] freq = new boolean[n+1];

        for(int num: nums) {
            if(freq[num]) arr.add(num);
            else freq[num] = true;
        }

        return arr;
    }
}
