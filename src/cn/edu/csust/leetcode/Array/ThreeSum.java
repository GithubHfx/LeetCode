//package cn.edu.csust.leetcode.Array;
//
//import java.util.*;
////// 此方法用Java实现超级慢
////class Solution {
////    public List<List<Integer>> threeSum(int[] nums) {
////        List<List<Integer>> ret = new ArrayList<>();
////        if(nums == null || nums.length < 3)
////            return ret;
////        if (nums.length == 3 && nums[0] + nums[1] + nums[2] == 0){
////            List<Integer> list = new ArrayList<>();
////            list.add(nums[0]);
////            list.add(nums[1]);
////            list.add(nums[2]);
////            ret.add(list);
////            return ret;
////        }
////        Arrays.sort(nums);
////        Map<Integer, Integer> map = new LinkedHashMap<>();
////        for(int i = 0;i<nums.length;i++){
////            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
////        }
////        Object[] keys = map.keySet().toArray();
////        for (int  i = 0;i<keys.length;i++){
////            Integer keyI = (Integer)keys[i];
////            boolean moreThanTwice = map.get(keyI) >= 2;
////            if (keyI == 0 && map.get(0) > 2){
////                List<Integer> list = new ArrayList<>();
////                list.add(0);
////                list.add(0);
////                list.add(0);
////                ret.add(list);
////            }
////            for (int j = i + 1; j < keys.length; j++){
////                Integer keyJ = (Integer)keys[j];
////                if(moreThanTwice && (keyI * 2 + keyJ == 0)){
////                    List<Integer> list = new ArrayList<>();
////                    list.add(keyI);
////                    list.add(keyI);
////                    list.add(keyJ);
////                    ret.add(list);
////                }
////                if (map.get(keyJ) >= 2 && keyJ * 2 + keyI == 0){
////                    List<Integer> list = new ArrayList<>();
////                    list.add(keyI);
////                    list.add(keyJ);
////                    list.add(keyJ);
////                    ret.add(list);
////                }
////                int c = -keyI - keyJ;
////                if (c > keyJ && map.getOrDefault(c, 0) > 0){
////                    List<Integer> list = new ArrayList<>();
////                    list.add(keyI);
////                    list.add(keyJ);
////                    list.add(c);
////                    ret.add(list);
////                }
////            }
////        }
////        return ret;
////    }
////}
//// 双指针法 比较快
//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                return result;
//            }
//
//            if (i > 0 && nums[i] == nums[i - 1]) {
//                continue;
//            }
//
//            int left = i + 1;
//            int right = nums.length - 1;
//            while (right > left) {
//                int sum = nums[i] + nums[left] + nums[right];
//                if (sum > 0) {
//                    right--;
//                } else if (sum < 0) {
//                    left++;
//                } else {
//                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
//
//                    while (right > left && nums[right] == nums[right - 1]) right--;
//                    while (right > left && nums[left] == nums[left + 1]) left++;
//
//                    right--;
//                    left++;
//                }
//            }
//        }
//        return result;
//    }
//}
//public class ThreeSum {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.threeSum(new int[]{-1,0,1,2,-1,-4}));
//    }
//
//}
