//package cn.edu.csust.leetcode.stack;
//
//import java.util.Arrays;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Stack;
//
//// 双重循环
//class Solution {
//    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
//        int [] index = new int[nums1.length];
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        if(nums1.length == 0 || nums2.length == 0){
//            return index;
//        }
//        for (int j = 0; j < nums2.length; j++) {
//            map.put(nums2[j], j);
//        }
//        for (int i = 0; i < nums1.length; i++) {
//            index[i] = -1;
//            for (int j = map.get(nums1[i]) + 1; j < nums2.length; j++) {
//                if(nums2[j] > nums1[i]){
//                    index[i] = nums2[j];
//                    break;
//                }
//            }
//        }
//        return index;
//    }
//
//    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int [] index = new int[nums1.length];
//        Map<Integer, Integer> map = new LinkedHashMap<>();
//        Stack<Integer> stack = new Stack<>();
//        if(nums1.length == 0 || nums2.length == 0){
//            return index;
//        }
//        for (int num: nums2) {
//            while(!stack.empty() && stack.peek() < num){
//                map.put(stack.pop(), num);
//            }
//            stack.push(num);
//        }
//        for (int i = 0; i < nums1.length; i++) {
//            index[i] = map.getOrDefault(nums1[i], -1);
//        }
//        return index;
//    }
//}
//public class NexGreaterNumber {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{5, 3, 4, 1, 2})));
//    }
//}
