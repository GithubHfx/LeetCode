//package cn.edu.csust.leetcode.Array;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//
//class Solution {
//    public int largestRectangleArea2(int[] heights) {
//        // 这里为了代码简便，在柱体数组的头和尾加了两个高度为 0 的柱体。
//        int[] tmp = new int[heights.length + 2];
//        System.arraycopy(heights, 0, tmp, 1, heights.length);
//
//        Deque<Integer> stack = new ArrayDeque<>();
//        int area = 0;
//        for (int i = 0; i < tmp.length; i++) {
//            // 对栈中柱体来说，栈中的下一个柱体就是其「左边第一个小于自身的柱体」；
//            // 若当前柱体 i 的高度小于栈顶柱体的高度，说明 i 是栈顶柱体的「右边第一个小于栈顶柱体的柱体」。
//            // 因此以栈顶柱体为高的矩形的左右宽度边界就确定了，可以计算面积🌶️ ～
//            while (!stack.isEmpty() && tmp[i] < tmp[stack.peek()]) {
//                int h = tmp[stack.pop()];
//                area = Math.max(area, (i - stack.peek() - 1) * h);
//            }
//            stack.push(i);
//        }
//
//        return area;
//    }
//// 双指针是比单调栈快
//    public int largestRectangleArea(int[] heights) {
//        int area = 0;
//        for (int i = 0; i < heights.length; i++) {
//            int height = heights[i];
//            if(i > 0 && height == heights[i - 1])
//                continue;
//            int left = i;
//            int right = i;
//            while(left >= 0){
//                if(heights[left] < height)
//                    break;
//                left--;
//            }
//            while(right < heights.length){
//                if (heights[right] < height)
//                    break;
//                right++;
//            }
//            int w = right - left - 1;
//            area = Math.max(area, w * height);
//
//
//        }
//        return area;
//    }
//}
//public class LargestRectangleArea {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.largestRectangleArea(new int[]{2,1,5,6,2,3}));
//    }
//}
