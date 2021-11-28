"""
给定一个头结点为 head 的非空单链表，返回链表的中间结点。

如果有两个中间结点，则返回第二个中间结点。

 提示：

给定链表的结点数介于 1 和 100 之间。
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
"""
class Solution:
     def middleNode(self, head: ListNode) -> ListNode:
        
        single_pointer  = head
        bi_pointer = head.next
        for i in range(101):
            if bi_pointer != None:
                single_pointer = single_pointer.next
                bi_pointer = bi_pointer.next
                if bi_pointer != None:
                    bi_pointer = bi_pointer.next
                else:
                    return single_pointer
            else:
                return single_pointer
        return single_pointer
        
        
        
if __name__ == '__main__':
    print(Solution().middleNode([-1,0,3,5,9,12]))