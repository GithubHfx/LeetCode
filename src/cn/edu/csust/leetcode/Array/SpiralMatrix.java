//package cn.edu.csust.leetcode.Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        int height = matrix.length, width = matrix[0].length;
//        int total = height * width;
//        List<Integer> result = new ArrayList<>(total);
//        int row = 0, col = 0;
//        if(height == 1){
//            while(col < width){
//                result.add(matrix[row][col++]);
//            }
//            return result;
//        }
//        else if(width == 1){
//            while(row < width){
//                result.add(matrix[row++][col]);
//            }
//            return result;
//        }
//        while(result.size() < total){
//            int temp = col;
//            for (;col  < width && matrix[row][col] != 101; col++) {
//                result.add(matrix[row][col]);
//                matrix[row][col] = 101;
//            }
//            if(col != temp) col--;
//            row++;
//            temp = row;
//            for(;row < height && matrix[row][col] != 101; row++){
//                result.add(matrix[row][col]);
//                matrix[row][col] = 101;
//            }
//            if(row != temp)row -- ;
//            col--;
//            temp = col;
//            for (;col  >= 0 && matrix[row][col] != 101; col--) {
//                result.add(matrix[row][col]);
//                matrix[row][col] = 101;
//            }
//            if(col != temp) col++;
//            row--;
//            temp = row;
//            for(;row >= 0 && matrix[row][col] != 101; row--){
//                result.add(matrix[row][col]);
//                matrix[row][col] = 101;
//            }
//            if(row != temp)row ++ ;
//            col++;
//        }
//        return result;
//    }
//}
//public class SpiralMatrix {
//    public static void main(String[] args) {
//        int [][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        Solution solution = new Solution();
//        System.out.println(solution.spiralOrder(matrix));
//    }
//}
