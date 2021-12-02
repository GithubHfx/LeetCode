package cn.edu.csust.leetcode;

import java.util.*;

//class Solution{
//    public String[] findRelativeRanks(int[] score) {
//        int n = score.length;
//        int[] sortedScores = Arrays.copyOf(score, n);
//        Arrays.sort(sortedScores);
//        String [] ranks = new String[n];
//        for(int i = 0;i<n;i++){
//            int low = 0;
//            int high = score.length - 1;
//            int mid = 0;
//            while(low <= high){
//                mid = ((high - low)>>1) + low;
//                if(sortedScores[mid] == score[i]){
//                    break;
//                }
//                else if(sortedScores[mid] > score[i]){
//                    high = mid - 1;
//                }
//                else{
//                    low = mid + 1;
//                }
//            }
//            switch (n - mid){
//                case 1: ranks[i] = "Gold Medal";break;
//                case 2: ranks[i] = "Silver Medal";break;
//                case 3: ranks[i] = "Bronze Medal";break;
//                default: ranks[i] = (n - mid) + "";break;
//            }
//        }
//        return ranks;
//    }
//}


//class Solution {
//    public String[] findRelativeRanks(int[] score) {
//        int n = score.length;
//        String [] ranks = new String[n];
//        int [] sortArr = Arrays.copyOf(score, n);
//        Arrays.sort(sortArr);
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map.put(sortArr[i], n - i);
//        }
//        for (int i = 0; i < n; i++) {
//            switch (map.get(score[i])){
//                case 1: ranks[i] = "Gold Medal"; break;
//                case 2: ranks[i] = "Silver Medal"; break;
//                case 3: ranks[i] = "Bronze Medal"; break;
//                default: ranks[i] = map.get(score[i]) + "";break;
//            }
//
//        }
//        return ranks;
//    }
//}

// 优先队列
//class Solution {
//    public String[] findRelativeRanks(int[] score) {
//        String[] preThird = { "Gold Medal", "Silver Medal", "Bronze Medal" };
//        String[] ans = new String[score.length];
//        Queue<int[]> rank = new PriorityQueue<>((x, y) -> x[1] - y[1]);
//        for (int i = 0; i < score.length; i++) {
//            rank.offer(new int[] { i, score[i] });
//        }
//        for (int i = ans.length; i > 0; i--) {
//            int[] r = rank.poll();
//            ans[r[0]] = i < 4 ? preThird[i - 1] : String.valueOf(i);
//        }
//        return ans;
//    }
//}

// 快排
//class Solution {
//    public String[] findRelativeRanks(int[] score) {
//        // 尝试对score进行排序, 排序的是索引
//        // 1.整理新数组
//        int[][] array = new int[score.length][2];
//        for (int i = 0; i < score.length; i++) {
//            array[i][0] = score[i];
//            array[i][1] = i;
//        }
//        // 2.排序
//        quickSort(array, 0, array.length - 1);
//        // 3.获取结果
//        String[] result = new String[score.length];
//        result[array[0][1]] = "Gold Medal";
//        if (score.length > 1) {
//            result[array[1][1]] = "Silver Medal";
//        }
//        if (score.length > 2) {
//            result[array[2][1]] = "Bronze Medal";
//        }
//        for (int i = 3; i < array.length; i++) {
//            result[array[i][1]] = String.valueOf(i + 1);
//        }
//        return result;
//    }
//
//    private void quickSort(int[][] array, int left, int right) {
//        if (left < right) {
//            int lt = left - 1;
//            int rt = right + 1;
//            int curIndex = left;
//            int[] curValue = array[curIndex];
//            int[] temp;
//            while (curIndex < rt) {
//                if (curValue[0] < array[curIndex][0]) {
//                    temp = array[++lt];
//                    array[lt] = array[curIndex];
//                    array[curIndex++] = temp;
//                } else if (curValue[0] > array[curIndex][0]) {
//                    temp = array[--rt];
//                    array[rt] = array[curIndex];
//                    array[curIndex] = temp;
//                } else {
//                    curIndex++;
//                }
//            }
//            quickSort(array, left, lt);
//            quickSort(array, rt, right);
//        }
//    }
//}

//public class RelativeRanks {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(Arrays.toString(solution.findRelativeRanks(new int []{5, 4, 3, 2, 1})));
//        System.out.println(Arrays.toString(solution.findRelativeRanks(new int []{10,3,8,9,4})));
//    }
//}
