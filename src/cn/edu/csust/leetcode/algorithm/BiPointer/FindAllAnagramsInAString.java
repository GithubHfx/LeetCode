package cn.edu.csust.leetcode.algorithm.BiPointer;

import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] mapS = new int[26];
        int [] mapP = new int[26];
        int left = 0;
        int right = p.length();
        List<Integer> list = new ArrayList<>();
        if(p.length() > s.length()){
            return list;
        }
        for (int i = 0; i < p.length(); i++) {
            mapS[s.charAt(i) - 'a']++;
            mapP[p.charAt(i) - 'a']++;
        }

        if(Arrays.equals(mapP, mapS)){
            list.add(left);
        }
        while(right < s.length()){
            mapS[s.charAt(left++)-'a']--;
            mapS[s.charAt(right++)-'a']++;
            if(Arrays.equals(mapP, mapS)){
                list.add(left);
            }
        }
         return list;
    }
}
public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findAnagrams("cbaebabacd", "abc"));
    }
}
