public class Ceil {
    static int ceil(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            // System.out.println("l="+arr[l]+" mid="+arr[mid]+" r="+arr[r]);
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return arr[l];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 8, 9, 9, 9, 12, 15, 19, 20, 20, 20, 20, 20, 20, 26, 29, 31, 31, 36, 39, 42 };
        System.out.println("Ceil of " + 5 + " = " + ceil(arr, 5));
        System.out.println("Ceil of " + 12 + " = " + ceil(arr, 12));
        System.out.println("Ceil of " + 24 + " = " + ceil(arr, 24));
        System.out.println("Ceil of " + 36 + " = " + ceil(arr, 36));
    }
}
