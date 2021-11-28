class Solution:        
    def rotate(self, nums, k):
        length = len(nums)
        k = length - k % length - 1
        nums[:] = (nums[k::-1] + nums[:k:-1])[::-1]
        return nums
    
    def rotate2(self, nums, k):
        """
        Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        k = k % length
        r = length - k
        for i in range(r // 2):
            nums[i], nums[r - i - 1] = nums[r - i - 1], nums[i]
        
        for i in range(r, r + k // 2):
            nums[i], nums[length - i - 1 + r] = nums[length - i - 1 + r], nums[i]
        for i in range(length // 2):
            nums[i], nums[length - i -1] = nums[length - i -1], nums[i]
        
if __name__ == '__main__':
    print(Solution().rotate([],2))