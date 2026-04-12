// 448. Find All Numbers Disappeared in an Array

// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Runtime 4 ms Beats 96.78%
// Memory 70.57 MB Beats 39.42%


import java.util.ArrayList;
import java.util.List;

public class Q448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];

        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[nums[i]]++;;
        }

        for (int i = 1; i < n + 1; i++) {
            if (arr[i] < 1)
                missing.add(i);
        }
        return missing;
    }
}
