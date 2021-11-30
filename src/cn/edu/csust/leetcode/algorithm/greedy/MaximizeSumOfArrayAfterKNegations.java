//package cn.edu.csust.leetcode.algorithm.greedy;
//
//import java.util.Arrays;
//import java.util.PriorityQueue;
////稍微有点慢6ms
////class Solution{
////    public int largestSumAfterKNegations(int [] nums, int k){
////        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
////        for (int i = 0; i < nums.length; i++) {
////            priorityQueue.add(nums[i]);
////        }
////        for (int i = 0; i < k; i++) {
////            Integer poll = priorityQueue.poll();
////            poll = -poll;
////            priorityQueue.add(poll);
////        }
////        int sum = 0;
////        for (int i = 0; i < nums.length; i++) {
////            sum += priorityQueue.poll();
////        }
////        return sum;
////    }
////}
//
////时间beats100%
//class Solution{
//    public int largestSumAfterKNegations(int [] nums, int k){
////        当长度为1 时直接翻转k次并返回nums[0]
//        if(nums.length == 1){
//            for (int i = 0; i < k; i++) {
//                nums[0] = -nums[0];
//            }
//            return nums[0];
//        }
//        int min = 0;
//        int sum = 0;
////        1.首先对数组进行排序
//        Arrays.sort(nums);
//        for (int i = 0; k > 0;) {
//            int index = i % nums.length;
////            如果第一次数组就大于0，也就是数组最小的数都大于等于0，那么直接在大于0的地方进行翻转即可，
////            而如果是在负数都变成正数之后只剩下正数，那么就要比较nums[i]和nums[i-1]而这个时候i可能是最后一个数，所以要用index来记录并取余
//            if(nums[index] >= 0){
//                if(i > 0){
//                    min = nums[index] > nums[(i - 1)%nums.length]?(i - 1)%nums.length:index;
//                }
//                else{
//                    min = i;
//                }
//                nums[min] = -nums[min];
//            }
//            else if(nums[i] < 0){
//                nums[index] = -nums[index];
//                i++;
//            }
//            k--;
//        }
////      最后将所有数组中的元素值相加得到最后的结果
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        return sum;
//    }
//}
//public class MaximizeSumOfArrayAfterKNegations {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));
//        System.out.println(solution.largestSumAfterKNegations(new int[]{3,-1,0,2}, 3));
//        System.out.println(solution.largestSumAfterKNegations(new int[]{4,2, 3}, 3));
//        System.out.println(solution.largestSumAfterKNegations(new int[]{-4,-2, -3}, 4));
//    }
//}
