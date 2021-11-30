"""
	找出只出现过一次的数字

"""
from typing import List
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        tmp = 0
        for  i in nums:
            tmp ^= i
        return tmp


if __name__ == "__main__":
    obj = Solution()
    print(obj.singleNumber([1, 2, 3, 2, 1]))