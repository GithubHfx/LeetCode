from typing import List


"""
给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

说明：你不能倾斜容器。
输入：[1,8,6,2,5,4,8,3,7]
输出：49 
解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
示例 2：

输入：height = [1,1]
输出：1
示例 3：

输入：height = [4,3,2,1,4]
输出：16
示例 4：

输入：height = [1,2,1]
输出：2
 

提示：

n = height.length
2 <= n <= 3 * 10^4
0 <= height[i] <= 3 * 10^4

执行结果：通过
执行用时：164 ms, 在所有 Python3 提交中击败了84.38%的用户
内存消耗：24.2 MB, 在所有 Python3 提交中击败了56.86%的用户

"""
class Solution:
    # 执行结果：通过
    # 执行用时：164 ms, 在所有 Python3 提交中击败了84.38%的用户
    # 内存消耗：24.2 MB, 在所有 Python3 提交中击败了56.86%的用户

    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height) -  1
        max_area = 0
        while i < j:
            if height[i] < height[j]:
                max_area = max(max_area, (j - i) * height[i])
                i += 1
            else:
                max_area = max(max_area, (j - i) * height[j])
                j -= 1
        return max_area
    # 执行结果：通过
    # 执行用时：100 ms, 在所有 Python3 提交中击败了97.85%的用户
    # 内存消耗：24.3 MB, 在所有 Python3 提交中击败了42.00%的用户

    def maxArea(self, height: List[int]) -> int:
        i = 0
        j = len(height) -  1
        max_area = 0
        while i < j:
            if height[i] < height[j]:
                tmp = (j - i) * height[i]
                max_area = max_area if max_area > tmp  else tmp
                i += 1
            else:
                tmp = (j - i) * height[j]
                max_area = max_area if max_area > tmp  else tmp
                j -= 1
        return max_area


if __name__ == '__main__':
    print(Solution().maxArea([4,3,2,1,4]))