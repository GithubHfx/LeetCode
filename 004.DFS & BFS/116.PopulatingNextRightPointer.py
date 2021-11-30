"""
# Definition for a Node.
将树的右节点指针填充好，按层次填充，如果没有右节点则为None
"""
class Node:
    def __init__(self, val: int = 0, left=None, right= None, next=None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
        
        
class Solution:

    # 深度优先遍历
    def connect1(self, root: 'Node') -> 'Node':
        if root == None:
            return None
        else:
            tmp = root.left
            if tmp != None:
                tmp.next = root.right
                while tmp.next != None:
                    if tmp.right != None:
                        tmp.right.next = tmp.next.left
                    tmp = tmp.next
            root.left = self.connect(root.left)
            root.right = self.connect(root.right)
            return root
    # 递归慢得多，非递归方法时间击败百分之97的提交用户
    def connect(self, root: 'Node') -> 'Node':
        if root == None:
            return None
        if root.left != None:
            root.left.next = root.right
            p = root.left
            while p != None:
                q = p
                while q != None:
                    if q.left != None:
                        q.left.next = q.right
                        if q.next != None:
                            q.right.next = q.next.left
                    q = q.next
                p = p.left
        return root
        
        
def printNode(root):
    queue = []
    while root != None:
        queue.append(root)
        root = root.left
    while queue != []:
        root = queue[0]
        queue.remove(root)
        while root != None:
            print(root.val, end=', ')
            root = root.next
        print('#')

if __name__ == '__main__':
    root = Node(1, Node(2, Node(4, None, None, None), Node(5, None, None, None), None),
                   Node(3, Node(6, None, None, None), Node(7, None, None, None), None), None)
    root = Solution().connect(root)
    printNode(root)   