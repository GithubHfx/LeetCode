from typing import List
"""
给你一个 n x n 的二进制矩阵 grid 中，返回矩阵中最短 畅通路径 的长度。如果不存在这样的路径，返回 -1 。
二进制矩阵中的 畅通路径 是一条从 左上角 单元格（即，(0, 0)）到 右下角 单元格（即，(n - 1, n - 1)）的路径，该路径同时满足下述要求：
路径途经的所有单元格都的值都是 0 。
路径中所有相邻的单元格应当在 8 个方向之一 上连通（即，相邻两单元之间彼此不同且共享一条边或者一个角）。
畅通路径的长度 是该路径途经的单元格总数。
示例 1：
输入：grid = [[0,1],[1,0]]
输出：2
示例 2：


输入：grid = [[0,0,0],[1,1,0],[1,1,0]]
输出：4
示例 3：

输入：grid = [[1,0,0],[1,1,0],[1,1,0]]
输出：-1
 

提示：

n == grid.length
n == grid[i].length
1 <= n <= 100
grid[i][j] 为 0 或 1


"""
class Solution:
    def shortestPathBinaryMatrix(self, grid: List[List[int]]) -> int:
        # 用三元组表示一个座标，以及起点到该点需要的距离
        n = len(grid)
        if grid[0][0] == 1 or grid[n-1][n-1] == 1:
            return -1
        if n == 1:
            return 1
        queue = [(0,0)]
        grid[0][0] = 1
        direction = [(-1, -1), (0,-1), (1, -1), (-1, 0), (1, 0), (-1, 1), (0,1), (1, 1)]
        while queue != []:
            tup = queue.poll()
            x, y = tup
            dis = grid[x][y] + 1
            for switch_x, switch_y in direction:
                tmp_x = x + switch_x
                tmp_y = y + switch_y
                # 最先到达一定是最短路径
                if (tmp_x, tmp_y) == (n - 1, n - 1):
                    return dis
                if 0 <= tmp_x < n and 0 <= tmp_y < n and grid[tmp_x][tmp_y] == 0:
                    queue.append((tmp_x, tmp_y))
                    grid[tmp_x][tmp_y] = dis
        # 如果到最后没有到达右下角，则返回-1 
        return -1
if __name__ == '__main__':
    obj = Solution()
    grid = [[0,0,0],[1,1,0],[1,1,1]]
    print(obj.shortestPathBinaryMatrix(grid))