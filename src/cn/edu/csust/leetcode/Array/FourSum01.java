//package cn.edu.csust.leetcode.Array;
//
//import java.util.*;
//
///**
// * 算是暴力法，超级慢
// */
////class Solution{
////    public List<List<Integer>> fourSum(int[] nums, int target) {
////        List<List<Integer>> res = new ArrayList<>();
////
//////        判空
////        if (nums == null || nums.length == 0){
////            return res;
////        }
////        if (nums.length < 4){
////            return res;
////        }
//////        数组排序
////        Arrays.sort(nums);
////
//////        统计各个元素的个数
////        Map<Integer, Integer> map = new LinkedHashMap<>();
////        for(int i = 0;i<nums.length;i++){
////            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
////        }
////        Object[] keys = map.keySet().toArray();
////        for (int i = 0;i < keys.length;i++){
////            int keyI = (Integer)keys[i];
////            int freqI = map.get(keyI);
////            if(keyI * 4 == target && freqI > 3){
////                res.add(Arrays.asList(keyI, keyI, keyI, keyI));
////            }
////            for(int j = i + 1; j< keys.length;j++){
////                int keyJ = (Integer)keys[j];
////                int freqJ = map.get(keyJ);
////                if(keyI * 3 + keyJ == target && freqI > 2){
////                    res.add(Arrays.asList(keyI, keyI, keyI, keyJ));
////                }
////                if(keyI * 2 + keyJ * 2 == target && freqI > 1 && freqJ > 1){
////                    res.add(Arrays.asList(keyI, keyI, keyJ, keyJ));
////                }
////                if(keyI + keyJ * 3 == target && freqJ > 2){
////                    res.add(Arrays.asList(keyI, keyJ, keyJ, keyJ));
////                }
////                for (int k = j + 1;k < keys.length;k++){
////                    int keyK = (Integer)keys[k];
////                    if(keyI * 2 + keyJ + keyK == target && freqI > 1){
////                        res.add(Arrays.asList(keyI, keyI, keyJ, keyK));
////                    }
////                    if(keyI + keyJ * 2 + keyK== target && freqJ > 1){
////                        res.add(Arrays.asList(keyI, keyJ, keyJ, keyK));
////                    }
////                    if(keyI + keyJ + keyK * 2 == target && map.get(keyK) > 1){
////                        res.add(Arrays.asList(keyI, keyJ, keyK, keyK));
////                    }
////                    int c = target - keyI - keyJ - keyK;
////                    if (c > keyK && map.getOrDefault(c, 0) > 0){
////                        res.add(Arrays.asList(keyI, keyJ, keyK, c));
////                    }
////                }
////            }
////        }
////        return res;
////    }
////}
//class Solution{
//    public List<List<Integer>> fourSum(int [] nums, int target){
//        List<List<Integer>> res = new ArrayList<>();
//
//        //        判空
//        if (nums == null || nums.length == 0){
//            return res;
//        }
//        int n = nums.length;
//        if (n < 4){
//            return res;
//        }
//        //        数组排序
//        Arrays.sort(nums);
//        for(int i = 0;i<n;i++){
//            if (i > 0 && nums[i - 1] == nums[i]) continue;
//
//            for(int j = i + 1;j < n;j++){
//                if(j > i + 1 && nums[j - 1]==nums[j]) continue;
//                int p = j + 1;
//                int q = n - 1;
//
//                while(p < q){
//                    int temp = target - nums[i] - nums[j];
//                    int sum = nums[p] + nums[q];
//                    if(sum == temp){
//                        res.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
//                        while (p < q && nums[p +  1] == nums[p]) p++;
//                        while (p < q && nums[q -  1] == nums[q]) q--;
//                        p ++;
//                        q--;
//                    }
//                    else if(sum > temp){
//                        q--;
//                    }
//                    else{
//                        p++;
//                    }
//                }
//
//            }
//        }
//        return res;
//    }
//}
//public class FourSum01 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
//    }
//}
