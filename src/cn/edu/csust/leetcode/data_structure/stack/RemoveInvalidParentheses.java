//package cn.edu.csust.leetcode.data_structure.stack;

import java.util.ArrayList;
import java.util.List;

//
//import java.util.*;
//// DFS
////1.这个题可以用堆栈，
//// 但是由于只有小括号，
//// 所以堆栈有点多余，
//// 直接用一个统计变量统计是否有不匹配的左右括号即可
//class Solution {
////    检测右括号检测是否多余
//    char[] pair = new char[]{'(', ')'};
//    char[] rePair = new char[]{')', '('};
//    public List<String> removeInvalidParentheses(String s) {
//        List<String> result = new ArrayList<>();
//        removeHelper(s, result, 0, 0, pair);
//        return result;
//    }
//    private void removeHelper(String s, List<String> result, int lastI, int lastJ, char [] pa){
////        count用于记录有多少个不合法括号，count>0,左括号不合法，count < 0右括号不合法
//        int count = 0;
//        for (int i = lastI; i < s.length(); i++) {
//            if(s.charAt(i) == pa[0]){
//                count++;
//            }
//            if(s.charAt(i) == pa[1]){
//                count--;
//            }
//            if(count<0){
//                for (int j = lastJ; j <= i; j++) {
//                    if(s.charAt(j) == pa[1] && (j == lastJ||s.charAt(j - 1) != pa[1])){
//                        String newStr = s.substring(0, j) + s.substring(j + 1);
//                        removeHelper(newStr, result, i, j, pa);
//                    }
//                }
//                return;
//            }
//        }
//        StringBuilder stringBuilder = new StringBuilder(s);
//        stringBuilder.reverse();
//        s = stringBuilder.toString();
//        if(pa[0] == '('){
//            removeHelper(s, result, 0, 0, rePair);
//        }
//        else{
//            result.add(s);
//        }
//    }
//}
//public class RemoveInvalidParentheses {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
////        System.out.println(solution.removeInvalidParentheses("))(("));
////        System.out.println(solution.removeInvalidParentheses("()())()"));
//        System.out.println(solution.removeInvalidParentheses("(a)())()"));
//    }
//}
