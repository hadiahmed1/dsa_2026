// Q39. Combination Sum

// Runtime 2 ms Beats 94.94%
// Memory 45.5 MB Beats 90.90%

import java.util.*;

class Q39 {
    static List<List<Integer>> ans;

    static void recSum(int[] arr, int sum, int index, ArrayList<Integer> list, int target) {
        if(sum == target) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        if (index == arr.length || sum > target)
            return;

        // Branch 1: TAKE arr[index]
        list.add(arr[index]);
        recSum(arr, sum + arr[index], index, list, target);

        // Branch 2: SKIP arr[index] (move to next)
        list.remove(list.size() - 1); // backtrack
        recSum(arr, sum, index + 1, list, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<List<Integer>>();

        recSum(candidates, 0, 0, new ArrayList<Integer>(), target);

        return ans;
    }
}
