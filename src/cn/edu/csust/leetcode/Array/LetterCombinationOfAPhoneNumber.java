//package cn.edu.csust.leetcode.Array;
//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//// 比较慢，通过递归算法
////class Solution{
////    public String[] getAlphas(String digit){
////        switch (digit){
////            case "2":return new String[]{"a", "b", "c"};
////            case "3":return new String[]{"d", "e", "f"};
////            case "4":return new String[]{"g", "h", "i"};
////            case "5":return new String[]{"j", "k", "l"};
////            case "6":return new String[]{"m", "n", "o"};
////            case "7":return new String[]{"p", "q", "r", "s"};
////            case "8":return new String[]{"t", "u", "v"};
////            case "9":return new String[]{"w", "x", "y", "z"};
////        }
////        return null;
////    }
////    public List<String> letterCombinations(String digits) {
////        List<String> list  = new ArrayList<>();
////        if (digits.length() == 0)
////            return list;
////        Collections.addAll(list, this.getAlphas(digits.substring(0, 1)));
////        List<String> temp = new ArrayList<>();
////        for(int i = 1; i < digits.length();i++){
////            temp.clear();
////            String [] tempAlphas = this.getAlphas(digits.substring(i, i + 1));
////            for(int j = 0;j < tempAlphas.length; j ++){
////                String join = String.join(tempAlphas[j] + "_", list) + tempAlphas[j];
////                Collections.addAll(temp, join.split("_"));
////            }
////            list.clear();
////            list.addAll(temp);
////        }
////
////        return list;
////    }
////}
//
////回溯法 100 %
//class Solution{
//    List<String> res = new ArrayList<>();
//    public String[] getAlphas(String digit){
//        switch (digit){
//            case "2":return new String[]{"a", "b", "c"};
//            case "3":return new String[]{"d", "e", "f"};
//            case "4":return new String[]{"g", "h", "i"};
//            case "5":return new String[]{"j", "k", "l"};
//            case "6":return new String[]{"m", "n", "o"};
//            case "7":return new String[]{"p", "q", "r", "s"};
//            case "8":return new String[]{"t", "u", "v"};
//            case "9":return new String[]{"w", "x", "y", "z"};
//        }
//        return null;
//    }
//    public List<String> letterCombinations(String digits){
//        if (digits == null || "".equals(digits))
//            return  res;
//        findCombination(digits, 0, "");
//        return res;
//    }
//    public void findCombination(String digits, int index, String s){
//        if (index == digits.length()){
//            res.add(s);
//            return;
//        }
//        String [] temp = this.getAlphas(digits.substring(index, index + 1));
//        for(int i = 0;i<temp.length;i++){
//            findCombination(digits, index + 1, s + temp[i]);
//        }
//    }
//}
//public class LetterCombinationOfAPhoneNumber {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.letterCombinations("234"));
//    }
//}
