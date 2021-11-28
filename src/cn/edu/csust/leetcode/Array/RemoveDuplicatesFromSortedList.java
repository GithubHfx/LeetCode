//package cn.edu.csust.leetcode.Array;
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}
//// 时间:100%
//// 空间:49.14%
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode p = head;
//        while(p.next != null){
//            if(p.next.val == p.val){
//                if(p == head){
//                    p = p.next;
//                    head = p;
//                }
//                else{
//                    p.next = p.next.next;
//                }
//            }
//            else{
//                p = p.next;
//            }
//        }
//        return head;
//    }
//}
//public class RemoveDuplicatesFromSortedList {
//    public static void printList(ListNode head){
//        while(head != null){
//            System.out.print(head.val + "->");
//            head = head.next;
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
//        printList(listNode);
//        Solution solution = new Solution();
//        printList(solution.deleteDuplicates(listNode));
//    }
//}
