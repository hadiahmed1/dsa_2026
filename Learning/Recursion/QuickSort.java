import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int li, int ri) {
        int l = li, r = ri;
        if (l >= r)
            return;
        int pivot = arr[l + (r - l) / 2];
        System.out.print("Pivot =" + pivot);
        while (l <= r) {
            while (arr[l] < pivot) {
                l++;
            }

            while (arr[r] > pivot) {
                r--;
            }
            if (l <= r) {
                int temp = arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
                l++;
                r--;
            }
        }
        System.out.println("l=" + l + " r= " + r + "  " + Arrays.toString(arr));
        // arr[l] = pivot;
        quickSort(arr, li, r);
        quickSort(arr, l, ri);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 7, 1, 9, 6, 3, 8 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
