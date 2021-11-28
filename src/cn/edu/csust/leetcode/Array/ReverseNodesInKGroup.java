//package cn.edu.csust.leetcode.Array;
//class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//
//class Solution {
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode node = head;
//        for(int i = 0;i<k;i++){
//            if(node == null){
//                return head;
//            }
//            node = node.next;
//        }
//
//        ListNode newHead = reverse(head, node);
//        head.next = reverseKGroup(node, k);
//        return newHead;
//    }
//
//    private ListNode reverse(ListNode first, ListNode last) {
//        ListNode pre = last;
//        for(;first != last;){
//            ListNode tmp = first.next;
//            first.next = pre;
//            pre = first;
//            first  = tmp;
//        }
//        return pre;
//    }
//}
//public class ReverseNodesInKGroup {
//    public static void print(ListNode head){
//        if(head == null) return;
//        while(head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
//        Solution solution = new Solution();
//        print(solution.reverseKGroup(root, 1));
//    }
//}
