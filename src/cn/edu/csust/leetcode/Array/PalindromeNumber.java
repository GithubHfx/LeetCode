//package cn.edu.csust.leetcode.Array;
//
//class Solution{
//    public boolean isPalindrome(int x) {
//        if (x < 0)
//            return  false;
//        int reverseNum = 0;
//        int num = x;
//        while (num != 0){
//            reverseNum = reverseNum * 10 + num % 10;
//            num /= 10;
//        }
//        return reverseNum == x;
//    }
//}
//public class PalindromeNumber {
//    public static void main(String[] args) {
//        System.out.println(new Solution().isPalindrome(-121));
//    }
//}
