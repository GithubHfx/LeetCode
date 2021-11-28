//package cn.edu.csust.leetcode;
//class Solution {
//    public int maxCount(int m, int n, int[][] ops) {
//        if(ops.length == 0)
//            return m * n;
//        int minRow=ops[0][0];
//        int minCol=ops[0][1];
//        for(int i=1;i<ops.length;i++){
//            if(ops[i][0]<minRow){
//                minRow = ops[i][0];
//            }
//            if(ops[i][1]<minCol){
//                minCol = ops[i][1];
//            }
//        }
//        return minRow * minCol;
//    }
//}
//public class RangeAddition2 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.maxCount(3, 3, new int[][]{{2, 2}, {3, 3}}));
//    }
//}
