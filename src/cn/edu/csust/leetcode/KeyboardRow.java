//package cn.edu.csust.leetcode;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Solution{
//    public String[] findWords(String[] words) {
//        int [] alphaRow = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
//        List<String> list = new ArrayList<>();
//        for (String word: words) {
//            boolean flag = true;
//            String temp = word.toLowerCase();
//            int first = alphaRow[temp.charAt(0) - 'a'];
//            for (int i = 1, j = temp.length() - 1; i <= j ; i++,j--) {
//                if(alphaRow[temp.charAt(i) - 'a'] != first || alphaRow[temp.charAt(j) - 'a']!= first){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                list.add(word);
//            }
//        }
//        String [] strings = new String[list.size()];
//        return list.toArray(strings);
//    }
//}
//public class KeyboardRow {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.findWords(new String[]{"adsdf","sfd"})));
//    }
//}
