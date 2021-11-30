//package cn.edu.csust.leetcode.Array;
//
//import java.util.Arrays;
//import java.util.Map;
//import java.util.TreeMap;
////不止一点点的慢
////class Solution{
////    public int findLHS(int[] nums) {
////        Map<Integer, Integer> map = new TreeMap<>();
////        int max = 0;
////        for (int i = 0; i < nums.length; i++) {
////            int num = nums[i];
////            map.put(num, map.getOrDefault(num, 0) + 1);
////            int lastNum = map.getOrDefault(num - 1, 0);
////            int nextNum = map.getOrDefault(num + 1, 0);
////            if(lastNum != 0 || nextNum != 0)
////                max = Math.max(max, map.get(num) + Math.max(lastNum, nextNum));
////        }
////
////        return max;
////    }
////}
//
//// 滑窗
//class Solution {
//    public int findLHS(int[] nums) {
//        Arrays.sort(nums);
//        int begin = 0,res = 0;
//        for(int end = 0;end < nums.length;end++){
////            当begin等于end的时候就会自动停止循环，这个时候nums[end] - nums[begin] == 0
//            while(nums[end] - nums[begin] > 1)
//                begin++;
//            if(nums[end] - nums[begin] == 1)
//                res = Math.max(res,end - begin + 1);
//        }
//        return res;
//    }
//}
//public class LongestHarmoniousSubsequence {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.findLHS(new int[]{1,3,2,2,5,2,3,7}));
//        System.out.println(solution.findLHS(new int[]{1,1, 1, 1}));
//        System.out.println(solution.findLHS(new int[]{1,2, 3,4 }));
//    }
//}
