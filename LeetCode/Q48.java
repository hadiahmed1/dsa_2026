// Q48. Rotate Image

// Runtime 0 ms Beats 100.00%
// Memory 43.5 MB Beats 84.77%

import java.util.*;

class Q48 {
    public static void transpose(int[][] m) {
        for(int i = 1;i < m.length;i++){
            for(int j = 0; j<i; j++) {
                //swap
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }

    public static void rowReverse(int[][] m) {
        for(int[] row: m) {
            for(int i=0;i<(m.length/2);i++){
                int j = m.length - i -1;
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        rowReverse(matrix);
    }
}
