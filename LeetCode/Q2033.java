// 2033. Minimum Operations to Make a Uni-Value Grid
// You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.
// A uni-value grid is a grid where all the elements of it are equal.
// Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.

// Runtime 35 ms Beats 81.82%
// Memory 111.28 MB Beats 44.70%

import java.util.Arrays;

public class Q2033 {
    public int minOperations(int[][] grid, int x) {
        int r = grid.length;
        int c = grid[0].length;

        int[] arr = new int[r * c];
        int mod = grid[0][0] % x;
        int i = 0;

        for (int[] row : grid) {
            for (int ele : row) {
                if (ele % x != mod)
                    return -1;
                arr[i++] = ele / x;
            }
        }

        Arrays.sort(arr);
        int median = arr[(r*c) / 2];

        int ops = 0;
        for (int val : arr) {
            ops += Math.abs(val - median);
        }

        return ops;
    }
}
