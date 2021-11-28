"""
全排列
给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。

"""
from typing import List
class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        # 执行结果：通过
        # 执行用时: 36 ms, 在所有 Python3 提交中击败了94.03%的用户
        # 内存消耗：15.2 MB, 在所有 Python3 提交中击败了49.32%的用户
        def helper(numbers):    
            unique_nums = set(numbers) 
            if len(unique_nums) == 1:
                return [numbers]
            answer = []
            for num in unique_nums:
                index = numbers.index(num)
                numbers.remove(num)
                
                for item in helper(numbers):
                    answer.append([num] + item)
                numbers.insert(index, num)
            return answer
        nums = sorted(nums)
        return helper(nums)
    # 用该方法较慢
    def permuteUnique2(self, nums: List[int]) -> List[List[int]]:
        counter = {}
        for num in nums:
            counter[num] = counter.get(num, 0) + 1
        def helper() -> List[List[int]]:
            if len(counter) == 1:
                return [[key] * counter[key] for key in counter]
            answer = []
            for num in list(counter.keys()):
                counter[num] -= 1
                if counter[num] == 0:
                    del counter[num]
                for item in helper():
                   answer.append([num] + item)
                
                counter[num] = counter.get(num, 0) + 1
            return answer
        return helper()
if __name__ == '__main__':
    obj = Solution()
    nums = [1, 2, 1]
    print(obj.permuteUnique2(nums))