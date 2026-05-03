// Q2033. Minimum Operations to Make a Uni-Value Grid

// Runtime 33 ms Beats 83.09%
// Memory 111.3 MB Beats 34.70%

import java.util.*;

class Q2033 {

    public int minOperations(int[][] grid, int x) {
        int r = grid.length;
        int c = grid[0].length;

        int[] arr = new int[r * c];
        int mod = grid[0][0] % x;
        int i = 0;
        // normalizing elements and flatenning the Array
        for (int[] row : grid) {
            for (int ele : row) {
                if (ele % x != mod)
                    return -1;
                arr[i++] = ele / x;
            }
        }

        Arrays.sort(arr);
        // chosen uni value = median
        int median = arr[(r*c) / 2];

        int ops = 0;
        // counting operations
        for (int val : arr) {
            ops += Math.abs(val - median);
        }

        return ops;

    }
}
