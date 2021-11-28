//package cn.edu.csust.leetcode.Array;
//
///**
// * 多将计算转换为位运算
// *
// */
//class Solution {
//    public int reverse(int x) {
//        if (x == 0)
//            return 0;
//
//        boolean isMinus = x < 0;
////        将数字后面的0给剔除掉
//        long num = isMinus?-x: x;
////        数字翻转算法
//        long ret = 0;
//        while (num != 0){
//            ret = ret * 10 + num % 10;
//            num /= 10;
//        }
//        ret = isMinus?-ret:ret;
////        界限判定
//        if (ret > 1 << 31 - 1 || ret < -(1 << 31))
//            return 0;
//        return (int)ret;
//    }
//}
//public class ReverseInteger {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.reverse(1534236469));
//    }
//}
