from typing import List
# class Node:
#     """
#         可以用OOP思想进行实现，不过以后再试
#     """
#     def __init__(self):
#         """
#             实例化函数，
#             sibling 和children用于连接兄弟节点和子节点
#         """
# 
#         sibing = None
#         children  = None
# 
# 
#     def insertSibling(self, node: 'Node') -> None:
#         """
#             头插法插入兄弟节点
#         """
#         if self.sibing is None:
#             self.sibing = node
#         else:
#             node.sibing = self.sibing
#             self.sibing = node
#     
#     def insertChildren(self, node: 'Node') -> None:
#         pass
#         
#     
#     def hasChildren(self) -> bool:
#         return children is None
class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans = []
        def dfs(left_rest, right_left, current):
            if left_rest == 0 and right_left == 0:
                ans.append(current)
                return
            if left_rest > 0:
                dfs(left_rest - 1, right_left, current + "(")
            if right_left > left_rest:
                dfs(left_rest, right_left - 1, current + ")")
        dfs(n, n, "")
        return ans

if __name__ == "__main__":
    answer = [[],["()"], ["()()", "(())"], ["()()()", "((()))", "(())()", "()(())", "(()())"]]
    for i in range(1, 4):
        print(f"i = {i}, {Solution().generateParenthesis(i)}")