// 1346. Check If N and Its Double Exist
// Given an array arr of integers, check if there exist two indices i and j such that :
// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]

// Runtime 7 ms Beats 6.40%
// Memory 45.25 MB Beats 10.32%

import java.util.Arrays;
public class Q1346 {
    public static int binarySearch(int[] arr, int l, int target) {
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l - (l - r) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) r = mid -1;
            else l = mid+1;
        }
        // System.out.println(target + " not found");
        return -1;
    }

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            int target = 2*arr[i];
            // for negatives
            if(arr[i]<0){
                if(arr[i]%2 !=0) continue;
                target = arr[i]/2;
            }
            if (binarySearch(arr, i+1, target) != -1) return true;
            if(2*arr[i]>max) return false;
        }
        return false;
    }
}
