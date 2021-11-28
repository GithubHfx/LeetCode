//package cn.edu.csust.leetcode.Array;
//
//import java.util.List;
//
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode() {
//    }
//
//    ListNode(int val) {
//        this.val = val;
//    }
//
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
//class Solution {
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode root = new ListNode();
//        ListNode p = root;
//        int plus = 0;
//        while (l1 != null && l2 != null){
//            int res = l1.val + l2.val + plus;
//            int currenNum = res % 10;
//            plus = res / 10;
//
//            ListNode node = new ListNode(currenNum, null);
//            p.next = node;
//            p = node;
//
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        while (l1 != null){
//            int res = l1.val + plus;
//            int currentNum = res % 10;
//            plus = res / 10;
//
//            ListNode node = new ListNode(currentNum, null);
//            p.next = node;
//            p = node;
//
//            l1 = l1.next;
//        }
//        while(l2 != null){
//            int res = l2.val + plus;
//            int currentNum = res % 10;
//            plus = res / 10;
//
//            ListNode node = new ListNode(currentNum, null);
//            p.next = node;
//            p = node;
//
//            l2 = l2.next;
//        }
//        while(plus != 0){
//            int currentNum = plus % 10;
//            plus /= 10;
//
//            ListNode node = new ListNode(currentNum, null);
//            p.next = node;
//            p = node;
//        }
//        return root.next;
//    }
//}
//
//public class AddTwoLinkedNum {
//    public static void print(ListNode node){
//        while(node != null){
//            System.out.print(node.val + "->");
//            node = node.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
//        ListNode head = solution.addTwoNumbers(l1, l2);
//        print(l1);
//        print(l2);
//        print(head);
//    }
//}
