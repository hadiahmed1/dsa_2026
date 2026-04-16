// 3488. Closest Equal Element Queries

// You are given a circular array nums and an array queries.
// For each query i, you have to find the following:
// The minimum distance between the element at index queries[i] and any other index j in the circular array, where nums[j] == nums[queries[i]]. If no such index exists, the answer for that query should be -1.
// Return an array answer of the same size as queries, where answer[i] represents the result for query i.

// Runtime 110 ms Beats 54.55%
// Memory 189.92 MB Beats 29.29%

import java.util.*;
class Q3488 {
    static int distance(int s, int e, int len) {
        int r, l;
        if (s == e)
            return 0;
        else if (s < e) {
            r = e - s;
            l = s + len - e;
            return Math.min(r, l);
        }
        r = len - s + e;
        l = s - e;
        return Math.min(r, l);
    }

    public HashMap<Integer, ArrayList<Integer>> indexMap(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int e = arr[i];
            m.putIfAbsent(e, new ArrayList<>());
            m.get(e).add(i);
        }

        return m;
    }

    public List<Integer> solveQueries(int[] nums, int[] queries) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> m = indexMap(nums);
        for (int q : queries) {
            int e = nums[q % nums.length];

            ArrayList<Integer> indexes = m.get(e);
            // System.out.println(e+ " ->" + indexes.toString());
            int n = indexes.size();
            int current = q % nums.length;
            if (n < 2) {
                arr.add(-1);
                continue;
            }
            int pos = Collections.binarySearch(indexes, current);

            int left = indexes.get((pos - 1 + n) % n);
            int right = indexes.get((pos + 1) % n);

            int ans = Math.min(
                    distance(current, left, nums.length),
                    distance(current, right, nums.length));

            arr.add(ans);
        }

        return arr;
    }
}