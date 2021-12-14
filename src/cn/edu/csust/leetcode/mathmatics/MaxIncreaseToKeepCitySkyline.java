//package cn.edu.csust.leetcode;
//class Solution{
//    public int maxIncreaseKeepingSkyline(int[][] grid) {
//        int sum = 0;
//        int row = grid.length;
//        int col = grid[0].length;
//
//        int [] rowMax = new int[row];
//        int [] colMax = new int[col];
//
//        for (int i = 0; i < row; i++) {
//            rowMax[i] = grid[i][0];
//        }
//
//        for (int i = 0; i < col; i++) {
//            colMax[i] = grid[0][i];
//        }
//
//        for (int i = 0;i < row;i++) {
//            for (int j = 0;j < col;j++) {
//                if(grid[i][j] > rowMax[i]){
//                    rowMax[i] = grid[i][j];
//                }
//                if(grid[i][j] > colMax[j]){
//                    colMax[j] = grid[i][j];
//                }
//
//            }
//        }
//        for (int i = 0;i < row;i++) {
//            for (int j = 0;j < col;j++) {
//                sum += Math.min(rowMax[i], colMax[j]) - grid[i][j];
//            }
//        }
//        return sum;
//    }
//}
//public class MaxIncreaseToKeepCitySkyline {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int [][] grid = new int[][]{
//                {3, 0, 8, 4},
//                {2, 4, 5, 7},
//                {9, 2, 6, 3},
//                {0, 3, 1, 0}
//        };
//        System.out.println(solution.maxIncreaseKeepingSkyline(grid));
//    }
//}
