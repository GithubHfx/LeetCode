//package cn.edu.csust.leetcode;
//
//import java.util.Arrays;
//
//class Solution{
//    public int[] singleNumber(int [] nums){
//        if(nums.length == 2){
//            return nums;
//        }
////        第一次遍历得到异或结果
//        int sum = 0;
//        int [] res = new int[2];
//        for (int num: nums) {
//            sum ^= num;
//        }
////        取出异或结果最高位的1，其他位舍弃
//        int len = 1;
//        while((sum & 1) == 0) {
//            sum >>= 1;
//            len <<= 1;
//        }
////        以最高位位区别，如果最高位为1，那么res[0]与之异或，否则res[1]与之异或
//        for (int num: nums) {
//            if((num & len) != 0){
//                res[0] ^= num;
//            }
//            else{
//                res[1] ^= num;
//            }
//        }
//        return res;
//    }
//}
//public class SingleNum2 {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.singleNumber(new int[]{1,2,1,3,2,5})));
//    }
//
//}
