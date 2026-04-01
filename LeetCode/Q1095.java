// 1095. Find in Mountain Array
// You may recall that an array arr is a mountain array if and only if: arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
// Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

// Runtime 9 ms Beats 0.42% 
// Memory 46.52 MB Beats 71.62%


class Q1095 {
    public static int agnosticBS(MountainArray arr, int target, int l, int r, boolean isAsc) {
        while (l <= r) {
            int mid = l - (l-r) / 2;
            System.out.println(l + " " + r + " ->" + mid);
            int mVal = arr.get(mid);
            if (mVal < target) {
                if (isAsc)
                    l = mid + 1;
                else
                    r = mid - 1;
            } else if (mVal > target) {
                if (isAsc)
                    r = mid - 1;
                else
                    l = mid + 1;
            } else
                return mid;
        }
        return -1;
    }

    public static int findPeakIndex(MountainArray arr) {
        int l = 1;
        int r = arr.length() - 2;
        while (l < r) {
            int mid = r - (r - l) / 2;
            // System.out.println(l + " " + r + " ->" + mid);
            int mVal = arr.get(mid);
            if (mVal < arr.get(mid - 1)) // right slope
                r = mid - 1;
            else if (mVal < arr.get(mid + 1)) //left slope
                l = mid + 1;
            else
                return mid;
        }
        return l;
    }

    public int findInMountainArray(int target, MountainArray arr) {
        int peak = findPeakIndex(arr);
        int left = agnosticBS(arr, target, 0, peak, true);
        if (left != -1)
            return left;
        int right = agnosticBS(arr, target, peak, arr.length() - 1, false);
        return right;
    }
}