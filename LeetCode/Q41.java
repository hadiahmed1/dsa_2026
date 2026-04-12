// 41. First Missing Positive

// Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
// You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

// Runtime 1 ms Beats 100.00% 
// Memory 71.39 MB Beats 52.33%

public class Q41 {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        // System.out.println("i="+i+" j="+j+ " -> "+ Arrays.toString(arr));
    }

    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else
                i++;
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }

        return nums.length + 1;
    }
}
