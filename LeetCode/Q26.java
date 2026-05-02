// Q26. Remove Duplicates from Sorted Array

// Runtime 0 ms Beats 100.00%
// Memory 46.5 MB Beats 80.40%

import java.util.*;

class Q26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int index = 0;
        for(int i = 1; i < n; i++) {
            if(nums[i]!=nums[index]){
                nums[++index] = nums[i];
            }
        }

        return index + 1;
    }
}
