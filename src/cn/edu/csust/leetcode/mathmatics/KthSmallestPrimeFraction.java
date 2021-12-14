//package cn.edu.csust.leetcode;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//
//class Solution {
//    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//        int n = arr.length;
//        int [] ret = new int[]{arr[0], arr[n -1]};
//        if(n == 2){
//            return ret;
//        }
//        int fs = 0;
//        int fe = n - 2;
//        int ss = 1;
//        int se = n - 1;
//        int count = 1;
//        while(count<k){
//            if(arr[fs] / (arr[fe] + 0.0) < arr[ss] / (arr[se] + 0.0)){
//
//                ret[0] = arr[fs];
//                ret[1] = arr[fe];
//                fe--;
//                if(fs == fe){
//
//                    fs = ss;
//                    fe = se;
//                    ss++;
//                    se = n - 1;
//                }
//
//
//            }
//            else{
//                ret[0] = arr[ss];
//                ret[1] = arr[se];
//                se--;
//                if(ss == se){
//                    ss++;
//                    se = n - 1;
//                }
//            }
//            count++;
//            System.out.println(count + " :" + Arrays.toString(ret));
//        }
//        return ret;
//    }
//}
//public class KthSmallestPrimeFraction {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//
////        System.out.println(Arrays.toString(solution.kthSmallestPrimeFraction(new int[]{1, 2, 3, 5}, 3)));
////        System.out.println(Arrays.toString(solution.kthSmallestPrimeFraction(new int[]{1, 7}, 1)));
////        System.out.println(Arrays.toString(solution.kthSmallestPrimeFraction(new int[]{1,7,23,29,47}, 8)));
////        System.out.println(Arrays.toString(solution.kthSmallestPrimeFraction(new int[]{1,3,5,29,53,79,83,97}, 24)));
//        System.out.println(Arrays.toString(solution.kthSmallestPrimeFraction(new int[]{1,3,5,7,11,29,37,53,79,97}, 38)));
//    }
//}
