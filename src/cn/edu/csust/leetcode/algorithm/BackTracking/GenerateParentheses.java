//package cn.edu.csust.leetcode.Array;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Solution{
//    List<String> list = new ArrayList<>();
//    public List<String> generateParenthesis(int n) {
//
//        generate(n, n, "");
//        return list;
//    }
//    public void generate(int left, int right, String s){
//        if (left == 0 && right == 0 && !"".equals(s)){
//            list.add(s);
//        }
//        if(left > 0){
//            generate(left - 1, right, s + "(");
//
//        }
//        if(right > left){
//            generate(left, right - 1, s + ")");
//        }
//
//    }
//}
//public class GenerateParentheses {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.generateParenthesis(3));
//    }
//}
