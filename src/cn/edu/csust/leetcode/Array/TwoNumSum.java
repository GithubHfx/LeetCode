package cn.edu.csust.leetcode.Array;

import java.util.*;
//此方案通过:时间2ms
//class Solution{
//    public int[] twoSum(int[] nums, int target) {
//        int i = 0, j = nums.length - 1;
//        Map<Integer, Integer> map = new HashMap<>();
//        //1.思路首先找到第一个元素，存入hashmap或者判断另一半的下表
//        for(;i<nums.length;i++){
//            int other = target - nums[i];
//            if (map.containsKey(other)){
//                return new int[]{i, map.get(other)};
//            }
//            else{
//                map.put(nums[i], i);
//            }
//        }
//        return null;
//    }
//}

////超级慢
//class Solution{
//    public int[] twoSum(int[] nums, int target) {
//
//        ArrayList<Integer> list = new ArrayList<>();
//        int i = 0;
//        for(i=0;i<nums.length;++i){
//            Collections.addAll(list, nums[i]);
//        }
//        //1.思路首先找到第一个元素，存入hashmap或者判断另一半的下表
//        for (i = 0;i<nums.length;i++){
//            int other = target - nums[i];
//            int index = list.indexOf(other);
//            if(index != -1 && index != i){
//                return new int[]{i, index};
//            }
//
//        }
//        return null;
//    }
//}
//public class TwoNumSum {
//
//    public static void main(String[] args) {
//        int [] nums = new int[]{3,3};
//        int target = 6;
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
//    }
//}
