class Solution:
    # 时间击败90%， 空间击败57%
    def permute(self, nums):
        if len(nums) == 1:
            return [[nums[0]]]
        answer = []
        init_list = [[l] for l in nums]
        for index, init in enumerate(init_list):
            
            nums.remove(init[0])
            for item in self.permute(nums):
                init.extend(item)
                answer.append(init.copy())
                init = init[:1]
            
            nums.insert(index, init[0])
        return answer
        
        
        
if __name__ == '__main__':
    print(Solution().permute([1, 2, 3]))