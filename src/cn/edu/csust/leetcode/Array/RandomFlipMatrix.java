package cn.edu.csust.leetcode.Array;

import java.util.HashSet;
//import java.util.Random;
import java.util.Set;

//class Solution {
//    Set<String> set;
//    int r;
//    int c;
//    Random random = new Random();
//    public Solution(int n_rows, int n_cols) {
//        set = new HashSet<String>();
//        r = n_rows;
//        c = n_cols;
//    }
//
//    public int[] flip() {
//        int rr = random.nextInt(r);
//        int cc = random.nextInt(c);
//        while(set.contains(rr+","+cc)){
//            rr = random.nextInt(r);
//            cc = random.nextInt(c);
//        }
//        set.add(rr+","+cc);
//        return new int[]{rr,cc};
//    }
//
//    public void reset() {
//        set.clear();
//    }
//}


//class Solution{
//    int n;
//    int len;
//    int next;
//    Random random = new Random();
//    public Solution(int m, int n){
//        this.n = n;
//        this.len = m * n;
//        reset();
//    }
//    public int[] flip(){
//        int k = next;
//        next = (next + 1) % len;
//        return new int[]{k / n, k % n};
//    }
//    public void reset(){
//        next = random.nextInt(len);
//    }
//}
//public class RandomFlipMatrix {
//    public static void main(String[] args) {
//        Solution solution = new Solution(4, 17);
//        System.out.println();
//    }
//}
