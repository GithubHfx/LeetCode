# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# 删除倒数第N个结点返回链表头节点
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        faster = head
        slower = head
        # 删除倒数第几个，就是快指针先走几步
        for  i in range(n):
            faster = faster.next
        # 如果faster不为空或者faster的下一个不为空那么就退出循环
        while faster != None and faster.next != None:
            slower = slower.next
            faster = faster.next
        if faster == None:
            return head.next
        else:
            slower.next = slower.next.next
        return head