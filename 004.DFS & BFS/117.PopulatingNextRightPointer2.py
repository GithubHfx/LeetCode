"""
# Definition for a Node.
给定一个二叉树

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

初始状态下，所有 next 指针都被设置为 NULL。

 

进阶：

你只能使用常量级额外空间。
使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度


执行结果：通过
执行用时：40 ms, 在所有 Python3 提交中击败了96.56%的用户
内存消耗：15.9 MB, 在所有 Python3 提交中击败了85.01%的用户
"""
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
class Solution:
    def connect(self, root: 'Node') -> 'Node':
        queue = [root]
        head = None
        while queue != []:
            head = queue[0]
            queue.clear()
            pre = None
            while head is not None:
                n = None
                if head.left is not None:
                    n =  head.left
                    if pre is not None:
                        pre.next = n
                    queue.append(n)
                    pre = n
                if head.right is not None:
                    n = head.right
                    if pre is not None:
                        pre.next = n
                    queue.append(n)
                    pre = n
                head = head.next
        return root
def printTree(root):
    head = None
    queue = [root]
    while queue:
        head = queue.pop()
        while head:
            if head.left is not None and queue == []:
                queue.append(head.left)
            if head.right is not None and queue == []:
                queue.append(head.right)
                
            print(head.val, end=',')
            head = head.next
        print('#')


if __name__ == '__main__':
    obj = Solution()
    root = Node(val=1, left=Node(val=2, left=Node(val=4), right=Node(val=5)), right=Node(val=3, right=Node(val=7)))
    printTree(obj.connect(root))
    