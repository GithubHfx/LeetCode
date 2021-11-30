//package cn.edu.csust.leetcode.Array;
////机器人一定会走m+n-2步，即从m+n-2中挑出m-1步向下走不就行了吗？即C（（m+n-2），（m-1））。
//class Solution {
////    二维数组方式
//    public int uniquePaths2(int m, int n) {
//        int [] [] dp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            dp[i][0] = 1;
//        }
//        for (int i = 0; i < n; i++) {
//            dp[0][i] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//            }
//        }
//        return dp[m - 1][n - 1];
//    }
////    一维数组的方式
//    public int uniquePaths(int m, int n) {
//
//        int [] dp = new int[n];
//        for (int i = 0; i < n; i++) {
//            dp[i] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                dp[j] += dp[j - 1];
//            }
//        }
//        return dp[n - 1];
//    }
//}
//public class UniquePaths {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.uniquePaths(3, 7));
//    }
//}
