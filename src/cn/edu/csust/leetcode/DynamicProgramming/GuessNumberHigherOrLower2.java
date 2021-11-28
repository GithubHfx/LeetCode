//package cn.edu.csust.leetcode.DynamicProgramming;
//class Solution {
//    public int getMoneyAmount(int n) {
//        int [][] dp = new int [n + 1][n + 1];
//        int ret = dfs(dp, 0, n);
//        return ret;
//    }
//
//    private int dfs(int[][] dp, int left, int right) {
//        if(left >= right){
//            return 0;
//        }
//        if(dp[left][right] != 0){
//            return dp[left][right];
//        }
//        int ret = 1000;
//        for(int i = left; i <= right; i++){
//            int cost = i + Math.max(dfs(dp, left, i - 1), dfs(dp, i + 1, right));
//            ret = Math.min(ret, cost);
//        }
//        dp[left][right] = ret;
//        return ret;
//    }
//}
//public class GuessNumberHigherOrLower2 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        for (int i = 1; i <= 32; i++) {
//
//            System.out.println(solution.getMoneyAmount(i));
//        }
//    }
//}
