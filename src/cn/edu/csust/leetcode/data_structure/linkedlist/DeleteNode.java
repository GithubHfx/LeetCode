//package cn.edu.csust.leetcode;
///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode(int x) { val = x; }
//}
//class Solution {
//    public void deleteNode(ListNode node) {
//        while(node.next.next != null){
//            node.val = node.next.val;
//            node = node.next;
//        }
//        node.val = node.next.val;
//        node.next = null;
//    }
//}
//public class DeleteNode {
//    public static void printList(ListNode head){
//        while(head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ListNode head = new ListNode(1);
//        ListNode node1 = new ListNode(2);
//        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(4);
//        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = null;
//        printList(head);
//        solution.deleteNode(node2);
//        printList(head);
//    }
//}
