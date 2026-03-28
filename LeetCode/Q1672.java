package LeetCode;
// Q: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum 
// wealth.

// Runtime: 0ms Beats 100.00%
// Memory 44.62MB Beats 50.05
class Q1672 {
    public int arrSum(int[] arr) {
        int sum = 0;
        for (int n: arr)
            sum += n;
        return sum;
    }
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] acc: accounts)
            max = Math.max(max, arrSum(acc));
        return max;
    }
}
