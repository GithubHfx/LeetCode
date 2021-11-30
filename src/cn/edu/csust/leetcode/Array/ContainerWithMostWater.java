//package cn.edu.csust.leetcode.Array;
// 双指针
//class Solution {
//    public int maxArea(int[] height) {
//        int left = 0, right = height.length - 1;
//        int area = 0;
//        while(left < right){
//            int width = right - left;
//
//            if(height[left] < height[right]){
//                int areaTemp = height[left] * width;
//                if (areaTemp > area){
//
//                    area = areaTemp;
//                }
//                left++;
//            }
//            else{
//                int areaTemp = height[right] * width;
//                if (areaTemp > area){
//                    area = areaTemp;
//                }
//                right --;
//            }
//        }
//        return area;
//    }
//}
//public class ContainerWithMostWater {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
//    }
//}
