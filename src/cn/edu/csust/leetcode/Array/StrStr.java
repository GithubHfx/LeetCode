//package cn.edu.csust.leetcode.Array;
//class Solution{
//    public int strStr(String str, String sub){
//        if(str.length() == 0 && sub.length() == 0){
//            return 0;
//        }
//        int [] next = this.getNextVal(sub);
//        int  i = 0;
//        int j = 0;
//        while(i < str.length() && j < sub.length()){
//            if(j == -1 || str.charAt(i) == sub.charAt(j)){
//                i++;
//                j++;
//            }
//            else{
//                j = next[j];
//            }
//        }
//        if(j == sub.length()){
//            return i - j;
//        }
//        return -1;
//    }
//    public int [] getNextVal(String str){
//        int i = -1; //指向前缀
//        int j = 0; //指向后缀
//        int [] nextVal = new int[str.length()+1];
//        nextVal[0] = -1;
//        while (j < (str.length())-1){
//            if (i == -1 || str.charAt(i) == str.charAt(j)){
//                i++;
//                j++;
//                //如果前缀字符与后缀字符不同
//                if (str.charAt(i) != str.charAt(j))
//                {
//                    //当前nextval[j]的值等于i位置的值
//                    nextVal[j] = i;
//                }
//                else
//                {
//                    //如果前缀字符与后缀字符相同，则将前缀字符的nextval值赋值给后缀字符的nextval值
//                    nextVal[j] = nextVal[i]+1;
//                }
//            }
//            else
//            {
//                i= nextVal[i];
//            }
//        }
//        return nextVal;
//    }
//}
//public class StrStr {
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.strStr("hello","ll"));
//    }
//
//}
