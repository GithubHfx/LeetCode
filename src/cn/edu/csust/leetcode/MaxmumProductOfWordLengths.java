//package cn.edu.csust.leetcode;
//
///**
// *
// */
//class Solution {
//    public int maxProduct(String[] words) {
//        int [] hash = new int[words.length];
//        int max = 0;
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words[i].length(); j++) {
//                hash[i] |= (1 << words[i].charAt(j) - 'a');
//            }
//        }
//        for (int i = 0; i < words.length; i++) {
//            for (int j = i+1; j < words.length; j++) {
//                if((hash[i] & hash[j]) == 0){
//                    max = Math.max(words[i].length() * words[j].length(), max);
//                }
//            }
//        }
//        return max;
//    }
//}
//public class MaxmumProductOfWordLengths {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        String [] words = new String[]{"abcw","baz","foo","bar","xtfn","abcdef"};
//        System.out.println(solution.maxProduct(words));
//    }
//}
