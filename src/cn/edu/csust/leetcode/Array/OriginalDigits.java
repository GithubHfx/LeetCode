//package cn.edu.csust.leetcode.Array;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.PriorityQueue;
//
///**
// * 首先确定偶数:
// *  0由z决定
// *  2有w决定
// *  4由u决定
// *  6由x决定
// *  8由g决定
// *  9 = 'i' - 'x' - 'g' - 'f' + 'u'
// *  7 = 's' - '6' = 's' - 'x'
// *  5 = 'f' - '4'
// *    = 'f' - 'u'
// *  3 = 'r' - '0' - '4' = 'r' - 'u' - 'z'
// *  1 = 'o' - '0' - '2' - '4'
// *    = 'o' - 'z' - 'w' - 'u'
// */
//class Solution{
//    PriorityQueue<String> queue = new PriorityQueue<>();
//    public String originalDigits(String s) {
//        int [] alphaFreq = new int[26];
//        int [] nums = new int[10];
//        for (int i = 0; i < s.length(); i++) {
//            alphaFreq[s.charAt(i) - 'a']++;
//        }
//        nums[0] = alphaFreq['z' - 'a'];
//        nums[2] = alphaFreq['w' - 'a'];
//        nums[4] = alphaFreq['u' - 'a'];
//        nums[6] = alphaFreq['x' - 'a'];
//        nums[8] = alphaFreq['g' - 'a'];
//
//        nums[1] = alphaFreq['o' - 'a'] - nums[0] - nums[2] - nums[4];
//        nums[3] = alphaFreq['r' - 'a'] - nums[4] - nums[0];
//        nums[5] = alphaFreq['f' - 'a'] - nums[4];
//        nums[7] = alphaFreq['s' - 'a'] - nums[6];
//        nums[9] = alphaFreq['i' - 'a'] - nums[5] - nums[6] - nums[8];
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < nums[i]; j++) {
//                stringBuilder.append(i);
//            }
//        }
//        return stringBuilder.toString();
//    }
//}
//public class OriginalDigits {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.originalDigits("owoztneoer"));
//        System.out.println(solution.originalDigits("fviefuro"));
//    }
//}
