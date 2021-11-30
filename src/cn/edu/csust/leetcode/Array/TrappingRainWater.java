//package cn.edu.csust.leetcode.Array;
//// 有点像是贪婪算法，只用找左边的最大值，然后减去当前值的高度累加即可得到最后结果
//class Solution{
//    public int trap(int[] height) {
//        int count = 0;
//        int left = 0, right = height.length - 1;
//        int maxLeft = 0, maxRight = 0;
//        while (left < right) {
//            if(height[left] < height[right]){
//                if(height[left] > maxLeft){
//                    maxLeft = height[left];
//                }
//                else{
//                    count += maxLeft - height[left];
//                }
//                left++;
//            }
//            else{
//                if(height[right] > maxRight){
//                    maxRight = height[right];
//                }
//                else{
//                    count += maxRight - height[right];
//                }
//                right--;
//            }
//        }
//
//        return count;
//    }
//}
//public class TrappingRainWater {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//    }
//}
