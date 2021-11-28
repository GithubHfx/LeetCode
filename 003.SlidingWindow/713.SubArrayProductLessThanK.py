from typing import List
class Solution:
    def numSubarrayProductLessThanK1(self, nums: List[int], k: int) -> int:
        left = 0
        right = 0
        # 乘积结果变量
        mul = 1
        res = 0
        length = len(nums)
        while right < length:
            num = nums[right]
            right  += 1
            if num >= k:
                left = right
                mul = 1
                continue
            mul = mul * num
            while mul >= k:
                mul = mul // nums[left]
                left += 1
            if mul < k:
                res += (right - left)
        return res
    # 时间超过100%Python用户
    # 空间超过73%的Python用户
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if k == 0:
            return 0
        left = 0 
        prod = 1
        res = 0
        length = len(nums)
        for i in range(length):
            prod *= nums[right]
            while prod >= k:
                prod //= nums[left]
                left += 1
            res += right - left + 1
        return res
        
if __name__ == '__main__':
    obj = Solution()
    nums = [10, 5, 2, 6]
    k  = 100
    print(obj.numSubarrayProductLessThanK(nums, k))