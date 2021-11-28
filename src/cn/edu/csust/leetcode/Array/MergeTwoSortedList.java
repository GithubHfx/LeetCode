//package cn.edu.csust.leetcode.Array;
//
//// Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//// 非递归方法
//class Solution{
////     非递归写法
////    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
////        ListNode root = new ListNode();
////        ListNode p = root;
////        while(l1 != null && l2 != null)
////        {
////            if(l1.val < l2.val){
////                p.next = l1;
////                p = l1;
////                l1 = l1.next;
////            }
////            else{
////                p.next = l2;
////                p = l2;
////                l2 = l2.next;
////            }
////            p.next = null;
////        }
////        if(l1 != null){
////            p.next = l1;
////        }
////        else{
////            p.next = l2;
////        }
////        return root.next;
////    }
//
////    DFS递归方式比较快
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null){
//            return l2;
//        }
//        if(l2 == null){
//            return l1;
//        }
//        if(l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }
//        else{
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }
//}
//public class MergeTwoSortedList {
//    public static void print(ListNode node){
//        while(node != null){
//            System.out.print(node.val + "->");
//            node = node.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(5, null)));
//        print(l1);
//        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
//        print(l2);
//        print(solution.mergeTwoLists(l1, l2));
//
//    }
//}
