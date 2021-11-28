"""
给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true

输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
输出：true

输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
输出：false
"""
from typing import List
class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        path = []
        stack = []
        length = len(word)
        m, n = len(board), len(board[0])
        
        def dfs(layer):
            if len(path) == length:
                return True
            print(path)
            r, c = stack[-1]
            up, down, left, right = False, False, False, False
            if 0 <= r - 1 < m and board[r - 1][c] == word[layer]:
                letter = board[r - 1][c]
                board[r - 1][c] = ""
                
                stack.append((r - 1, c))
                path.append((r - 1, c))
                
                up = dfs(layer + 1)
                
                path.pop()
                stack.pop()
                board[r - 1][c] = letter
                if up:
                    return up
            if 0 <= r + 1 < m and board[r + 1][c] == word[layer]:
                letter = board[r + 1][c]
                board[r + 1][c] = ""
                
                stack.append((r + 1, c))
                path.append((r + 1, c))
                
                down = dfs(layer + 1)
                board[r + 1][c] = letter
                stack.pop()
                path.pop()
                if down:
                    return down
            if 0 <= c - 1 < n and board[r][c - 1] == word[layer]:
                letter = board[r][c - 1]
                board[r][c - 1] = ""
                
                stack.append((r, c - 1))
                path.append((r, c - 1))
                
                left = dfs(layer + 1)
                
                path.pop()
                stack.pop()
                board[r][c - 1] = letter
                if left:
                    return True
            if 0 <= c + 1 < n and board[r][c + 1] == word[layer]:
                letter = board[r][c + 1]
                board[r][c + 1] = ""
                
                stack.append((r, c + 1))
                path.append((r, c + 1))
                
                right = dfs(layer + 1)
                
                stack.pop()
                path.pop()
                board[r][c + 1] = letter
                if right:
                    return True
            return False
        
        
        for row, l in enumerate(board):
            for col, letter in enumerate(l):
                if board[row][col] == word[0]:
                    stack.append((row, col))
                    
                    board[row][col] = ""
                    
                    path.append((row, col))
                    
                    if dfs(1):
                        return True
                    board[row][col] = word[0]
                    path.pop()
        return False
                    
        

if __name__ == '__main__':
    obj = Solution()
    grid = [["A","A","A","A","A","A"],["A","A","A","A","A","A"],["A","A","A","A","A","A"],["A","A","A","A","A","A"],["A","A","A","A","A","A"],["A","A","A","A","A","A"]]

    word = "AAAAAAAAAAAAAAB"
    print(obj.exist(grid, word))
    