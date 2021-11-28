//package cn.edu.csust.leetcode.Array;
//
//import java.util.HashSet;
//import java.util.Set;
//
//class Solution {
//    public boolean buddyStrings(String s, String goal) {
//        if(s.length() == 1 || goal.length() == 1)
//            return false;
//        int lenS = s.length();
//        int lenG = goal.length();
//        if(lenG != lenS) return false;
//        Set<Character> set = new HashSet<>();
//
//        int i = 0;
//        int j = lenS - 1;
////        从前往后找不同
//        while(i < lenS && s.charAt(i) == goal.charAt(i)){
//            set.add(s.charAt(i));
//            i ++;
//        }
////        若全相同
//        if(i == lenS){
////            若有重复字符串则为True
//            if(set.size() != lenS) return true;
//            return false;
//        }
////        若不全相同
//        while(j > i && s.charAt(j) == goal.charAt(j)){
//            j--;
//        }
//        if(j != i){
//            String newStr = s.substring(0, i) + s.charAt(j) + s.substring(i + 1, j) + s.charAt(i) + s.substring(j + 1);
//            return newStr.equals(goal);
//        }
//        return false;
//    }
//
//}
//class Solution2 {
//    public boolean buddyStrings(String A, String B) {
//        if (A.length() != B.length()) {
//            return false;
//        } else if (A.equals(B)) {
//            for (int i = 0; i < A.length(); i++)
//                if (A.indexOf(A.charAt(i)) != i)
//                    return true;
//        }
//        int count = 0;
//        char strA1 = 0, strA2 = 0, strB1 = 0, strB2 = 0;
//        for (int i = 0; i < A.length(); i++) {
//            if (A.charAt(i) != B.charAt(i)) {
//                count++;
//                if (count == 1) {
//                    strA1 = A.charAt(i);
//                    strB1 = B.charAt(i);
//                }
//                if (count == 2) {
//                    strA2 = A.charAt(i);
//                    strB2 = B.charAt(i);
//                }
//            }
//            if (count > 2)
//                return false;
//        }
//        return count == 2 && strA1 == strB2 && strA2 == strB1;
//    }
//}
//public class BuddyStrings {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.buddyStrings("ba", "ab"));
//    }
//}
