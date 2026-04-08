// 3653. XOR After Range Multiplication Queries I

// You are given an integer array nums of length n and a 2D integer array queries of size q, where queries[i] = [li, ri, ki, vi].
// For each query, you must apply the following operations in order:
// Set idx = li.
// While idx <= ri:
// Update: nums[idx] = (nums[idx] * vi) % (109 + 7)
// Set idx += ki.
// Return the bitwise XOR of all elements in nums after processing all queries.

// Runtime 61 ms Beats 46.67% 
// Memory 47.68 MB Beats 90.67%


public class Q3653 {
    public void applyQuery(int[] nums, int[] q) {
        int l = q[0];
        int r = q[1];
        int k = q[2];
        int v = q[3];
        for (int i = l; i <= r; i = i + k) {
            nums[i] = (int) ((1L * nums[i] * v) % 1000000007);
        }
    }

    public int xorAfterQueries(int[] nums, int[][] queries) {
        for (int[] q : queries) {
            applyQuery(nums, q);
        }
        int xor = nums[0];
        for (int i = 1; i < nums.length; i++)
            xor = xor ^ nums[i];

        return xor;
    }
}