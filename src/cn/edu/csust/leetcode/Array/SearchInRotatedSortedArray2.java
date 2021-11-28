//package cn.edu.csust.leetcode.Array;
//
//class Solution {
//    public boolean search(int[] nums, int target) {
//        int low = 0, high = nums.length - 1;
//        while(low <= high){
//            int mid = low + (high - low) / 2;
//            if(nums[mid] == target){
//                return true;
//            }
//            if(nums[mid] > nums[low]){
//                if(target >= nums[low] && target < nums[mid]){
//                    high = mid - 1;
//                }
//                else{
//                    low = low + 1;
//                }
//
//            }
//            else if(nums[mid] < nums[high]){
//                if(target <= nums[high] && nums[mid] < target){
//                    low = mid + 1;
//                }
//                else{
//                    high = high - 1;
//                }
//            }
//            else{
//                high = high - 1;
//            }
//        }
//        return false;
//    }
//    public boolean search(int [] nums, int target){
//        for (int num: nums) {
//            if(num == target){
//                return true;
//            }
//        }
//        return false;
//    }
//}
//public class SearchInRotatedSortedArray2 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int [] nums1 = new int[]{2,5,6,7,0,1,2};
//        int [] nums2 = new int[]{1,0,1,1,1};
//        int [] nums3 = new int[]{1,1,1,0,1};
//        System.out.println(solution.search(nums1, 2));
//        System.out.println(solution.search(nums3, 0));
//    }
//}
