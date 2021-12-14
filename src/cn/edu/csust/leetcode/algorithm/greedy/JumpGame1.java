//package cn.edu.csust.leetcode.Array;
////time: 100% beats
//class Solution{
//    public boolean canJump(int[] nums) {
//        int initStep = 1;
//        for (int i = nums.length - 2; i >= 0 ; i--) {
//            if(nums[i] >= initStep){
//                initStep = 0;
//            }
//            initStep++;
//        }
//
//        return initStep == 1;
//    }
//}
//public class JumpGame1 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.canJump(new int[]{3,2,1,0,4}));
//    }
//}
