import java.util.Arrays;

public class MergeSort {

    public static void merge(int[] arr, int l, int r, int mid) {
        int sorted[] = new int[r - l + 1];
        int il = l;
        int ir = mid + 1;
        int index = 0;
        while (il <= mid && ir <= r) {
            if (arr[il] < arr[ir]) {
                sorted[index++] = arr[il];
                il++;
            } else {
                sorted[index++] = arr[ir];
                ir++;
            }
        }

        if (il <= mid) {
            while (il <= mid) {
                sorted[index++] = arr[il++];
            }
        } else if (ir <= r) {
            while (ir <= r) {
                sorted[index++] = arr[ir++];
            }
        }

        // copy soted into origninal
        for (int i = 0; i < sorted.length; i++) {
            arr[l + i] = sorted[i];
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r)
            return; // allready sorted

        int mid = l + (r-l) / 2;
        mergeSort(arr, l, mid); // sorting left part
        mergeSort(arr, mid + 1, r); // sorting right part
        merge(arr, l, r, mid); // merge the 2 sorted parts

    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, -4, 7, 2, -1, 4, 8, -2, 0, 1, 2, 5, -1 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
