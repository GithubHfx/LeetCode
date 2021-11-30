import collections
"""
在给定的网格中，每个单元格可以有以下三个值之一：

值 0 代表空单元格；
值 1 代表新鲜橘子；
值 2 代表腐烂的橘子。
每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。

返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
提示：

1 <= grid.length <= 10
1 <= grid[0].length <= 10
grid[i][j] 仅为 0、1 或 2

"""
class Solution:
    def orangesRotting(self, matrix) -> int:
        # 相邻四个矩阵
        
        
        # 宽高
        m, n = len(matrix), len(matrix[0])
        # 队列
        Q = collections.deque([])
        
        # 已访问集合
        visited = set()
        
        # 判断是否有新鲜橘子标志
        hasFresh = False
        
        # 时间计数变量
        t = 0
        
        # 统计空格单元变量，最后判断一次广度遍历是否能够将所有的橘子构成的图联通，如果不连通则返回-1
        blank_count = 0
        # 初始化队列，将所有起始点加入
        for i in range(m):
            for j in range(n):
                # 如果是烂橘子则加入队列且标记为已访问
                if matrix[i][j] == 2:
                    Q.append((i, j))
                    visited.add((i, j))
                # 如果是新鲜橘子，则标记为有新鲜橘子
                elif matrix[i][j] == 1:
                    hasFresh = True
                    
                # 如果是空白单元，则统计个数
                else:
                    blank_count += 1
                    
        if not hasFresh:
            return 0
        count = len(Q)
        rotting_count = 0
        rotting_count += count
        # 将所有相邻节点加入队列
        while Q:
            i, j = Q.popleft()
            count -= 1
            isRotting = False
            # 四个方位统计新鲜橘子，并按规则进行腐烂
            for x, y in [(i+1, j), (i-1, j), (i, j+1), (i, j-1)]:
                if 0 <= x < m and 0 <= y < n and (x, y) not in visited and matrix[x][y] == 1:
                    matrix[x][y] = 2
                    visited.add((x, y))
                    Q.append((x, y))
            # count归零后即一层访问完成，需要立即访问下一层，这时t+1,count 为当前队列中的橘子数
            if count == 0 and len(Q) != 0:
                count = len(Q)
                rotting_count += count
                t += 1
        if m * n > rotting_count + blank_count:
            return -1
        return t
        
if __name__ == '__main__':
    # 预期输出: 4,需要四分钟才能腐烂完
    # print(Solution().orangesRotting([[2,1,1],[1,1,0],[0,1,1]]))
    
    # 预期输出： -1， 图未联通不能腐烂完，
    # print(Solution().orangesRotting([[2,1,1],[0,1,1],[1,0,1]]))
    # 预期输出: 0 , 第0分钟已经没有新鲜橘子了，所以答案是0
    print(Solution().orangesRotting([[0,2]]))