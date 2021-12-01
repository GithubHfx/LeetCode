//package cn.edu.csust.leetcode.algorithm.bipointer;
//class Solution {
//    public int maxPower(String s) {
//        int n = s.length();
//        int fast = 0;
//        int slow = 0;
//        int maxConsequetiveCount = 1;
//        while(fast < n){
//            slow = fast;
//            while(fast < n && s.charAt(slow) == s.charAt(fast)) fast++;
//            maxConsequetiveCount = Math.max(maxConsequetiveCount, fast - slow);
//        }
//        return maxConsequetiveCount;
//    }
//}
//public class ConsecutiveCharacter {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.maxPower("leetcode"));
//        System.out.println(solution.maxPower("abbcccddddeeeeedcba"));
//        System.out.println(solution.maxPower("triplepillooooow"));
//        System.out.println(solution.maxPower("hooraaaaaaaaaaay"));
//        System.out.println(solution.maxPower("tourist"));
//    }
//}
