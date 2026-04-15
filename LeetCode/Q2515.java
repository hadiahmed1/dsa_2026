// 2515. Shortest Distance to Target String in a Circular Array

// You are given a 0-indexed circular string array words and a string target. A circular array means that the array's end connects to the array's beginning.
// Formally, the next element of words[i] is words[(i + 1) % n] and the previous element of words[i] is words[(i - 1 + n) % n], where n is the length of words.
// Starting from startIndex, you can move to either the next word or the previous word with 1 step at a time.
// Return the shortest distance needed to reach the string target. If the string target does not exist in words, return -1.

// Runtime 1 ms Beats 29.87% 
// Memory 46.57 MB Beats 79.22%

public class Q2515 {
    public int closestTarget(String[] arr, String t, int si) {
        int r = 0;
        int l = 0;
        while(r < arr.length) {
            if(arr[(si + r)%arr.length].equals(t)) break;
            r++;
        }

        while(l < arr.length) {
            int pos;
            if(l<=si) pos = si -l;
            else pos = arr.length - (l - si);
            if(arr[pos].equals(t)) break;
            l++;
        }

        if (r == arr.length) return -1;

        return Math.min(l,r);   
    }
}
