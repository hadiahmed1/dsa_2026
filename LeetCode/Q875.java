// 875. Koko Eating Bananas
// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
// Return the minimum integer k such that she can eat all the bananas within h hours.

// Runtime 201 ms 
// Beats 6.11% Memory 48.34 MB Beats 17.03%

class Q875 {
    public int maxPile(int[] arr) {
        int max = arr[0];
        for (int n : arr)
            if (n > max)
                max = n;
        return max;
    }

    public long hoursToEat(int[] piles, int k) {
        long hours = 0;
        for (int p : piles) {
            hours = hours + p / k;
            if (p % k != 0)
                hours = hours + 1;
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxPile(piles);
        while (l <= r) {
            int k = l - (l - r) / 2;
            long hours = hoursToEat(piles, k);
            if (hours > h)
                l = k + 1;
            else if (hours < h)
                r = k - 1;
            else{
                // k -> optimum max speed
                for(int i =k; i>0;i--){
                    if(hoursToEat(piles, i) > h) return i+1;
                }
                break;
            }
        }
        return l;
    }
}