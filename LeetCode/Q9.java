// Q9. Palindrome Number

// Runtime 5 ms Beats 79.65%
// Memory 45.8 MB Beats 72.40%

import java.util.*;

class Q9 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        
        int n = x;
        int rev = 0;

        while(n>0) {
            rev = rev*10 + n%10;
            n= n/10;
        }

        return x==rev; 
    }
}
