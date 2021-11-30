//package cn.edu.csust.leetcode.Array;
//// time: beats97%
//// memory: beats67%
//class Solution{
//    public int minPathSum(int [] [] grid){
//        int m = grid.length, n = grid[0].length;
//        for (int i = 1; i < n; i++) {
//            grid[0][i] += grid[0][i - 1];
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(j == 0){
//                    grid[i][j] += grid[i - 1][j];
//                }
//                else{
//                    grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
//                }
//            }
//        }
//        return grid[m - 1][n - 1];
//    }
//}
//public class MinPathSum {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.minPathSum(new int[][]{
//                {1, 2, 3},
//                {4, 5, 6}
//        }));
//        System.out.println(solution.minPathSum(new int[][]{
//                {1, 3, 1},
//                {1, 5, 1},
//                {4, 2, 1}
//        }));
//    }
//}
