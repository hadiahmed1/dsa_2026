package Learning.Recursion;

public class RotatedBS {
    static int search(int[] arr, int target, int s, int e) {
        if (s > e)
            return -1;
        int mid = e - (e - s) / 2;
        if (arr[mid] == target)
            return mid;

        if (arr[s] <= arr[mid]) { // this part is sorted
            if (target < arr[mid] && target >= arr[s])
                return search(arr, target, s, mid - 1);
            else
                return search(arr, target, mid + 1, e);
        }

        if (target > arr[mid] && target <= arr[e]) {
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 17, 19, 19, 23, 27, 29, 29, 1, 4, 6, 6, 9, 12, 14 };
        for (int i : arr) {
            System.out.println(i + " -> " + search(arr, i, 0, arr.length - 1));
        }
    }
}
