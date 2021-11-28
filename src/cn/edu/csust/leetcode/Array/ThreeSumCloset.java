//package cn.edu.csust.leetcode.Array;
//
//import java.util.Arrays;
//
///**
// * 找到三个值之和与目标值最近
// */
//class Solution{
//    public int threeSumClosest(int [] nums, int target){
//        if (nums == null || nums.length < 3){
//            return 0;
//        }
//        if (nums.length == 3){
//            return nums[0] + nums[1] + nums[2];
//        }
//        Arrays.sort(nums);
////        将差值初始化为极差，这样使得这个差异值最大，到后面会进行优化。
//        int result = nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3];
//        int diff = Math.abs(result - target);
//        for(int i = 0;i < nums.length - 2;i++){
//            if (i > 0 && nums[i] == nums[i - 1])
//                continue;
//            for(int j = i + 1, k = nums.length - 1; j < k;){
//                int sum = nums[i] + nums[j] + nums[k];
//                int tempDiff = sum - target;
//                if (diff > Math.abs(tempDiff)){
//                    diff = Math.abs(tempDiff);
//                    result = sum;
//
//                }
//                if(tempDiff > 0){
//                    while(j < k && nums[k - 1] == nums[k]) k--;
//                    k--;
//                }
//                else if (tempDiff < 0){
//                    while(j < k && nums[j + 1] == nums[j]) j++;
//                    j++;
//                }
//                else{
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
//}
//public class ThreeSumCloset {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.threeSumClosest(new int[]{1,2,5,10,11}, 12));
//    }
//}
