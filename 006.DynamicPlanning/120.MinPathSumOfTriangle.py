"""
给定一个三角形 triangle ，找出自顶向下的最小路径和。

每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，
那么下一步可以移动到下一行的下标 i 或 i + 1 。
"""
from typing import List
class Solution:

    # 这答案居然很慢
    def minimumTotal(self, triangle: List[List[int]]) -> int:
        """
            三角形问题自底向上求解更简单
        """
        length = len(triangle)
        for i in range(length - 1, 0, -1):
            for j in range(1, len(triangle[i])):
                triangle[i - 1][j - 1] += min(triangle[i][j], triangle[i][j-1])
        print(triangle)
        return triangle[0][0]
                

if __name__ == '__main__':
    print(Solution().minimumTotal([[2],[3,4],[6,5,7],[4,1,8,3]]))
        