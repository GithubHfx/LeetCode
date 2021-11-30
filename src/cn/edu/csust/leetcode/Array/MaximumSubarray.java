//package cn.edu.csust.leetcode.Array;
//////比较慢
////class Solution{
////    // 动态规划:状态转移方程dp[i] = nums[i] + dp[i - 1] (dp[i - 1] >= 0)
////    //                  dp[i] = nums[i] (dp[i - 1] <= 0)
////    public int maxSubArray(int [] nums){
////        int len = nums.length;
////        int [] dp = new int[len];
////        int res = nums[0];
////        dp[0] = nums[0];
////        for (int i = 1; i < len; i++) {
////            if(dp[i - 1] > 0){
////                dp[i] = dp[i - 1 ] + nums[i];
////            }
////            else{
////                dp[i] = nums[i];
////            }
////            res = dp[i] > res?dp[i] : res;
////        }
////        return res;
////    }
////}
//
//// 模拟方法击败90%
//class Solution{
//    public int maxSubArray(int [] nums){
//        int len = nums.length;
//        if(len == 1){
//            return nums[0];
//        }
//        int maxSum = nums[0], res = 0, p = 0;
//        while(p < len){
//            res += nums[p];
//            maxSum = res > maxSum ? res: maxSum;
//            res = res < 0 ?0:res;
//            p++;
//        }
//        return maxSum;
//    }
//}
//public class MaximumSubarray {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(
//                solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})
//        );
//    }
//}