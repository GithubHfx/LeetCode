//package cn.edu.csust.leetcode;
//import java.util.HashSet;
//import java.util.Set;
//
//class  Solution{
//    public int distributeCandies(int[] candyType) {
//        Set<Integer> set = new HashSet<>();
//        int len = candyType.length;
//        for (int i = 0; i < len && set.size() < len / 2;) {
//            set.add(candyType[i++]);
//        }
//        return set.size();
//    }
//}
//public class DistributeCandidates {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.distributeCandies(new int[]{1,1,2,3}));
//    }
//}
