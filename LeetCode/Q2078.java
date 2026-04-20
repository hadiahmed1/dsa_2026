// 2078. Two Furthest Houses With Different Colors

// There are n houses evenly lined up on the street, and each house is beautifully painted. You are given a 0-indexed integer array colors of length n, where colors[i] represents the color of the ith house.
// Return the maximum distance between two houses with different colors.
// The distance between the ith and jth houses is abs(i - j), where abs(x) is the absolute value of x.

// Runtime 0 ms Beats 100.00%
// Memory 43.34 MB Beats 45.54%

public class Q2078 {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (n - 1 - i < max)
                break;
            for (int j = n - 1; j > i; j--) {
                if (j - i < max)
                    break;

                if ((j - i) > max && (colors[i] != colors[j]))
                    max = j - i;
            }
        }

        return max;
    }

}