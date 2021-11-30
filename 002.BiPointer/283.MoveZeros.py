class Solution:
    def moveZeroes(self, nums) -> None:
        """
        给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        j = len(nums) - 1
        k = 0
        while i <= j and k <= j:
            if nums[k] != 0:
                nums[i] = nums[k]
                i += 1
            
            k += 1
        nums[i:] = [0 for _ in range(j - i + 1)]
        return nums
    def moveZeroes2(self, nums):
        nums.sort(key=bool, reverse=True)
        
        return nums
    
    def moveZeroes3(self, nums):
    """
        避免这种方式，for循环很慢
    """
        for i in range(nums.count(0)):
            nums.remove(0)
            nums.append(0)
        return nums
if __name__ == '__main__':
    print(Solution().moveZeroes3([0,1,0,3,12]))