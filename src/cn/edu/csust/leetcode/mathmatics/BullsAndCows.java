//package cn.edu.csust.leetcode;
//
//import java.util.*;
//
//class Solution{
//    public String getHint(String secret, String guess) {
//        int countA = 0;
//        int countB = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        List<Character> list = new ArrayList<>();
//        for (int i = 0; i < secret.length(); i++) {
//            char charSecret = secret.charAt(i);
//            char charGuess = guess.charAt(i);
//            if(charSecret == charGuess){
//                countA++;
//            }
//            else{
//                list.add(charGuess);
//                map.put(charSecret, map.getOrDefault(charSecret, 0) + 1);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            char charGuess = list.get(i);
//            if(map.getOrDefault(charGuess, 0) > 0){
//                map.put(charGuess, map.get(charGuess) - 1);
//                if(map.get(charGuess) == 0){
//                    map.remove(charGuess);
//                }
//                countB++;
//            }
//        }
//        return countA + "A" + countB + "B";
//    }
//    public String getHint2(String secret, String guess) {
//        int countA = 0;
//        int countB = 0;
//        int [] nums = new int [10];
//        for (int i = 0; i < secret.length(); i++) {
//            char charSecret = secret.charAt(i);
//            char charGuess = guess.charAt(i);
//            if(charSecret == charGuess){
//                countA++;
//            }
//            else{
//                if(nums[charGuess - '0'] ++ < 0)countB++;
//                if(nums[charSecret - '0'] -- > 0) countB++;
//            }
//        }
//        return countA + "A" + countB + "B";
//    }
//}
//public class BullsAndCows {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.getHint("1122", "2211"));
//        System.out.println(solution.getHint("11", "10"));
//    }
//}
