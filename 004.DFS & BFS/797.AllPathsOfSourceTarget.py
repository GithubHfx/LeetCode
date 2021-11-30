"""
给一个有 n 个结点的有向无环图，
找到所有从 0 到 n-1 的路径并输出（不要求按顺序）

二维数组的第 i 个数组中的单元都表示有向图中 i 号结点所能到达的下一些结点（译者注：有向图是有方向的，即规定了 a→b 你就不能从 b→a ）空就是没有下一个结点了。

执行结果：通过

执行用时：28 ms, 在所有 Python3 提交中击败了100.00%的用户
内存消耗：16 MB, 在所有 Python3 提交中击败了75.16%的用户
"""
from typing import List
class Solution:
    
    # bfs浪费时间空间
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        n = len(graph) - 1
        queue = [[0] + [num] for num in graph[0]]
        answer = []
        while queue != []:
            path = queue[0]
            queue.remove(path)
            last_node = path[-1]
            if last_node == n:
                answer.append(path)
                continue
            for node in graph[last_node]:
                ans = path.copy()
                ans.append(node)
                if node == n:
                    answer.append(ans)
                else:
                    queue.append(ans)
        return answer
    # dfs
    def allPathsSourceTargetDFS(self, graph: List[List[int]]) -> List[List[int]]:
        result = []
        path = [0]
        n = len(graph) - 1
        def dfs(num):
            if num == n:
                result.append(path.copy())
            else:
                for node in graph[num]:
                    path.append(node)
                    dfs(node)
                    path.pop()
        dfs(0)
        return result
    
    

if  __name__ == "__main__":
    obj = Solution()
    graph = [[1,2,3],[2],[3],[]]
    ans = obj.allPathsSourceTargetDFS(graph)
    print(ans)