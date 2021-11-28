"""
给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。

进阶：

你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
提示：

0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
nums 是一个非递减数组
-10^9 <= target <= 10^9

执行结果：
    
执行用时：
28 ms,在所有 Python3 提交中击败了95.76%的用户
内存消耗：
15.9 MB, 在所有 Python3 提交中击败了5.22%的用户

"""
from typing import List
class Solution:
class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        low = 0
        length = len(nums) 
        high = length - 1
        index_list = []
        if nums == [] or nums is None:
            return [-1, -1]
        while low <= high:
            mid = (high - low) // 2 + low
            if nums[mid] == target:
                start = mid
                end = mid
                while start > 0 and nums[start] == target:
                    start -= 1
                if start >= 0 and nums[start] == target:
                    index_list.append(start)
                else:
                    index_list.append(start + 1)
                while end < length - 1 and nums[end] == target:
                    end += 1
                if end <= length - 1 and nums[end] == target:
                    index_list.append(end)
                else:
                    index_list.append(end - 1)
                break
            elif nums[mid] > target:
                high = mid - 1
            else:
                low = mid + 1
          
        if len(index_list) == 2:
            return index_list
        return [-1, -1]
        
        
        
if __name__ == '__main__':
    obj = Solution()
    print(obj.searchRange([5,7], 9))
    
    print(obj.searchRange([5,7,7,8,8,10], 10))
    
    print(obj.searchRange([], 1))