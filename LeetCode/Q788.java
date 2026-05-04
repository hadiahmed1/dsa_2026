// Q788. Rotated Digits

// Runtime 3 ms Beats 92.32%
// Memory 41.8 MB Beats 94.92%

import java.util.*;

class Q788 {
    static boolean isGood(int n) {
        boolean rotDiff = false;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            if (d == 3 || d == 4 || d == 7)
                return false;
            if (d == 2 || d == 5 || d == 6 || d == 9)
                rotDiff = true;
        }

        return rotDiff;
    }

    public int rotatedDigits(int n) {
        int count = 0;
        for(int i = 1; i<= n; i++){
            if(isGood(i)) count++;
        }

        return count;
    }
}
