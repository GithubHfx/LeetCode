"""
给定一个含有 n 个正整数的数组和一个正整数 target 。
找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
并返回其长度。如果不存在符合条件的子数组，返回 0 。


执行结果：通过
执行用时：36 ms, 在所有 Python3 提交中击败了95.43%的用户
内存消耗：16.6 MB, 在所有 Python3 提交中击败了10.49%的用户
"""
from typing import List
class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        length = len(nums)
        right = 0
        left = 0
        min_len = length
        res = 0
        while right < length:
            res += nums[right]
            right += 1
            if res >= target:
                while res >= target:
                    res -= nums[left]
                    left += 1
                
                tmp = right - left + 1
                min_len = min_len if min_len < tmp else tmp
                left -= 1
                res += nums[left]
        if min_len == length and res < target:
            return 0
        return min_len


if __name__ == '__main__':
    obj = Solution()
    target = 9
    nums = [1,1,1,1,1,1,1,1]
    print(obj.minSubArrayLen(target, nums))
            