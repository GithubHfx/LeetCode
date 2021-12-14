//package cn.edu.csust.leetcode.Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
////class Solution{
////    public int init(char [][] board,int [] empty_set){
////        int count = 0;
////        for(int row = 0;row < 9;row++) {
////            for (int col = 0; col < 9; col++) {
////                if(board[row][col] == '.'){
////                    empty_set[count] = row  * 9 + col;
////                    count ++;
////                }
////            }
////        }
////        return count;
////    }
////    public void solveSudoku(char[][] board) {
////        int [] empty_set = new int[81];
////        int empty_count = this.init(board, empty_set);
////        for (int i = 0; i < 9; i++) {
////
////            if(this.DFS((char)(i + '1'), board, empty_set, empty_count, 0)){
////                return;
////            }
////        }
////
////    }
////
////    private boolean DFS(char c, char[][] board, int[] empty_set, int empty_count, int index) {
////        int row = empty_set[index] / 9;
////        int col = empty_set[index] % 9;
////
////        if(checkTarget(c, row, col, board)){
////            board[row][col] = c;
////            if(index + 1 == empty_count) {
////                return true;
////            }
////            else{
////                for (int i = 0; i < 9; i++) {
////                    boolean flag = DFS((char) (i + '1'), board, empty_set, empty_count, index + 1);
////                    if(flag) {
////                        return true;
////                    }
////
////                }
////                board[row][col] = '.';
////                return false;
////            }
////        }
////        else{
////            return false;
////        }
////
////    }
////
////    private boolean checkTarget(char ch, int row, int col, char[][] board) {
////        return checkRow(ch, row, board) && checkCol(ch,col, board) && checkGrid(ch, row, col, board);
////    }
////
////    private boolean checkGrid(char ch, int row, int col, char[][] board) {
////        row = row / 3 * 3;
////        col = col / 3 * 3;
////        for (int i = 0; i < 3; i++) {
////            for (int j = 0; j < 3; j++) {
////                if(board[row+i][col + j] == ch){
////                    return false;
////                }
////            }
////        }
////        return true;
////    }
////
////    private boolean checkCol(char ch, int col, char[][] board) {
////        for (int i = 0; i < 9; i++) {
////            if(board[i][col] == ch)
////                return false;
////        }
////        return true;
////    }
////
////    private boolean checkRow(char ch, int row, char[][] board) {
////        for (int i = 0; i < 9; i++) {
////            if(board[row][i] == ch)
////                return false;
////        }
////        return true;
////    }
////
////}
//class Solution{
//    public void solveSudoku(char[][] board){
//        /**
//         * 记录某行，某位数字是否已经被摆放
//         */
//        boolean [][] row = new boolean[9][9];
//
//        /**
//         * 记录某列数某个数字是否被占用
//         */
//        boolean [][] col = new boolean[9][9];
//
//        /**
//         * 记录网格中是否有重复数字
//         */
//        boolean [][] grid = new boolean[9][9];
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
////                记录有数字的位置
//                if (board[i][j] != '.') {
//
//                    int num = board[i][j] - '1';
//                    row[i][num] = true;
//                    col[j][num] = true;
//                    grid[i / 3 * 3 + j / 3][num] = true;
//                }
//            }
//        }
//        dfs(board, row, col, grid, 0, 0);
//    }
//
//    private boolean dfs(char[][] board, boolean[][] row, boolean[][] col, boolean[][] grid, int i, int j) {
//        while(board[i][j] != '.'){
//            if(++j >= 9){
//                i ++;
//                j = 0;
//            }
//            if(i >= 9){
//                return true;
//            }
//        }
//        for (int k = 0; k < 9; k++) {
//            int blockIndex = i / 3 * 3 + j / 3;
//            if (!row[i][k] && !col[j][k] && !grid[blockIndex][k]) {
//                // 递归
//                board[i][j] = (char) ('1' + k);
//                row[i][k] = true;
//                col[j][k] = true;
//                grid[blockIndex][k] = true;
//                if (dfs(board, row, col, grid, i, j)) {
//                    return true;
//                } else {
//                    // 回溯
//                    row[i][k] = false;
//                    col[j][k] = false;
//                    grid[blockIndex][k] = false;
//                    board[i][j] = '.';
//                }
//            }
//
//        }
//        return false;
//    }
//}
////快很多
//class Solution2 {
//    public void solveSudoku(char[][] board) {
//        /**
//         * 记录某行，某位数字是否已经被摆放
//         */
//        boolean[][] row = new boolean[9][9];
//        /**
//         * 记录某列，某位数字是否已经被摆放
//         */
//        boolean[][] col = new boolean[9][9];
//        /**
//         * 记录某 3x3 宫格内，某位数字是否已经被摆放
//         */
//        boolean[][] block = new boolean[9][9];
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (board[i][j] != '.') {
//                    int num = board[i][j] - '1';
//                    row[i][num] = true;
//                    col[j][num] = true;
//                    // blockIndex = i / 3 * 3 + j / 3，取整
//                    block[i / 3 * 3 + j / 3][num] = true;
//                }
//            }
//        }
//        dfs(board, row, col, block, 0, 0);
//    }
//
//    private boolean dfs(char[][] board, boolean[][] row, boolean[][] col, boolean[][] block, int i, int j) {
//        // 找寻空位置
//        while (board[i][j] != '.') {
//            if (++j >= 9) {
//                i++;
//                j = 0;
//            }
//            if (i >= 9) {
//                return true;
//            }
//        }
//        for (int num = 0; num < 9; num++) {
//            int blockIndex = i / 3 * 3 + j / 3;
//            if (!row[i][num] && !col[j][num] && !block[blockIndex][num]) {
//                // 递归
//                board[i][j] = (char) ('1' + num);
//                row[i][num] = true;
//                col[j][num] = true;
//                block[blockIndex][num] = true;
//                if (dfs(board, row, col, block, i, j)) {
//                    return true;
//                } else {
//                    // 回溯
//                    row[i][num] = false;
//                    col[j][num] = false;
//                    block[blockIndex][num] = false;
//                    board[i][j] = '.';
//                }
//            }
//        }
//        return false;
//    }
//
//    private void printBoard(char[][] board) {
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class SudokuSolver {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        char [][] grid = new char[][]{
//        {'5','3','.','.','7','.','.','.','.'},
//        {'6','.','.','1','9','5','.','.','.'},
//        {'.','9','8','.','.','.','.','6','.'},
//        {'8','.','.','.','6','.','.','.','3'},
//        {'4','.','.','8','.','3','.','.','1'},
//        {'7','.','.','.','2','.','.','.','6'},
//        {'.','6','.','.','.','.','2','8','.'},
//        {'.','.','.','4','1','9','.','.','5'},
//        {'.','.','.','.','8','.','.','7','9'}};
//        solution.solveSudoku(grid);
//        for (int i = 0; i < grid.length; i++) {
//            for (int i1 = 0; i1 < grid[0].length; i1++) {
//                System.out.print(grid[i][i1] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
