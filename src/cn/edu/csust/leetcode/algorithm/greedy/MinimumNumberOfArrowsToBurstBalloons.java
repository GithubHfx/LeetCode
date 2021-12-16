package cn.edu.csust.leetcode.algorithm.greedy;

import java.util.Arrays;
class Solution {
    public int findMinArrowShots(int[][] points) {
        int count = 1;
        if(points.length == 1){
            return count;
        }
        Arrays.sort(points, (o1, o2)->o1[0] == o2[0]?o1[1] - o2[1]: o1[0] - o2[0]);
        for (int i = 0, j = 1; j < points.length; j++) {
            if(points[i][0] <= points[j][1] && points[j][0] <= points[i][1]){
                points[i][0] = Math.max(points[i][0], points[j][0]);
                points[i][1] = Math.min(points[i][1], points[j][1]);

            }
            else{
                i++;
                points[i][0] = points[j][0];
                points[i][1] = points[j][1];
                count++;
            }
        }

        return count;
    }
}
public class MinimumNumberOfArrowsToBurstBalloons {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][] points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};

        System.out.println(solution.findMinArrowShots(points));
    }
}
