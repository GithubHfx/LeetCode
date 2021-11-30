# 给定一个二维矩阵，求算由1组成的最大面积区域，只取1上下左右四个方向， 测试用例见下面main函数
class Solution:
     
    def BFSCountArea(self, grid, start_row, start_col)->int:
        queue = [(start_row, start_col)]
        grid[start_row][start_col] = 0
        area = 1
        while queue != []:
            pix = queue[0]
            # 从队列中移除
            queue.remove(pix)
            # 将该点标记位已访问，且访问四周的点统计面积
            r, c = pix
            
            if r - 1 >= 0 and grid[r-1][c] == 1:
                queue.append((r - 1, c))
                grid[r - 1][c] = 0
                area += 1
            if r + 1 < len(grid) and grid[r+1][c] == 1:
                grid[r + 1][c] = 0
                queue.append((r + 1, c))
                area += 1
            if c - 1 >= 0 and grid[r][c-1] == 1:
                grid[r][c - 1] = 0
                queue.append((r, c - 1))
                area += 1
            if c + 1 < len(grid[r]) and grid[r][c+1] == 1:
                grid[r][c + 1] = 0
                queue.append((r, c + 1))
                area += 1
        return area
        
        
    def maxAreaOfIsland(self, grid):
        max_area = 0
        i = 0
        while i < len(grid):
            area = 0
            if 1 in grid[i]:
                index = grid[i].index(1)
                area = self.BFSCountArea(grid, i, index)
                max_area =  max(area, max_area)
            else:
                i += 1
        return max_area
   


if __name__ == '__main__':
    grid = [[1,1,0,0,0],
            [1,1,0,0,0],
            [0,0,0,1,1],
            [0,0,0,1,1]]

    print(Solution().maxAreaOfIsland(grid))