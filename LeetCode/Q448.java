// 448. Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Runtime 5 ms Beats 84.72% 
// Memory 70.39 MB Beats 42.83%

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];

        ArrayList<Integer> missing = new ArrayList<>();
        Arrays.fill(arr, -1);

        for (int i = 0; i < n; i++) {
            arr[nums[i]] = nums[i];
        }

        for (int i = 1; i < n + 1; i++) {
            if (arr[i] == -1)
                missing.add(i);
        }

        return missing;
    }
}
