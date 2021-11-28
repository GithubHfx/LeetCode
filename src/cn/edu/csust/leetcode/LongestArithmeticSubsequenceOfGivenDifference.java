//package cn.edu.csust.leetcode;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//
//    public int longestSubsequence(int[] arr, int difference) {
//        int res = 1;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = arr.length - 1; i >= 0; i--) {
//            int key = arr[i] + difference;
//            Integer val = map.get(key);
//            if(val != null){
//                int temp = val + 1;
//                res = Math.max(res, temp);
//                map.put(arr[i], temp);
//                //System.out.println(key + " exists! Now remove " + key + " put " + arr[i]+ " and the value of " + arr[i] + " is: " + temp);
//            }
//            else{
//                map.put(arr[i], 1);
//                //System.out.println(key + " does not exist! put " + arr[i]);
//            }
//        }
//        return res;
//    }
//    public int longestSubsequence2(int[] arr, int difference) {
//        int res = 1;
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int key = arr[i] - difference;
//            Integer val = map.get(key);
//            if(val != null){
//                int temp = val + 1;
//                res = Math.max(res, temp);
//                map.put(arr[i], temp);
//            }
//            else{
//                map.put(arr[i], 1);
//            }
//        }
//        return res;
//    }
//}
//public class LongestArithmeticSubsequenceOfGivenDifference {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.longestSubsequence(new int []{1,2,3, 4,5, 7}, 1));
//        System.out.println(solution.longestSubsequence(new int []{1,5,7,8,5,3,4,2,1}, -2));
//    }
//}
