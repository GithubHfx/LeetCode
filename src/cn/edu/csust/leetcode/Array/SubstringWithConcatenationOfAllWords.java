//package cn.edu.csust.leetcode.Array;
//
//import java.util.*;
//
//class Solution{
//    public List<Integer> findSubstring(String s, String [] words){
//        List<Integer> list = new ArrayList<>();
//        if(words.length == 0){
//            return list;
//        }
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String word: words) {
//            map.put(word, map.getOrDefault(word, 0) + 1);
//        }
//
//        int length = words[0].length(), totalLen = words.length * words[0].length();
//        Map<String, Integer> tmpMap = (Map<String,Integer>)map.clone();
//        for(int i = 0, start = 0; i < s.length() - length + 1;i++){
//            String sub = s.substring(i, i + length);
//            if(tmpMap.getOrDefault(sub, 0) > 0){
//                tmpMap.put(sub, tmpMap.get(sub) - 1);
//                if(checkWords(tmpMap) && (i + length - start) == totalLen){
//                    list.add(start);
//                    continue;
//                }
//                i = i + length - 1;
//            }
//            else{
//                start ++;
//                i = start - 1;
//                tmpMap = (Map<String, Integer>) map.clone();
//            }
//
//        }
//        return list;
//    }
//
//    private boolean checkWords(Map<String, Integer> tmpMap) {
//        Set<String> strings = tmpMap.keySet();
//        for (String s:
//             strings) {
//            if(tmpMap.get(s) > 0){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//public class SubstringWithConcatenationOfAllWords {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.findSubstring("barfoofoobarthefoobarman",new String[]{"bar", "foo", "the"}));
//    }
//}
