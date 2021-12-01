//package cn.edu.csust.leetcode.algorithm.greedy;
//
//
//class Solution{
//    public int monotoneIncreasingDigits(int n) {
//        char[] num = (n + "").toCharArray();
//        int t = num.length - 1;
//        for (int i = t; i > 0; i--) {
//            if(num[i] < num[i-1]){
//                num[i - 1]--;
//                for (int j = i; j <= t; j++) {
//                    num[j] = '9';
//                }
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i <= t; i++) {
//            sum = sum * 10 + (num[i] - '0');
//        }
//        return sum;
//    }
//}
//
//
//class Solution{
//    public int monotoneIncreasingDigits(int N) {
//        int i = 1;
//        int res = N;
//        while(i <= res/10) {
//            int n = res / i % 100; // 每次取两个位
//            i *= 10;
//            if(n/10 > n%10) // 比较的高一位大于底一位
//                res = res / i * i - 1; //例如1332 循环第一次变为1330-1=1329 第二次变为1300-1=1299
//        }
//        return res;
//    }
//}
//public class MonotoneIncreasingDigits {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.monotoneIncreasingDigits(1234));
//        System.out.println(solution.monotoneIncreasingDigits(1032));
//        System.out.println(solution.monotoneIncreasingDigits(332));
//    }
//}
