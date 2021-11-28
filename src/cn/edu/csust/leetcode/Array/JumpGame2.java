//package cn.edu.csust.leetcode;
//
//class Solution {
//    public int jump(int [] nums){
//        if(nums.length == 1){
//            return 0;
//        }
//        int currentDist = 0;
//        int nextDist = 0;
//        int count = 0;
//        for(int i = 0;i<nums.length - 1;i++){
//            nextDist = Math.max(nums[i] + i, nextDist);
//            if(i == currentDist){
//                count++;
//                currentDist = nextDist;
//            }
//        }
//        return count;
//    }
//}
//
//public class JumpGame {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.jump(new int []{2,3,0,1,4}));
//    }
//}
