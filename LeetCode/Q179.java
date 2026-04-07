// 179. Largest Number

// Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
// Since the result may be very large, so you need to return a string instead of an integer.

// Runtime 20 ms Beats 5.82% 
// Memory 47.15 MB Beats 5.66%

public class Q179 {
    public String largestNumber(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                int a = nums[j];
                int b = nums[j + 1];
                String ab = "" + a + b;
                String ba = "" + b + a;
                if (ab.compareTo(ba) < 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            sb.append(num);
        }
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();

    }
}
