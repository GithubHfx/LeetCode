package cn.edu.csust.leetcode.algorithm.greedy;
//class Solution {
//    public boolean lemonadeChange(int[] bills) {
//        int [] moneyCount = new int[3];
//        for (int i = 0; i < bills.length; i++) {
//            if(bills[i] == 5){
//                moneyCount[0]++;
//            }
//            else if(bills[i] == 10){
//                if(moneyCount[0] > 0){
//                    moneyCount[0]--;
//                    moneyCount[1]++;
//                }
//                else{
//                    return false;
//                }
//            }
//            else{
//                if(moneyCount[1] > 0 && moneyCount[0] > 0){
//                    moneyCount[0]--;
//                    moneyCount[1]--;
//                    moneyCount[2]++;
//                }
//                else if(moneyCount[0] >=3){
//                    moneyCount[0] -= 3;
//                    moneyCount[2]++;
//                }
//                else{
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
//class Solution {
//    public boolean lemonadeChange(int[] bills) {
//        int five = 0, ten = 0;
//        for (int i : bills) {
//            if (i == 5) five++;
//            else if (i == 10) {five--; ten++;}
//            else if (ten > 0) {ten--; five--;}
//            else five -= 3;
//            if (five < 0) return false;
//        }
//        return true;
//    }
//}
//public class LemonadeChange {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.lemonadeChange(new int[]{5,5,5,10,20}));
//    }
//}
