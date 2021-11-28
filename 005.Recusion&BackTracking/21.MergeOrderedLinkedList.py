"""
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
提示：

两个链表的节点数目范围是 [0, 50]
-100 <= Node.val <= 100
l1 和 l2 均按 非递减顺序 排列
 """

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        l3=  None
        last = None
        while l1 is not  None and l2 is not None:
            tmp = None
            if l1.val <= l2.val:
                tmp = l1
                l1 = l1.next
            else:
                tmp = l2
                l2 = l2.next
            tmp.next = None
            if l3 is None:
                l3 = tmp
                last = tmp
            else:
                last.next = tmp
                last = tmp
        if l1 is not None:
            last.next = l1
        else:
            last.next = l2
        return l3
    # 此方法很快，空间会比自己
    def mergeTwoLists2(self, l1:ListNode, l2: ListNode)->ListNode:
        res = ListNode(None)
        node = res
        while l1 and l2:
            if l1.val<l2.val:
                node.next,l1 = l1,l1.next
            else:
                node.next,l2 = l2,l2.next
            node = node.next
       
        node.next = l1 if l1 else l2
        return res.next  
            
    
def printList(head: ListNode):
    while head is not None:
        print(f"{head.val}->", end='')
        head = head.next
    print("")
        
    
if __name__ == '__main__':
    l1 = ListNode(1, ListNode(2, ListNode(4, None)))
    l2 = ListNode(1, ListNode(3, ListNode(4, None)))
    printList(l1)
    printList(l2)
    printList(Solution().mergeTwoLists2(l1, l2))