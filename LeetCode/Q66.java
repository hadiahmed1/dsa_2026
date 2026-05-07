// Q66. Plus One

// Runtime 0 ms Beats 100.00%
// Memory 43.3 MB Beats 60.68%

import java.util.*;

class Q66 {
    public int[] plusOne(int[] digits) {
        int index = digits.length -1;
        // find 1st non 9
        while(index >=0 && digits[index]==9) index--;
        if(index != -1){// 
            digits[index]++;
            for(int i = index +1;i<digits.length;i++) digits[i] = 0;
            return digits;
        }

        int[] arr = new int[digits.length +1];
        arr[0] = 1;
        return arr;
    }
}
