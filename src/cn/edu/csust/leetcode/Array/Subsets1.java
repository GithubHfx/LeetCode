//package cn.edu.csust.leetcode.Array;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
////纯粹用组合思想做题
//class Solution {
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        for (int i = 0; i <= nums.length; i++) {
//            result.addAll(combinations(nums, nums.length, i));
//        }
//        return result;
//    }
//
//    private List<List<Integer>> combinations(int[] nums, int n, int k) {
//        List<List<Integer>> list = new ArrayList<>();
//        if(k == 0){
//            list.add(new ArrayList<>());
//            return list;
//        }
//        if(k == 1){
//            for (int i = 0; i < n; i ++) {
//                List<Integer> list1 = new ArrayList<>();
//                list1.add(nums[i]);
//                list.add(list1);
//            }
//
//            return list;
//        }
//        else if(k == n){
//            List<Integer> list1 = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                list1.add(nums[i]);
//            }
//            list.add(list1);
//            return list;
//        }
//        List<List<Integer>> ChooseKFromN_1 = combinations(nums, n - 1, k);
//        List<List<Integer>> ChoooseK_1FromN_1 = combinations(nums, n - 1, k - 1);
//        for (List<Integer> listTmp: ChoooseK_1FromN_1) {
//            listTmp.add(nums[n - 1]);
//        }
//        list.addAll(ChooseKFromN_1);
//        list.addAll(ChoooseK_1FromN_1);
//        return list;
//    }
//}
//
//class Solution2 {
//    List<List<Integer>> result = new ArrayList<>();// 存放符合条件结果的集合
//    LinkedList<Integer> path = new LinkedList<>();// 用来存放符合条件结果
//    public List<List<Integer>> subsets(int[] nums) {
//        if (nums.length == 0){
//            result.add(new ArrayList<>());
//            return result;
//        }
//        subsetsHelper(nums, 0);
//        return result;
//    }
//
//    private void subsetsHelper(int[] nums, int startIndex){
//        result.add(new ArrayList<>(path));//「遍历这个树的时候，把所有节点都记录下来，就是要求的子集集合」。
//        if (startIndex >= nums.length){ //终止条件可不加
//            return;
//        }
//        for (int i = startIndex; i < nums.length; i++){
//            path.add(nums[i]);
//            subsetsHelper(nums, i + 1);
//            path.removeLast();
//        }
//    }
//}
//
//public class Subsets1 {
//    public static void main(String[] args) {
//        Solution2 solution = new Solution2();
//        List<List<Integer>> subsets = solution.subsets(new int[]{1, 2, 3, 4});
//        System.out.println(subsets.size());
//        subsets.forEach(System.out::println);
//    }
//}
