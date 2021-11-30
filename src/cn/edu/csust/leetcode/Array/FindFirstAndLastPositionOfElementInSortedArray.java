//package cn.edu.csust.leetcode.Array;
//
//import java.util.Arrays;
//
//class Solution{
//    public int[] searchRange(int[] nums, int target) {
//
//        int [] range = new int[]{-1, -1};
//        int low = 0;
//        int high = nums.length - 1;
//        while(low <= high){
//            int mid = ((high - low) >> 1) + low;
//            if(target == nums[mid]){
//                range[0] = mid;
//                range[1] = mid;
//                while(range[0] > low && nums[range[0]] == nums[range[0] - 1]){
//                    range[0]--;
//                }
//
//                while(range[1] < high && nums[range[1]] == nums[range[1] + 1]){
//                    range[1]++;
//                }
//                return range;
//            }
//            else if(target > nums[mid]){
//                low = mid + 1;
//
//            }
//            else{
//                high = mid - 1;
//            }
//        }
//        return range;
//    }
//}
//public class FindFirstAndLastPositionOfElementInSortedArray {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.searchRange(new int[]{5,7,7,8,8,10},  8)));
//    }
//}
