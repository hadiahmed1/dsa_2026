// Q3918. Sum of Primes Between Number and Its Reverse

// Runtime 38 ms Beats 14.27%
// Memory 46.8 MB Beats 5.09%

import java.util.*;

class Q3918 {
    static ArrayList<Integer> prime;

    static int rev(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }

        return r;
    }

    static boolean isPrime(int n) {
        for (Integer p : prime) {
            if (n % p == 0)
                return false;
        }
        prime.add(n);
        return true;
    }

    public int sumOfPrimesInRange(int n) {
        int r = rev(n);
        int s, e;
        if (r < n) {
            s = r;
            e = n;
        } else {
            s = n;
            e = r;
        }

        prime = new ArrayList<>();
        prime.add(2);

        int sum = 0;
        for(int i = 3; i<= e;i++) {
            if(isPrime(i) && i>=s) sum+=i;
        }
        if(s<=2 && e>=2) sum+=2;

        return sum;
    }
}
