"""
一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。

机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。

问总共有多少条不同的路径？

 

示例 1：


输入：m = 3, n = 7
输出：28
示例 2：

输入：m = 3, n = 2
输出：3
解释：
从左上角开始，总共有 3 条路径可以到达右下角。
1. 向右 -> 向下 -> 向下
2. 向下 -> 向下 -> 向右
3. 向下 -> 向右 -> 向下
示例 3：

输入：m = 7, n = 3
输出：28
示例 4：

输入：m = 3, n = 3
输出：6
 

提示：

1 <= m, n <= 100
题目数据保证答案小于等于 2 * 10^9


"""
from typing import List
class Solution:
    # 递归：150ms
    def uniquePaths(self, m: int, n: int):
        if m == 1 or n == 1:
            return 1
            
        bigger = max(m, n)
        smaller = m + n - bigger
        if smaller == 2:
            return bigger
        if smaller == 3:
            return (1 + bigger) * bigger // 2
        answer = 0
        for i in range(1, bigger + 1):
            answer += i * self.uniquePaths(smaller - 2, bigger + 1 - i)
        return answer
    # 非递归：44ms，依旧很慢
    def uniquePaths2(self, m: int, n: int) -> int:
        if m == 1 or n == 1:
            return 1
        bigger = max(m, n)
        smaller = m + n - bigger
        if smaller == 2:
            return bigger
        if smaller == 3:
            return (1 + bigger) * bigger // 2
        answer_dict = {2: [i for i in range(bigger + 1)], 3: [0, 1, 3] + [(1 + t) * t // 2  for t in range(3, bigger + 1)]}
        
        for i in range(4, smaller + 1):
            answer_dict[i] = [0, 1, i, (i + 1) * i // 2]
            
            for j in range(4, bigger + 1):
                s = min(i, j)
                b = i + j - s
                answer_dict[i].append(sum([t * answer_dict[s - 2][b - t + 1] for  t in range(1, b + 1)]))
        return answer_dict[smaller][bigger]
        
    # 标准答案
    def uniquePaths3(self, m: int, n: int) -> int:
        dp = [[1 for i in range(n)] for j in range(m)]
        for i in range(1, m):
            for j in range(1, n):
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j]
        return dp[m - 1][n - 1]
    # 一维版
    def uniquePaths4(self, m: int, n: int) -> int:
        dp = [1 for i in range(n)]
        for i in range(1, m):
            for j in range(1, n):
                 dp[j] += dp[j - 1]
        return dp[n - 1]

        
if __name__ == '__main__':
    obj = Solution()
    m = 100
    n = 100
    ans = obj.uniquePaths2(m, n)
    for key in ans:
        print(f"{key}:{ans[key]}")