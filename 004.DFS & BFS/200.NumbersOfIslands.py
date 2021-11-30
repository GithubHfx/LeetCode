from typing import List
"""
执行结果：通过
执行用时：48 ms, 在所有 Python3 提交中击败了98.88%的用户
内存消耗：18.5 MB, 在所有 Python3 提交中击败了95.06%的用户

给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。

岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。

此外，你可以假设该网格的四条边均被水包围
m == grid.length
n == grid[i].length
1 <= m, n <= 300
grid[i][j] 的值为 '0' 或 '1'
"""
class Solution:
    def numIslands(self, grid: List[List[str]]) -> int :
        m, n = len(grid), len(grid[0])
        queue = []
        count = 0
        for row_num, row in enumerate(grid):
            for col_num, cell in enumerate(row):
                if cell == '1':
                    queue.append((row_num, col_num))
                    grid[row_num][col_num] = '0'
                    count += 1
                    while queue != []:
                        loc = queue[0]
                        r, c = loc
                        queue.remove(loc)
                        
                        
                        # 左面判断边界
                        if r - 1 >= 0 and grid[r-1][c] == '1':
                            queue.append((r - 1, c))
                            grid[r-1][c] = '0'
                        # 右边判断边界
                        if r + 1 < m and grid[r + 1][c] == '1':
                            queue.append((r + 1, c))
                            grid[r+1][c] = '0'
                        # 上面判断边界
                        if c - 1 >= 0 and grid[r][c - 1] == '1':
                            queue.append((r, c - 1))
                            grid[r][c - 1] = '0'
                        # 下面判断边界
                        if c + 1 < n and grid[r][c + 1] == '1':
                            queue.append((r, c + 1))
                            grid[r][c + 1] = '0'
        return count                 
                


if __name__ == '__main__':
    obj = Solution()
    grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]

    print(obj.numIslands(grid))