package Learning.Recursion;

import java.util.ArrayList;

class IsArraySorted {
    static boolean isSorted(int[] arr, int index){
        if(index == arr.length -1) return true;
        if(arr[index] > arr[index +1]) return false;
        return isSorted(arr, index+1);
    }

    static int linearSearch(int[] arr, int target, int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        return linearSearch(arr, target, index+1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        if(index == arr.length) return new ArrayList<Integer>();
        ArrayList<Integer> list = findAllIndex(arr, target, index+1);
        if(arr[index] == target) list.add(index);
        return list;
    }

    static int binarySearch(int[] arr, int l, int r, int target) {
        if(l>r) return-1;
        int mid = l - (l-r)/2;
        if(arr[mid] < target) return binarySearch(arr, mid + 1, r, target);
        else if(arr[mid] > target) return binarySearch(arr, l, mid - 1, target);
        else return mid;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,8,9};
        System.out.println(isSorted(arr, 0));
        System.out.println(linearSearch(arr, 6, 0));
        for (int i : arr) {
            System.out.println("Index of"+i+" = "+ binarySearch(arr, 0, arr.length-1, i));
        }
        System.out.println(findAllIndex(arr, 4, 0));
    }
}