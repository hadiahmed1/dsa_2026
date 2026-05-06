// Q1861. Rotating the Box

// Runtime 7 ms Beats 93.03%
// Memory 124.6 MB Beats 86.78%

import java.util.*;

class Q1861 {
    private static char[][] rotate(char[][] arr) {
        char[][] r = new char[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                r[j][arr.length - 1 - i] = arr[i][j];

        return r;
    }

    private static void moveRight(char[] row, int r) {
        int empty = row.length - 1;

        for (int j = row.length - 1; j >= 0; j--) {
            if (row[j] == '*') {
                empty = j - 1;
            } else if (row[j] == '#') {
                char temp = row[j];
                row[j] = '.';
                row[empty] = temp;
                empty--;
            }
        }
    }

    public char[][] rotateTheBox(char[][] boxGrid) {
        for (char[] arr : boxGrid) {
            moveRight(arr, arr.length - 1);
        }

        return rotate(boxGrid);
    }
}
