import java.util.Scanner;

public class BinarySearch2D {

    public static int[][] inputArray(Scanner sc) {
        System.out.print("r = ");
        int r = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        return arr;
    }

    public static int[] binarySearch2D(int[][] arr, int target) {
        int[] ans = { -1, -1 };
        int r = 0;
        int c = arr[0].length - 1;
        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                ans[0] = r;
                ans[1] = c;
                break;
            } else if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = inputArray(sc);
        int target = 0;
        while (target != -1) {
            System.out.println("What do you want to find?");
            target = sc.nextInt();
            int[] ans = binarySearch2D(arr, target);
            System.out.println("R = " + ans[0] + "  C=" + ans[1]);
        }
        sc.close();
    }
}
