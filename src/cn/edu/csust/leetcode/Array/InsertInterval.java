//package cn.edu.csust.leetcode.Array;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//class Solution{
//    public int[][] insert(int[][] intervals, int[] newInterval) {
//        if(intervals.length == 0){
//            return new int[][]{newInterval};
//        }
//        boolean flag = false;
//        List<int []> result = new ArrayList<>();
//        for(int i = 0;i<intervals.length;i++){
//            //          考虑新插入的区间在当前区间的前面newInterval[1] < intervals[i][0]
//            if(newInterval[1] < intervals[i][0]){
//                result.add(newInterval);
//                for (int j = i; j < intervals.length; j++) {
//                    result.add(intervals[j]);
//                }
//                flag = true;
//                break;
//            }
//            //            新区间与当前区间相交
//            else if(intervals[i][0] <= newInterval[1] && intervals[i][1] >= newInterval[0]){
//                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
//                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
//            }
//            //            考虑当前区间与新插入区间右不相交:newInterval[1] > intervals[i]
//            else{
//                result.add(intervals[i]);
//            }
//
//        }
//        if(!flag){
//            result.add(newInterval);
//        }
//        int [] [] ret = new int[result.size()][2];
//        return result.toArray(ret);
//    }
//}
//public class InsertInterval {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        //        int [][] res = solution.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2,5});
//        //        int [][] res = solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10},{12, 16}}, new int[]{4,8});
//        int [][] res = solution.insert(new int[][]{}, new int[]{4,8});
//        for (int [] nums: res) {
//            System.out.println(Arrays.toString(nums));
//        }
//    }
//}
