//package cn.edu.csust.leetcode.Array;
//// beats:100%
////
//class Solution{
//    public int searchInsert(int[] nums, int target) {
//        if(nums.length == 0){
//            return 0;
//        }
//        int low = 0;
//        int high = nums.length-1;
//        while(low <= high){
//            int mid = low + ((high - low) >> 2);
//            if(nums[mid] == target){
//                while(mid > 0 && nums[mid] == nums[mid - 1])mid--;
//                return mid;
//            }
//            else if(nums[mid] > target){
//                if(mid > 0 && nums[mid - 1] < target){
//                    return mid;
//                }
//                else if(mid == 0){
//                    return 0;
//                }
//                high = mid - 1;
//            }
//            else{
//                if(mid + 1 < nums.length && nums[mid + 1] > target){
//                    return mid+1;
//                }
//                else if(mid == nums.length - 1){
//                    return nums.length;
//                }
//                low = mid + 1;
//            }
//        }
//        return 0;
//    }
//}
//public class SearchInsertPosition {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.searchInsert(new int[]{1, 3, 5, 7}, 0));
//    }
//}
