from typing import List
"""
整数数组 nums 按升序排列，数组中的值 互不相同 。

在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。

给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。


提示：

1 <= nums.length <= 5000
-10^4 <= nums[i] <= 10^4
nums 中的每个值都 独一无二
题目数据保证 nums 在预先未知的某个下标上进行了旋转
-10^4 <= target <= 10^4



执行结果:通过

执行用时：24 ms, 在所有 Python3 提交中击败了98.65%的用户
内存消耗：15.4 MB, 在所有 Python3 提交中击败了5.23%的用户

"""
class Solution:
    # 击败百分之98
    def search(self, nums: List[int], target: int) -> int:
        length = len(nums)
        low = 0
        high = length - 1
        max_index = -1
        while low <= high:
            mid = (high - low) // 2 + low
            if mid < length - 1 and nums[mid] > nums[mid + 1]:
                # 翻转回原数组
                nums[:mid+1] = nums[:mid+1][::-1]
                nums[mid+1:] = nums[mid + 1:][::-1]
                nums = nums[::-1]
                max_index = mid
                break
                
            elif mid > 0 and nums[mid] < nums[mid - 1]:
                # 翻转回原数组
                nums[:mid] = nums[:mid][::-1]
                nums[mid:] = nums[mid:][::-1]
                nums = nums[::-1]
                max_index = mid  - 1
                break
                
            elif nums[mid] <= nums[-1]:
                high = mid - 1
            else:
                low = mid + 1
                
        # 有序序列中二分查找
        low = 0
        high = length - 1
        max_index = max_index + 1
        rotate_num = length - max_index
        while low <= high:
            mid = (high - low) // 2 + low
            if nums[mid] == target:
            # 下标还原返回
                if mid < length - max_index:
                    mid += max_index
                else:
                    mid -= rotate_num
                return mid
            elif nums[mid] > target:
                high = mid - 1
            else:
                low = mid + 1
                
        return -1
        
        
if __name__ == '__main__':
    obj = Solution()
    nums = [4]
    for i in range(8):
        print(obj.search(nums.copy(), i))
