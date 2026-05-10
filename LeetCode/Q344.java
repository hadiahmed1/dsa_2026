// Q344. Reverse String

// Runtime 0 ms Beats 100.00%
// Memory 48.4 MB Beats 37.02%

import java.util.*;

class Q344 {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i =0;i<n/2;i++){
            char temp = s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
    }
}
