//package cn.edu.csust.leetcode;
//// 比较有意思，这个提的思路大致都懂，但是需要做到时间最优需要技巧，例如剪枝
//class Solution {
//    public int findNthDigit(int n) {
//        long k = n;
//        for (int i = 1; ; i++) {
//            if (i * Math.pow(10, i) > k) {
//                return Long.toString((int) (k / i)).charAt((int) (k % i)) - '0';
//            }
//            k += Math.pow(10, i);
//        }
//    }
//}
//public class KthDigit {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.findNthDigit(50));
//    }
//}
