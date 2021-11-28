//package cn.edu.csust.leetcode.Array;
//
//import java.util.Arrays;
//import java.util.Random;
//
//class Solution {
//    int [] nums;
//    int [] nums2;
//    public Solution(int[] nums) {
//        this.nums = nums;
//        this.nums2 = Arrays.copyOf(nums, nums.length);
//    }
//
//    public int[] reset() {
//        return nums2;
//    }
//    private void swap(int i, int t){
//        int temp = this.nums[i];
//        this.nums[i] = this.nums[t];
//        this.nums[t] = temp;
//    }
//    public int[] shuffle() {
//        Random random = new Random();
//        int n = this.nums.length;
//        for(int i=0; i<n - 1; i++){
//            int t = random.nextInt(n - i) + i;
//            swap(i, t);
//        }
//        return this.nums;
//    }
//}
//
///**
// * Your Solution object will be instantiated and called as such:
// * Solution obj = new Solution(nums);
// * int[] param_1 = obj.reset();
// * int[] param_2 = obj.shuffle();
// */
//public class ShuffleAnArray {
//    public static void main(String[] args) {
//        Solution solution = new Solution(new int[]{1, 2,3, 4});
//
//        System.out.println(Arrays.toString(solution.shuffle()));
//    }
//}
