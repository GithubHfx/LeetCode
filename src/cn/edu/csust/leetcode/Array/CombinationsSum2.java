//package cn.edu.csust.leetcode.Array;
//
//import java.util.*;
//
//class Solution {
//    List<List<Integer>> result = new ArrayList<>();
//    List<Integer> path = new ArrayList<>();
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        if(candidates.length == 0){
//            return result;
//        }
////        排序
//        Arrays.sort(candidates);
//        dfs(candidates, target, 0);
//        return result;
//    }
//
//    private void dfs(int [] candidates, int target, int index) {
//        if(target == 0){
//            result.add(new ArrayList<>(path));
//            return ;
//        }
//        for (int i = index;i < candidates.length;i++){
//            if(candidates[i] <= target){
//                if(i > index && candidates[i] == candidates[i - 1])
//                {
//                    continue;
//                }
//                path.add(candidates[i]);
//                dfs(candidates, target - candidates[i], i + 1);
//                path.remove(path.size() - 1);
//            }
//        }
//    }
//}
//public class CombinationsSum2 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
//    }
//}