//package cn.edu.csust.leetcode.DynamicProgramming;
//// 递归方式超级慢
////class Solution{
////    public int climbStairs(int n) {
////        if(n <= 1){
////            return 1;
////        }
////        return climbStairs(n - 1) + climbStairs(n - 2);
////    }
////}
//// 非递归的方法
////class Solution{
////    public int climbStairs(int n){
////        if(n <= 1){
////            return 1;
////        }
////        int [] dp = new int[2];
////        dp[0] = 1;
////        dp[1] = 1;
////        int sum = 0;
////        for (int i = 2; i <= n; i++) {
////            sum = dp[0] + dp[1];
////            dp[0] = dp[1];
////            dp[1] = sum;
////        }
////        return sum;
////    }
////}
//public class ClimbingStairs {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        for (int i = 1; i <= 45; i++) {
//            System.out.println("i = " + i + "共行走:" + solution.climbStairs(i) + "步");
//        }
//    }
//}
