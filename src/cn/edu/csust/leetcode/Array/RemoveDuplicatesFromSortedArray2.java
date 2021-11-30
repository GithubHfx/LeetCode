//package cn.edu.csust.leetcode.Array;
////执行结果：通过
////执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
////内存消耗：38 MB, 在所有 Java 提交中击败了99.43%的用户
////通过测试用例：164 / 164
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int count = 1;
//        boolean flag = true;
//        if(nums.length == 1)
//            return 1;
//        for (int i = 1; i < nums.length; i++) {
//            if(!flag && nums[i - 1] != nums[i]){
//                flag = true;
//                nums[count++] = nums[i];
//                continue;
//            }
//            if(flag && nums[i - 1] == nums[i]){
//                flag = false;
//                nums[count++] = nums[i];
//            }
//            else if(flag && nums[i - 1] != nums[i]){
//                nums[count++] = nums[i];
//            }
//
//        }
//        return count;
//    }
//}
//public class RemoveDuplicatesFromSortedArray2 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
////        int [] nums = new int[]{1,1,1,2,2,3};
//        int [] nums = new int[]{0,0,1,1,1,1,2,3,3};
//        int count = solution.removeDuplicates(nums);
//        for (int i = 0; i < count; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println();
//    }
//}
