//package cn.edu.csust.leetcode.Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class Solution{
//    List<List<Integer>> result = new ArrayList<>();
//    public  List<List<Integer>> combinationSum(int [] candidates, int target){
//        if(candidates.length == 0){
//            return result;
//        }
//        Arrays.sort(candidates);
//        List<Integer> res = new ArrayList<>();
//        findCombinations(candidates, target, 0, res);
//        return result;
//    }
//
//    private void findCombinations(int[] candidates, int target, int index, List<Integer> res) {
//        if(target <= 0){
//            if(target == 0){
//                List<Integer> dst = new ArrayList<>(Arrays.asList(new Integer[res.size()]));
//                Collections.copy(dst, res);
//                result.add(dst);
//            }
//            return;
//        }
//        for(int i = index; i < candidates.length; i++) {
//            if(candidates[i] > target) { // 这⾥可以剪枝优化
//                break;
//            }
//            res.add(candidates[i]);
//            findCombinations(candidates, target-candidates[i], i, res); // 注意这⾥迭代的时候index 依旧不变，因为⼀个元素可以取多次
//            res.remove(res.size() - 1);
//        }
//    }
//}
//public class CombinationsSum {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int [] candidates = new int[]{2,3,6,7};
//        int target = 7;
//        List<List<Integer>> lists = solution.combinationSum(candidates, target);
//        for (List<Integer> list: lists) {
//            System.out.println(list);
//        }
//    }
//}
