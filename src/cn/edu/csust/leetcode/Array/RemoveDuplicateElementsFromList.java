//package cn.edu.csust.leetcode.Array;
////时间:100%
////空间:76.45%
//class Solution{
//    public int removeDuplicates(int [] nums){
//
//        if(nums == null || nums.length == 0){
//            return 0;
//        }
//        int count = 1;
//        for(int i = 1;i <nums.length;i++){
//            if(nums[i] != nums[i - 1]){
//                nums[count++] = nums[i];
//            }
//
//        }
//        return count;
//    }
//}
//public class RemoveDuplicateElementsFromList {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.removeDuplicates(new int[]{0,1,1}));
//    }
//}
