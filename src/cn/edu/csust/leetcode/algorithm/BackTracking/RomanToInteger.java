//package cn.edu.csust.leetcode.Array;
//
//import java.nio.charset.StandardCharsets;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//class Solution {
//    public int getValue(String s){
//        switch (s)
//        {
//            case "I": return 1;
//            case "V": return 5;
//            case "X": return 10;
//            case "L": return 50;
//            case "C": return 100;
//            case "D": return 500;
//
//            case "M": return 1000;
//        }
//        return -1;
//    }
//    public int romanToInt(String s) {
//        if ("".equals(s)|| s == null)
//            return 0;
//
//        int result = 0;
//
//        int temp = this.getValue(s.substring(0, 1));
//        for(int i = 0;i < s.length() - 1;i++){
//            int firstValue = temp;
//            int second = this.getValue(s.substring(i + 1, i + 2));
//            if (firstValue >= second){
//                result += firstValue;
//            }
//            else{
//                result -= firstValue;
//            }
//            temp = second;
//
//        }
//        result += this.getValue(s.substring(s.length() - 1));
//        return result;
//    }
//}
//public class RomanToInteger {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.romanToInt("MCMXCIV"));
//    }
//}
