//package cn.edu.csust.leetcode.Array;
//
//class Solution {
//    public boolean detectCapitalUse(String word) {
//        boolean all_upper = Character.isUpperCase(word.charAt(0));
//        boolean all_lower = Character.isLowerCase(word.charAt(0));
//        boolean firstUpper = all_upper;
//        for(int i= 1;i<word.length();i++){
//            char ch = word.charAt(i);
//            all_upper = all_upper && Character.isUpperCase(ch);
//            all_lower = all_lower && Character.isLowerCase(ch);
//            firstUpper = firstUpper && Character.isLowerCase(ch);
//        }
//        return all_upper || all_lower || firstUpper;
//    }
//}
//public class DetectCapital {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.detectCapitalUse("USA"));
//        System.out.println(solution.detectCapitalUse("leetcode"));
//        System.out.println(solution.detectCapitalUse("Flag"));
//        System.out.println(solution.detectCapitalUse("FlaG"));
//    }
//}