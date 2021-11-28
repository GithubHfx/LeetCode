"""
给你一个整数数组 nums ，数组中的元素 互不相同 。
返回该数组所有可能的子集（幂集）。

解集不能包含重复的子集。你可以按任意顺序返回解集。
示例 1：

输入：nums = [1,2,3]
输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
示例 2：

输入：nums = [0]
输出：[[],[0]]
 

提示：

1 <= nums.length <= 10
-10 <= nums[i] <= 10
nums 中的所有元素 互不相同
执行结果：通过

执行用时：28 ms, 在所有 Python3 提交中击败了93.94%的用户
内存消耗：15 MB, 在所有 Python3 提交中击败了59.68%的用户
"""
from typing import List
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []
        n = len(nums)
        def combination(n, k):
            if k == 0:
                return [[]]
            if k == 1:
                return [[nums[i]] for i in range(n) ]
            if k == n:
                return [[nums[i] for i in range(n)]]
            
            answer = combination(n - 1, k)
            for item in combination(n - 1, k - 1):
                item.append(nums[n - 1])
                answer.append(item)
            return answer
        for i in range(n + 1):
            ans += combination(n, i)
        return ans


if __name__ == "__main__":
    print(Solution().subsets(nums = [0, 1, 2, 3]))