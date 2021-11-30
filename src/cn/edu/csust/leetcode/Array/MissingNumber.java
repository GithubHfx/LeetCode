//package cn.edu.csust.leetcode.Array;
//
//import java.util.Arrays;
//
//class Solution {
////    开辟空间
////    执行结果：通过
////    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
////    内存消耗：38.4 MB, 在所有 Java 提交中击败了96.43%的用户
//    public int missingNumber(int[] nums) {
//        int [] temp = new int [nums.length+1];
//        for (int num : nums) {
//            temp[num] = 1;
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if(temp[i] == 0)
//                return i;
//        }
//        return 0;
//    }
//    //    原地空间
////    慢
////    时间beats:41.56%
////    空间beats:84.49%
//    public int missingNumber2(int[] nums) {
//        int n  = nums.length;
//        for (int i = 0; i < n; i++) {
//            while(nums[i] < n && nums[nums[i]] != nums[i]){
//                int temp = nums[i];
//                nums[i] = nums[temp];
//                nums[temp] = temp;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] != i)
//                return i;
//        }
//        return n;
//    }
////    异或：常量空间
//
//    public int missingNumber3(int [] nums){
//        int sum = 0;
//        int n = nums.length;
//        for (int i = 0; i <= n; i++) {
//            sum ^= i;
//            if(i < n)
//                sum ^= nums[i];
//        }
//        return sum;
//    }
//}
//public class MissingNumber {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.missingNumber2(new int[]{3,0,1}));
//    }
//}
