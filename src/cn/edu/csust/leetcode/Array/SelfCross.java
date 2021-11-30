package cn.edu.csust.leetcode.Array;
//class Solution{
//    public boolean isSelfCrossing(int[] distance) {
//        int len = distance.length;
//        if(len < 4) return false;
//        if(distance[2] <= distance[0] && distance[3] >= distance[1]){
//            return true;
//        }
//        if(len > 4 && ((distance[3] <= distance[1] && distance[4] >= distance[2]) ||
//        (distance[3] == distance[1] &&  distance[4] + distance[0] >= distance[2]))){
//            return true;
//        }
//        for (int i = 5; i < len; i++) {
//            if(distance[i - 1] <= distance[i - 3] && distance[i] >= distance[i - 2]){
//                return true;
//            }
//            if (distance[i - 1] <= distance[i - 3] && distance[i - 4] <= distance[i - 2]
//                && distance[i] + distance[i - 4] >= distance[i - 2]
//                && distance[i - 1] + distance[i - 5] >= distance[i - 3]){
//                return true;
//            }
//        }
//        return false;
//    }
//}

//class Solution{
//    public boolean isSelfCrossing(int [] distance){
//        if(distance.length <= 3){
//            return false;
//        }
//        int n = distance.length;
//        for (int i = 3; i < n; i++) {
//            if(distance[i - 1] <= distance[i - 3] && distance[i] >= distance[i - 2]){
//               return true;
//            }
//            if(i > 3) {
//                if (distance[i - 1] == distance[i - 3] && distance[i] + distance[i - 4] >= distance[i - 2]) {
//                    return true;
//                }
//            }
//            if(i > 4) {
//                if(distance[i - 1] <= distance[i - 3] && distance[i - 4] <= distance[i - 2]
//                    && distance[i] + distance[i - 4] >= distance[i - 2]
//                    && distance[i - 1] + distance[i - 5] >= distance[i - 3]){
//                  return true;
//                }
//            }
//        }
//        return false;
//    }
//}
//public class SelfCross {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.isSelfCrossing(new int []{2,1,1,2}));
//        System.out.println(solution.isSelfCrossing(new int []{3,2,1,4}));
//        System.out.println(solution.isSelfCrossing(new int []{1,1,1,1}));
//        System.out.println(solution.isSelfCrossing(new int []{3,3,4,2,2}));
//    }
//}
