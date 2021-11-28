//package cn.edu.csust.leetcode.Array;
//
///**
// * 本题三种思路:
// *  思路1：挨个找，从1-2^32次方找，时间复杂度不符合
// *  思路2：先排序在二分查找，排序时间复杂度不符合
// *  思路3：原地hash，将原来的数组作为hash表，达到时间复杂度和空间复杂度96%
// */
//class Solution{
//    public int firstMissingPositive(int[] nums) {
//        int len = nums.length;
//        for(int i = 0;i<len;i++){
//            while(nums[i] >= 1 && nums[i] <= len && nums[nums[i] - 1] != nums[i]){
//                int temp = nums[i];
//                nums[i] = nums[nums[i] - 1];
//                nums[nums[i] - 1] = temp;
//            }
//        }
//        for (int i = 0; i < len; i++) {
//            if(nums[i] != i + 1){
//                return i + 1;
//            }
//        }
//        return len + 1;
//    }
//}
//public class FirstMissingPositive {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.firstMissingPositive(new int[] {1, 1, 2, 2}));
//    }
//}