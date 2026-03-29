// Q 744. Find Smallest Letter Greater Than Target
// You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

// Runtime 0ms Beats 100.00% 
// Memory 46.07MB Beats 96.55%



class Q744 {
    public int charBS (char[] arr, char target) {
        int l = 0;
        int r = arr.length -1;
        int mid = 0;
        while(l <= r) {
            mid = l - (l-r)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] < target) l = mid+1;
            else r = mid -1;
        }
        return mid;
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int mid = charBS(letters, target);
        while(mid < letters.length){
            if(letters[mid] > target) break;
            mid ++;
        }
        try {
        if(letters[mid] > target) return letters[mid];
        } catch (Exception e){
        return letters[0];

        }
        return letters[0];
    }
}