# Definition for singly-linked list.
"""
存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。

返回同样按升序排列的结果链表。
提示:
链表中节点数目在范围 [0, 300] 内
-100 <= Node.val <= 100
题目数据保证链表已经按升序排列

执行结果：通过
执行用时：32 ms, 在所有 Python3 提交中击败了97.44%的用户
内存消耗：15 MB, 在所有 Python3 提交中击败了35.87%的用户
"""
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def deleteDuplicates(self, head: ListNode) -> ListNode:
        root = ListNode(None, head)
        root_move = root
        move = head
        val = 0
        while move:
            val = move.val
            isDuplicate = False
            while move.next and move.next.val == val:
                isDuplicate = True
                move = move.next
            if not isDuplicate:
                root_move.next = move
                root_move = move
            move = move.next
            root_move.next = None
                
        return root.next

def printNode(root):
    
    while root != None:
        print(root.val, end=', ')
        root = root.next
        
if __name__ == '__main__':
    head = ListNode(2, ListNode(2, ListNode(3, ListNode(3, ListNode(4, ListNode(4, ListNode(5, None)))))))
    print("root:")
    printNode(head)
    print("remove duplicate:")
    printNode(Solution().deleteDuplicates(head))
    