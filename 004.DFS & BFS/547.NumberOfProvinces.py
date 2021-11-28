"""
有 n 个城市，其中一些彼此相连，另一些没有相连。
如果城市 a 与城市 b 直接相连，且城市 b 与城市 c 直接相连，那么城市 a 与城市 c 间接相连。
省份 是一组直接或间接相连的城市，组内不含其他没有相连的城市。
给你一个 n x n 的矩阵 isConnected ，其中 isConnected[i][j] = 1 表示第 i 个城市和第 j 个城市直接相连，而 isConnected[i][j] = 0 表示二者不直接相连。
返回矩阵中 省份 的数量。

提示：

1 <= n <= 200
n == isConnected.length
n == isConnected[i].length
isConnected[i][j] 为 1 或 0
isConnected[i][i] == 1
isConnected[i][j] == isConnected[j][i]
执行结果：通过
执行用时：32 ms, 在所有 Python3 提交中击败了99.90%的用户
内存消耗：15.2 MB, 在所有 Python3 提交中击败了71.20%的用户
"""


from typing import List
class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        count = 1
        visited = {0:True}
        queue = [0]
        for i in range(n):
            isConnected[i][i] = 0
        # 循环广度遍历图
        while queue != []:
            row_num = queue[0]
            queue.remove(row_num)
            for col_num, col in enumerate(isConnected[row_num]):
                if col == 1 and col_num not in visited:
                    queue.append(col_num)
                    visited[col_num] = True
            # 如果这时队列为空，则在未访问节点找到一个加入队列
            if queue == []:
                
                for i in range(n):
                    if i not in visited:
                        queue.append(i)
                        visited[i] = True
                        break
                # 如果找到，则计数加一
                if queue != []:
                    count += 1
        return count
        

if __name__ == '__main__':
    obj = Solution()
    isConnected = [[1,1,0],[1,1,0],[0,0,1]]
    ret = obj.findCircleNum(isConnected)
    print(ret)