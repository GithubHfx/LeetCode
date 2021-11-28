//package cn.edu.csust.leetcode.Array;
//
//class Solution {
//    public int[][] generateMatrix(int n) {
//        int [][] matrix = new int[n][n];
//        int total = n * n;
//        int count = 0;
//        int row = 0, col = 0;
//        if(n == 1){
//            matrix[0][0] = 1;
//            return matrix;
//        }
//        while(count < total){
//            int temp = col;
//            for (;col  < n && matrix[row][col] == 0; col++) {
//
//                matrix[row][col] = ++count;
//            }
//            if(col != temp) col--;
//            row++;
//            temp = row;
//            for(;row < n && matrix[row][col] == 0; row++){
//                matrix[row][col] = ++count;
//            }
//            if(row != temp)row -- ;
//            col--;
//            temp = col;
//            for (;col  >= 0 && matrix[row][col] == 0; col--) {
//                matrix[row][col] = ++count;
//            }
//            if(col != temp) col++;
//            row--;
//            temp = row;
//            for(;row >= 0 && matrix[row][col] == 0; row--){
//                matrix[row][col] = ++count;
//            }
//            if(row != temp)row ++ ;
//            col++;
//        }
//        return matrix;
//    }
//}
//public class SpiralMatrix2 {
//    public static void main(String[] args) {
//        int [][] matrix = null;
//        int n = 5;
//        Solution solution = new Solution();
//        matrix = solution.generateMatrix(n);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
