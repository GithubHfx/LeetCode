//package cn.edu.csust.leetcode.Array;
//class Solution{
//    public boolean isValidSudoku(char [][] nums) {
//        boolean [][] rowbuf = new boolean[9][9], colbuf = new boolean[9][9], subbox = new boolean[9][9];
//        for(int row = 0;row < 9;row++) {
//            for (int col = 0; col < 9; col++) {
//                if(nums[row][col] != '.'){
//                    int num = (nums[row][col] - '1');
//                    boolean[] subbox1 = subbox[row / 3 * 3 + col / 3];
//                    if(rowbuf[row][num] || colbuf[col][num] || subbox1[num]){
//                        return false;
//                    }
//                    rowbuf[row][num] = true;
//                    colbuf[col][num] = true;
//                    subbox1[num] = true ;// r,c 转换到box⽅格中
//                }
//
//            }
//        }
//        return true;
//    }
//}
//public class ValidSudoKu {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        char [][] grid = new char[][]{
//                {'5','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}};
//        System.out.println(solution.isValidSudoku(grid));
//    }
//}
