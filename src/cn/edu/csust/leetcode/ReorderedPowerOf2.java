package cn.edu.csust.leetcode;
//
//import java.util.*;

import java.util.Arrays;

////时空Beats双90%
//class Solution{
//    public boolean reorderedPowerOf2(int N){
//        int [] mapN = new int[10];
//
//        int count = getNumberMap(N, mapN);
//        for(int i = 29;i>=0;i--){
//            int t = (1<<i);
//            int [] mapPow = new int[10];
//            int countT = getNumberMap(t, mapPow);
//            if(countT == count && Arrays.equals(mapPow, mapN)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public int getNumberMap(int num, int [] count){
//
//        int n = 0;
//        while(num != 0){
//            count[num % 10]++;
//            num /= 10;
//            n++;
//        }
//        return n;
//    }
//}
//class Solution2 {
//    public boolean reorderedPowerOf2(int n) {
//        List<Map<Integer, Integer>> power2MapList = new ArrayList<>();
//        Map<Integer, Integer> map = getNumberMap(n);
//        int [] interval = getInterval(n);
//        for (int num = interval[0];num <= interval[interval.length - 1];num++) {
//            Map<Integer, Integer> map1 = getNumberMap((1 << num));
//            if(map1.equals(map)) return true;
//
//        }
//        return false;
//    }
//    private Map<Integer, Integer> getNumberMap(int n){
//        Map<Integer, Integer> map = new HashMap<>();
//        while(n != 0){
//            int num = n % 10;
//            n /= 10;
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        return map;
//    }
//    private int [] getInterval(int n){
//        if(n < 10){
//            return new int[]{0,3};
//        }
//        else if(n < 100){
//            return new int[]{4, 6};
//        }
//        else if(n < Math.pow(10, 3)){
//            return new int[]{7, 9};
//        }
//        else if(n < Math.pow(10, 4)){
//            return new int[]{10, 13};
//        }
//        else if(n < Math.pow(10, 5)){
//            return new int[]{14, 16};
//        }
//        else if(n < Math.pow(10, 6)){
//            return new int[]{17, 19};
//        }
//        else if(n < Math.pow(10, 7)){
//            return new int[]{20,23};
//        }
//        else if(n < Math.pow(10, 8)){
//            return new int[]{24, 26};
//        }
//        return new int[]{27, 29};
//
//    }
//}
//
//public class ReorderedPowerOf2 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.reorderedPowerOf2(265));
//        System.out.println(solution.reorderedPowerOf2(145));
//    }
//}
