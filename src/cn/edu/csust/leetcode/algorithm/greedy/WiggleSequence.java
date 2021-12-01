//package cn.edu.csust.leetcode.algorithm.greedy;
//class Solution {
//    public int wiggleMaxLength(int[] nums) {
//        if(nums.length == 1){
//            return 1;
//        }
//        else if(nums.length == 2){
//            if(nums[1] != nums[0])
//                return 2;
//            else{
//                return 1;
//            }
//        }
//        int i = 1;
//        boolean bool_doc = true;
//        boolean first = true;
//        int count=1;
//
//        while(i < nums.length){
//            if(nums[i] == nums[i-1]){
//                i++;
//                continue;
//            }
//            boolean temp = bool_doc;
//            if(nums[i] - nums[i-1] > 0){
//                bool_doc = true;
//            }
//            else{
//                bool_doc = false;
//            }
//            if(first || temp != bool_doc){
//                first = false;
//                count++;
//            }
//            i++;
//        }
//        return count;
//    }
//}
//public class WiggleSequence {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
//        System.out.println(solution.wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8}));
//        System.out.println(solution.wiggleMaxLength(new int[]{1,2,3,4,5,6,7,8,9}));
//    }
//}
