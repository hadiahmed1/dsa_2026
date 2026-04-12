package Learning;

import java.util.Arrays;

public class CyclicSort {
    static void display(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            while (arr[i] != i + 1) { // swap index i with index arr[i] -1
                display(arr);
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }

    }

    public static void main(String[] args) {
        System.out.println("CYCLIC SORT");
        int[] arr = { 5, 3, 9, 4, 7, 1, 6, 8, 2};
        cyclicSort(arr);
        display(arr);
    }
}
