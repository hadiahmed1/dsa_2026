// 1838. Frequency of the Most Frequent Element
// The frequency of an element is the number of times it occurs in an array.
// You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
// Return the maximum possible frequency of an element after performing at most k operations.

// Runtime 561 ms Beats 5.12%
// Memory 94.63 MB Beats 85.41%

import java.util.Arrays;
public class Q1838 {
    public int freqOfIndex(int[] arr, int index, int k) {
        int f = 1;
        for (int i = index - 1; i >= 0; i--) {
            k = k - (arr[index] - arr[i]);
            if (k < 0)
                break;
            f++;
        }
        return f;
    }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int fmax = 1;
        // System.out.println(Arrays.toString(nums));
        for (int i = nums.length - 1; i >= 0; i--) {
            fmax = Math.max(fmax, freqOfIndex(nums, i, k));
            if (fmax > i)
                break;
            // System.out.println(i+" -> "+freqOfIndex(nums, i, k));
        }

        return fmax;
    }
}
