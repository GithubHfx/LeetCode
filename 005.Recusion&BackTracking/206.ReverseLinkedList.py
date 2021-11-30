# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
        
def printList(head: ListNode):
    while head is not None:
        print(f"{head.val}->", end='')
        head = head.next
    print("")

class Solution:
    # 时间比较快，空间比较高，尝试另一种原地反转的算法
    def reverseList(self, head: ListNode) -> ListNode:
        ret = ListNode(None, None)
        s = None
        while head:
            ret.next, head.next, s = head, ret.next, head.next, 
            head = s
        return ret.next
        
    # 此方法时间较慢，空间较低，低不了多少
    def reverseList2(self, head: ListNode)->ListNode:
        if head is None: 
            return head
        left = head
        mid, left.next = head.next, None        
        right = None
        
        while mid:            
            mid.next, right, left = left, mid.next, mid            
            mid = right
        return left
    
    
    
if __name__ == '__main__':
    l1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, None)))))
    # l2 = ListNode(1, ListNode(3, ListNode(4, None)))
    l3 = None
    printList(l1)
    # printList(l2)
    printList(Solution().reverseList2(l1))