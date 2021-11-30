from typing import List
"""
给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 

示例 1：


输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
示例 2：

输入：board = [["X"]]
输出：[["X"]]
 

提示：

m == board.length
n == board[i].length
1 <= m, n <= 200
board[i][j] 为 'X' 或 'O'

"""
class Solution:
    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        m = len(board)
        n = len(board[0])
        if m | n == 1:
            return
        visited = {}
        queue = []
        for i in range(m):
            for j in range(n):
                if board[i][j] == "O" and (i in [0, m - 1] or j in [0, n - 1]) and (i, j) not in visited:
                    queue.append((i, j))
                    visited[(i, j)] = True
                    print(f"({i}, {j})单元格被访问")
                    while queue != []:
                        loc = queue[0]
                        queue.remove(loc)
                        x, y = loc
                        if x + 1 <= m - 1 and board[x + 1][y] == "O" and (x + 1, y) not in visited:
                            queue.append((x + 1, y))
                            visited[(x + 1, y)] = True
                        if x - 1 >= 0 and board[x - 1][y] == "O" and (x - 1, y) not in visited:
                            queue.append((x - 1, y))
                            visited[(x - 1, y)] = True
                        if y + 1 <= n - 1 and board[x][y + 1] == "O" and (x, y + 1) not in visited:
                            queue.append((x, y + 1))
                            visited[(x, y + 1)] = True
                        if y - 1 >= 0 and board[x][y - 1] == "O" and (x, y - 1) not in visited:
                            queue.append((x, y - 1))
                            visited[(x, y - 1)] = True
                            
        for i in range(1, m - 1):
            for j in range(1, n - 1):
                if board[i][j] == "O" and (i, j) not in visited:
                    queue = [(i, j)]
                    board[i][j] = "X"
                    while queue != []:
                        loc = queue[0]
                        queue.remove(loc)
                        x, y = loc
                        if x + 1 <= m - 2 and board[x + 1][y] == "O" and (x + 1, y) not in visited:
                            board[x + 1][y] = "X"
                            queue.append((x + 1, y))
                        if x - 1 >= 1 and board[x - 1][y] == "O" and (x - 1, y) not in visited:
                            board[x - 1][y] = "X"
                            queue.append((x - 1, y))
                        if y + 1 <= n - 2 and board[x][y + 1] == "O" and (x, y + 1) not in visited:
                            board[x][y + 1] = "X"
                            queue.append((x, y + 1))
                        if y - 1 >= 1 and board[x][y - 1] == "O" and (x, y - 1) not in visited:
                            board[x][y - 1] = "X"
                            queue.append((x, y - 1))

if __name__ == "__main__":
    obj =  Solution()
    board  = [["O","O","O","O","X","X"],["O","O","O","O","O","O"],["O","X","O","X","O","O"],["O","X","O","O","X","O"],["O","X","O","X","O","O"],["O","X","O","O","O","O"]]
    board_copy = board.copy()
    obj.solve2(board)
    print(board == board_copy)