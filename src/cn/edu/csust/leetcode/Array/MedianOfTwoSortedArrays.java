//package cn.edu.csust.leetcode.Array;
//
//import java.util.Arrays;
//
///**
// * 本篇文章对该题解释非常清楚，且思路很清晰
// * https://zhuanlan.zhihu.com/p/39129143
// */
//class Solution{
//    public double findMedianSortedArrays(int [] nums1, int [] nums2){
//        int m, n;
//
//        int maxLeft,minRight;
//        if(nums1.length > nums2.length){
//            int [] temp = nums1;
//            nums1 = nums2;
//            nums2 = temp;
//        }
//        m = nums1.length;
//        n = nums2.length;
//        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
//        while(iMin <= iMax){
//            int i = (iMin + iMax) / 2;
//            int j = halfLen - i;
//            if(i > iMin && nums2[j] < nums1[i - 1]){
//                iMax = iMax - 1;
//            }
//            else if(i < iMax && nums1[i] < nums2[j - 1]){
//                iMin = iMin + 1;
//            }
//            else{
//                if (i == 0){
//                    maxLeft = nums2[j - 1];
//                }
//                else if (j == 0){
//                    maxLeft = nums1[i - 1];
//                }
//                else{
//                    maxLeft = Math.max(nums1[i - 1] ,nums2[j - 1]);
//                }
//                if ((m + n )% 2==1) return maxLeft;
//
//                if (i == m){
//                    minRight = nums2[j];
//                }
//
//                else if (j == n){
//                    minRight = nums1[i];
//                }
//                else{
//                    minRight = Math.min(nums1[i], nums2[j]);
//                }
//                return (maxLeft + minRight) / 2.0;
//            }
//        }
//        return 0.0;
//    }
//}
//public class MedianOfTwoSortedArrays {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int [] nums1 = new int[]{1,2};
//        int [] nums2 = new int[]{3, 4, 5};
//        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
//    }
//}
