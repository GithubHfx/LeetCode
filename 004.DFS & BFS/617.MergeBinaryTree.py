# 合并二叉树，如果对应位置上均有值则对应相加，否则如果均没有值则为None, 如果任意一棵树有值则取有值的那个节点
# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    # dfs
    def mergeTrees(self, root1: TreeNode, root2: TreeNode) -> TreeNode:
        # 四种情况
        if root1 != None and root2 != None:
            root1.val += root2.val 
            root1.left = self.mergeTrees(root1.left, root2.left)
            root1.right = self.mergeTrees(root1.right, root2.right)
            return root1
        elif root1 == None and root2 != None:
            return root2
        elif root1 != None and root2 == None:
            return root1
        else:
            return None
            

def printTree(root):
    queue = [root]
    while queue != []:
        root = queue[0]
        queue.remove(root)
        print(str(root.val) + ', ')
        if root.left != None:
            queue.append(root.left)
        if root.right != None:
            queue.append(root.right)

if __name__ == '__main__':
    root1 = TreeNode(1, TreeNode(3, TreeNode(5, None, None), None), TreeNode(2, None, None))
    root2 = TreeNode(2, TreeNode(1, None, TreeNode(4, None, None)), TreeNode(3, None, TreeNode(7, None, None)))
    root3 = Solution().mergeTrees(root1, root2)