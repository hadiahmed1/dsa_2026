// 888. Fair Candy Swap

// Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
// Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
// Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

// Runtime 17 ms Beats 35.78% 
// Memory 48.61 MB Beats 32.89%

import java.util.Arrays;

public class Q888 {
    static int bS(int arr[], int t) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l - (l - r) / 2;
            if (arr[mid] < t)
                l = mid + 1;
            else if (arr[mid] > t)
                r = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    static int sumArr(int[] arr) {
        int sum = 0;
        for (int n : arr)
            sum += n;
        return sum;
    }

    public int[] swapper(int[] giver, int G, int[] taker, int T) {
        for (int i = 0; i < giver.length; i++) {
            int give = giver[i];
            int take = T - G + 2 * give;
            if (take % 2 != 0)
                continue;

            int takeIndex = bS(taker, take / 2);
            if (takeIndex != -1)
                return new int[] { giver[i], taker[takeIndex] };
        }
        return new int[] { -1, -1 };
    }

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int bsum = sumArr(bobSizes);
        int asum = sumArr(aliceSizes);
        Arrays.sort(bobSizes);
        return swapper(aliceSizes, asum, bobSizes, bsum);
    }
}