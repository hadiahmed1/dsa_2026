import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[], int i, int pass) {
        System.out.println("pass="+pass+"  i="+i);
        if (pass == arr.length)
            return; // all pass completed
        if (i == arr.length - pass) {
            System.out.println("Going to next pass");
            bubbleSort(arr, 0, pass + 1); // this pass was completed
            return;
        }

        if (arr[i] > arr[i + 1]) {
            // swap
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        bubbleSort(arr, i + 1, pass);

    }

    public static void main(String[] args) {
        int arr[] = {4,9, 3, 5, 2, 7, 5 -1, 12};
        bubbleSort(arr, 0, 1);
        System.out.println(Arrays.toString(arr));

    }
}
