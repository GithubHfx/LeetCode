from typing import List
class Solution:
class Solution:
    # 双指针法寻找峰值，时间挺慢的，但是空间挺高的
    def findPeakElement1(self, nums: List[int]) -> int:
        length = len(nums)
        low = 1
        high = length - 2
        while low < high:
            if low + 1 < length and nums[low - 1] < nums[low] and nums[low] > nums[low + 1]:
                return low
            elif high - 1 >= 0 and nums[high - 1] < nums[high] and nums[high] > nums[high + 1]:
                return high
            else:
                low += 1
                high -= 1
        return -1
    def findPeakElement(self, nums: List[int])->int:
        length = len(nums)
        low = 0
        high = length - 1
        # if length == 1:
        #     return 0
        # elif length == 2:
        #     return 0 if nums[0] > nums[1] else 1
        while low <= high:
            mid = (high - low) // 2 + low
            if mid + 1 < length and nums[mid] > nums[mid+1]:
                high = mid
            else:
                left = mid + 1
        return left
        
if __name__ == '__main__':
    print(Solution().findMin([0,1,2, 4,5,6,7]))