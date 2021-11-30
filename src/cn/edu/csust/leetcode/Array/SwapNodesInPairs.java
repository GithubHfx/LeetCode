//package cn.edu.csust.leetcode.Array;
///**
// * Definition for singly-linked list.
// */
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//////深度优先交换时间beats100%,空间91.61%
////class Solution {
////    public ListNode swapPairs(ListNode head) {
////        if(head == null || head.next == null){
////            return head;
////        }
////        ListNode q = head.next;
////        head.next = swapPairs(q.next);
////        q.next = head;
////        return q;
////    }
////}
//
////空间利用率稍微有点低
//class Solution{
//    public ListNode swapPairs(ListNode head){
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode p = head;
//        ListNode q = head.next;
//        ListNode temp = head;
//        while(q != null){
////            指针交换
//            p.next =  q.next;
//            q.next = p;
//            temp = p;
////            指针移动
//            if(p == head){
//                head = q;
//            }
//            p = p.next;
////            指针衔接
//            if(p == null){
//
//                return head;
//            }
//            else{
//                q = p.next;
//                temp.next = q;
//            }
//        }
//        temp.next = p;
//        return head;
//    }
//}
//public class SwapNodesInPairs {
//    public static void print(ListNode head){
//        if(head == null) return;
//        while(head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5,null)))));
//        print(root);
//        Solution solution = new Solution();
//        print(solution.swapPairs(root));
//    }
//}
