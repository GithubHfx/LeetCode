"""
你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。

给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，今晚能够偷窃到的最高金额。

 

示例 1：

输入：nums = [2,3,2]
输出：3
解释：你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
示例 2：

输入：nums = [1,2,3,1]
输出：4
解释：你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
     偷窃到的最高金额 = 1 + 3 = 4 。
示例 3：

输入：nums = [0]
输出：0
 

提示：

1 <= nums.length <= 100
0 <= nums[i] <= 1000


执行结果：通过

执行用时：24 ms, 在所有 Python3 提交中击败了97.59%的用户
内存消耗：14.9 MB, 在所有 Python3 提交中击败了69.53%的用户

思路就是：将0-n - 1和1 - n弄成两条链进行打劫，最后选取最大的那种方案
"""
from typing import List
class Solution:
    def rob(self, nums: List[int]) -> int:
        length = len(nums)
        if length == 1:
            return nums[0]
        return max(self.rob2(nums[:-1], length - 1), self.rob2(nums[1:], length - 1))
    def rob2(self, numbers: List[int], l: int) -> int:
        if l == 1:
            return numbers[0]
        elif l == 2:
            return numbers[0] if numbers[0] > numbers[1] else numbers[1]
        dp = [numbers[0], max(numbers[0], numbers[1]), 0]
        for i in range(2, l):
            dp[2] = max(numbers[i] + dp[0], dp[1])
            dp[0], dp[1] = dp[1], dp[2]
        return dp[2]

if __name__ == '__main__':
    obj = Solution()
    numbers = [4,1,2,7,5,3,1]
    print(obj.rob(numbers))