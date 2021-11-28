//package cn.edu.csust.leetcode.Array;
//// 时间100%
//// 空间91.62%
//class Solution {
//    public int removeElement(int [] nums, int val){
//        int count = 0;
//        for(int i = 0;i < nums.length;i++){
//            if(nums[i] != val){
//                nums[count++] = nums[i];
//            }
//        }
//        return count;
//    }
//}
//public class RemoveElement {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int [] nums = new int[]{3, 2, 2, 3};
//        int len = solution.removeElement(nums, 3);
//        for(int i = 0;i<len;i++){
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//    }
//}
