//package cn.edu.csust.leetcode.algorithm.greedy;
//
//import java.util.Arrays;
//
///**
// * 贪心算法
// */
//class Solution {
//    public int findContentChildren(int[] g, int[] s) {
//        int count = 0;
//        int i = 0;
//        int j = 0;
//        Arrays.sort(g);
//        Arrays.sort(s);
//        while(i < g.length && j < s.length){
//            if(g[i] <= s[j]){
//                i++;
//                j++;
//                count++;
//            }
//            else{
//                j++;
//            }
//        }
//        return count;
//    }
//}
//public class AssignCookies {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.findContentChildren(new int []{1, 2}, new int[]{1, 1}));
//    }
//}
