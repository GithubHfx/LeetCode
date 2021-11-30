"""
给你一个非负整数数组 nums ，你最初位于数组的第一个位置。

数组中的每个元素代表你在该位置可以跳跃的最大长度。

你的目标是使用最少的跳跃次数到达数组的最后一个位置。

假设你总是可以到达数组的最后一个位置。

 

示例 1:

输入: nums = [2,3,1,1,4]
输出: 2
解释: 跳到最后一个位置的最小跳跃数是 2。
     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
示例 2:

输入: nums = [2,3,0,1,4]
输出: 2

迪杰斯特拉最短路径问题Djikstr
执行结果
执行时间:36 ms, 在所有 Python3 提交中击败了96.47%的用户
内存消耗：15.5 MB, 在所有 Python3 提交中击败了29.39%的用户
"""
from typing import List
class Solution:
    # 能通过时间空间都代价高
    def jump(self, nums: List[int]) -> int:
        n = 1
        length = len(nums)
        final = length - 1
        path = {t: 10000 for t in range(1, length)}
        path[0] = 0
        for i in range(length):
            for j in range(1, nums[i] + 1):
                if i + j < final:
                    path[i + j] = min(path[i] + 1, path[i + j])
                else:
                    path[final] = min(path[i] + 1, path[final])
        return path
    def jump2(self, nums: List[int]) -> int:
        end = 0
        start = 0
        step = 0
        length = len(nums)
        while end < length - 1:
            max_dist = end
            for i in range(start, end  + 1):
                if max_dist < nums[i] + i:
                    max_dist = nums[i] + i
            end = max_dist
            step += 1
        return step
    def jump3(self, nums: List[int]) -> int:
        current_dist = 0
        step = 0
        next_dist = 0
        length = len(nums)
        for i in range(length - 1):
            next_dist = max(nums[i] + i, current_dist)
            if i == current_dist:
                current_dist = next_dist
                step += 1
        return step
    
    
if __name__ == '__main__':
    obj = Solution()
    nums = [2, 3, 0,1,4]
    print(obj.jump3(nums))