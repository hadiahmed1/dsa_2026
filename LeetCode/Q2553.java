// Q2553. Separate the Digits in an Array

// Runtime 14 ms Beats 7.38%
// Memory 46.8 MB Beats 22.92%

import java.util.*;

class Q2553 {

    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int n = nums[i];
            while (n != 0) {
                list.add(0, n % 10);
                n /= 10;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
