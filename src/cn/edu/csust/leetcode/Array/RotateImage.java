//package cn.edu.csust.leetcode.Array;
//class Solution{
//    public void rotate(int [][] img){
//        int len = img.length;
//        int [][] rotated = new int[len][len];
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                rotated[i][j] = img[len - j - 1][i];
//            }
//        }
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < len; j++) {
//                img[i][j] = rotated[i][j];
//            }
//        }
//    }
//}
//public class RotateImage {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int [][] img = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//        solution.rotate(img);
//        for (int i = 0; i < img.length; i++) {
//            for (int j = 0; j < img.length; j++) {
//                System.out.print(img[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
