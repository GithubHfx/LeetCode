//package cn.edu.csust.leetcode;
//class Solution{
//    public boolean isPerfectSquare(int num){
//        int end = 1 << 16;
//        int temp= 0;
//        for (int i = 1; i < end; i++) {
//            if(temp == num){
//                return true;
//            }
//            else if(temp > num){
//                return false;
//            }
//        }
//        return false;
//    }
////    凡是在线性有序数组中查找可以考虑二分法
//        public boolean isPerfectSquare2(int num) {
//            int low = 1;
//            int high = num;
//            while (low <= high) {
//                int mid = low + (high - low) / 2;
//                // int product = mid * mid;   越界
//                int t = num / mid;
//                if (t == mid) {
//                    if (num%mid == 0) return true;
//                    low = mid + 1;
//                } else if (t < mid) {
//                    high = mid - 1;
//                } else {
//                    low = mid + 1;
//                }
//            }
//
//            return false;
//        }
//}
//public class ValidPerfectSquare {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.isPerfectSquare(14));
//    }
//}
