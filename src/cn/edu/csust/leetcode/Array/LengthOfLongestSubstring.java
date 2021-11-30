//package cn.edu.csust.leetcode.Array;
//
//import java.nio.charset.StandardCharsets;
//
//// 滑动窗口 位图
//class Solution{
//    public int lengthOfLongestSubstring(String s) {
//        if (s == null || s.equals("")){
//            return 0;
//        }
//        byte[] asc = s.getBytes(StandardCharsets.UTF_8);
//        int [] freq = new int[256];
//        int result = 0;
//        int left = 0;
//        int right = -1;
//
//        for (;left < asc.length;)
//        {
//            if (right + 1 < asc.length && freq[asc[right + 1]] == 0){
//                freq[asc[right + 1]]++;
//                right++;
//            }
//            else{
//                freq[asc[left]]--;
//                left++;
//            }
//            int temp = right - left + 1;
//            result = result > temp?result:temp;
//        }
//        return result;
//    }
//}
//public class LengthOfLongestSubstring {
//
//    public static void main(String[] args) {
//        String s = "abc";
//        Solution solution = new Solution();
//        System.out.println(solution.lengthOfLongestSubstring(s));
//    }
//}
