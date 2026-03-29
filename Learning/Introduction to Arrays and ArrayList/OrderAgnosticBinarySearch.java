public class OrderAgnosticBinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        boolean isAscending = arr[l] < arr[r];
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target) {
                if (isAscending)
                    l = mid + 1;
                else
                    r = mid - 1;
            } else {
                if (isAscending)
                    r = mid - 1;
                else
                    l = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrA = { 2, 3, 4, 6, 8, 9, 13, 14, 17, 26, 29 };
        int[] arrD = { 37, 32, 24, 21, 19, 16, 12, 10, 7, 5, 2 };

        System.out.println(binarySearch(arrD, 32));
        System.out.println(binarySearch(arrD, 2));
        System.out.println(binarySearch(arrA, 17));
        System.out.println(binarySearch(arrA, 9));
    }
}
