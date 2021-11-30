//package cn.edu.csust.leetcode.Array;
//class Solution{
//    public int search(int[] nums, int target) {
//        if(nums.length == 0)
//        return -1;
//        int low = 0;
//        int high = nums.length - 1;
//        while(low <= high){
//            int mid = low + (high - low) / 2;
//            if(nums[mid] == target){
//                while(mid > low && nums[mid] == nums[mid - 1])mid--;
//                return mid;
//            }
//            else if(nums[mid] >= nums[low]){
//                if(target >= nums[low] && target <= nums[mid])
//                    high = mid - 1;
//                else{
//                    low = mid + 1;
//                }
//            }
//            else if(nums[mid] <= nums[high]){
//                if(target >= nums[mid] && target <= nums[high]){
//                    low = mid + 1;
//                }
//                else{
//                    high = mid - 1;
//                }
//            }
//        }
//        return -1;
//    }
//}
//public class SearchInRotatedSortedArray {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.search(new int[]{1}, 0));
//    }
//}
