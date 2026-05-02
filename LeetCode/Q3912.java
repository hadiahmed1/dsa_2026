// Q3912. Valid Elements in an Array

// Runtime 1 ms Beats 100.00%
// Memory 46.6 MB Beats 56.53%

import java.util.*;

class Q3912 {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> list = new ArrayList<>();

        int[] maxL= new int[n];
        int[] maxR = new int[n];
        maxL[0] = nums[0];
        maxR[n-1] = nums[n-1];

        for(int i = 1; i<n;i++){
            if(nums[i] > maxL[i-1]) maxL[i] = nums[i];
            else maxL[i] = maxL[i-1];

            if(nums[n-i-1] > maxR[n-i]) maxR[n-i-1] = nums[n-i-1];
            else maxR[n-i-1] = maxR[n-i];
        }
        
        list.add(nums[0]);
        for(int i = 1;i<n-1;i++) {
            if(nums[i] > maxL[i-1] || nums[i] > maxR[i+1]) list.add(nums[i]);
        }
        if(n>1) list.add(nums[n-1]);

        return list;
    }
}
