//package cn.edu.csust.leetcode.Array;
//class Solution{
//    public boolean match(Character a, Character b) {
//        return a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']';
//    }
//    public boolean isValid(String s){
//        int i = 0;
//        int j = 0;
//        char [] ch = new char[s.length()];
//        if (s.length() % 2 == 1)
//            return false;
//        for(int k = 0;k<s.length();k++){
//            char charK =s.charAt(k);
//            if(charK == '(' || charK == '{' || charK == '['){
//                ch[i++] = charK;
//            }
//            else{
//                if(i == 0)
//                    return false;
//                else if(this.match(ch[i - 1], charK)){
//                    i--;
//                }
//                else
//                {
//                    return false;
//                }
//            }
//        }
//        return i == 0;
//    }
//}
//public class ValidParentheses {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.isValid("([)]"));
//    }
//}
