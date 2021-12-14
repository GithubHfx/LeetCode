//package cn.edu.csust.leetcode.Array;
//
////Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) {
//        this.val = val;
//    }
//    ListNode(int val, ListNode next) {
//        this.val = val;
//        this.next = next;
//    }
//}
////双指针法
//class Solution{
//    public ListNode removeNthFromEnd(ListNode node, int n){
//        if(node == null || n < 1)
//            return node;
//        ListNode p = node;
//        ListNode q = node;
//        for(int i = 0;i <  n;i++){
//            q = q.next;
//
//        }
//        if (q == null)
//            return node.next;
//        for(;q.next != null;){
//            q = q.next;
//            p = p.next;
//        }
//        p.next = p.next.next;
//
//        return node;
//    }
//}
//
//public class RemoveNNodeFromEndOfList {
//    public static ListNode headInsert(ListNode head, int val){
//        ListNode node = new ListNode();
//        node.val = val;
//        if(head == null){
//            return node;
//        }
//        else{
//            node.next = head.next;
//            head.next = node;
//            return head;
//        }
//    }
//
//    public static void printList(ListNode head){
//        if(head == null) return ;
//        while(head != null)
//        {
//            System.out.print(head.val + "-> ");
//            head = head.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ListNode root = headInsert(null, 1);
//        for (int i = 5;i>1;i--){
//            root = headInsert(root, i);
//        }
//        printList(root);
//        root = solution.removeNthFromEnd(root, 5);
//        printList(root);
//    }
//}
