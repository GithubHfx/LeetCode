//package cn.edu.csust.leetcode.Array;
//
//import java.util.Arrays;
//
///**
// * 快排划分
// */
//class Solution{
//    private int partition(int [] nums, int low, int high){
//        int temp = nums[low];
//        if(low < high){
//            while(low < high) {
//                while (low < high && nums[high] >= temp) high--;
//                if (low < high) nums[low++] = nums[high];
//                while (low < high && nums[low] <= temp) low++;
//                if (low < high) nums[high--] = nums[low];
//            }
//            nums[low] = temp;
//            return low;
//        }
//        return low;
//    }
//
//    public void sortColors(int [] nums){
//        int n = nums.length;
//        quickSort(nums, 0, n - 1);
//    }
//
//    private void quickSort(int[] nums, int l, int h) {
//        if(l < h){
//            int par = partition(nums, l, h);
//            quickSort(nums, l, par - 1);
//            quickSort(nums, par + 1, h);
//        }
//    }
//}
//public class SortColors {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
////        int [] arr = new int[]{2, 0, 1};
////        int [] arr = new int[]{2, 0, 2, 1, 1, 0};
//        int [] arr = new int[]{2};
//        solution.sortColors(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}
