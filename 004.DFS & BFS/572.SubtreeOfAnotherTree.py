"""

执行结果：通过

执行用时：52 ms, 在所有 Python3 提交中击败了99.66%的用户
内存消耗：15 MB, 在所有 Python3 提交中击败了99.33%的用户
"""
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def isSubtree(self, root: TreeNode, subRoot: TreeNode) -> bool:
        print(self.dfs(subRoot))
        return self.dfs(subRoot) in self.dfs(root)

    def dfs(self, subRoot: TreeNode) -> str:
        sub_q = [subRoot]
        sub_index = 0
        sub_head = None
        subs = ''
        
        # 非递归循环深度遍历子树
        while sub_q != []:
            sub_head = sub_q.pop()
            
            # 如果当前节点不为空，则将当前节点值整合到字符串中
            if sub_head:
                subs += "\'" +  str(sub_head.val) + "\'"
                sub_q.append(sub_head.right)
                while sub_head.left:
                    sub_head = sub_head.left
                    subs += "\'" +  str(sub_head.val) + "\'"
                    sub_q.append(sub_head.right)
                    
                # 遍历完成，就添一个#号
                subs += '#'
            else:
                subs += '#'
        return subs
if __name__ == '__main__':
    obj = Solution()
    root = TreeNode(val=3, left=TreeNode(val=4, left=TreeNode(val=1), right=TreeNode(val=2)), right=TreeNode(val=5))
    subRoot = TreeNode(val=4, left=TreeNode(val=1), right=TreeNode(val=2))
    print(obj.isSubtree(root, subRoot))
        