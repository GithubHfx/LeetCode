class Solution:
    # 此方法空间利用要少0.1MB
    def twoSum(self, numbers, target):
        for i in range(1, len(numbers)):
            rest = target - numbers[i-1]
            if rest in numbers[i:]:
                index_another = numbers[i:].index(rest)
            
                return [i, index_another + 1 + i]
    # 此方法速度很快     
    def twoSum(self, numbers, target):
        left = 0
        right = len(numbers) - 1
        while left < right:
            res = numbers[left] + numbers[right]
            if res == target:
                return [left + 1, right + 1]
            elif res > target:
                right -= 1
            else:
                left += 1
if __name__ == '__main__':
    print(Solution().twoSum([2,3, 4], 6))