//package cn.edu.csust.leetcode.Array;
//
//import java.util.*;
//
////class Solution {
////    public int[][] merge(int[][] intervals) {
////        if(intervals.length == 1)
////            return intervals;
////        List<int[]> list = new ArrayList<>();
////
////        int fast = 1, slow = 0;
//////        lambda表达式，二维数组排序
////        Arrays.sort(intervals, (int [] o1, int [] o2)-> o1[0] == o2[0]?o1[1] - o2[1]:o1[0] - o2[0]);
////        while(fast < intervals.length){
////            int slow_start = intervals[slow][0];
////            int fast_start = intervals[fast][0];
////            int slow_end = intervals[slow][1];
////            int fast_end = intervals[fast][1];
////            //            这句话代表两个区间重叠
////            if(fast_start <= slow_end && slow_start <= fast_end){
////                intervals[slow][0] = Math.min(slow_start, fast_start);
////                intervals[slow][1] = Math.max(slow_end, fast_end);
////            }
////            else{
////                slow++;
////                intervals[slow][0] = intervals[fast][0];
////                intervals[slow][1] = intervals[fast][1];
////            }
////
////            fast ++;
////        }
////
////        return Arrays.copyOfRange(intervals, 0, slow+1);
////    }
////}
//class Solution {
//    public int[][] merge(int[][] intervals) {
//        List<int[]> res = new LinkedList<>();
//        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
//
//        int start = intervals[0][0];
//        for (int i = 1; i < intervals.length; i++) {
////            后一个数组的下届小于前一个的上界就交叉
//            if (intervals[i][0] > intervals[i - 1][1]) {
//                res.add(new int[]{start, intervals[i - 1][1]});
//                start = intervals[i][0];
//            } else {
//                intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
//            }
//        }
//        res.add(new int[]{start, intervals[intervals.length - 1][1]});
//        return res.toArray(new int[res.size()][]);
//    }
//}
//public class MergeIntervals {
//    public static void main(String[] args) {
//        int [][] intervals = new int[][] {{2, 3}, {5, 5},{2, 2}};
////        int [][] intervals = new int[][]{{2, 3}, {4, 5},{6,7}, {8, 9},{1,10}};
////        int [][] intervals = new int[][]{{1, 3}, {2, 6},{8, 10}, {15, 18}};
//        Solution solution = new Solution();
//        int [][] result = solution.merge(intervals);
//        for (int [] interval: intervals) {
//            System.out.println(Arrays.toString(interval));
//        }
//        System.out.println("-------------------------");
//        for (int [] interval: result) {
//            System.out.println(Arrays.toString(interval));
//        }
//    }
//}
