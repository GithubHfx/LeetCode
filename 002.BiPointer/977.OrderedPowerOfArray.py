class Solution:
    def sortedSquares(self, nums):
        return sorted([i ** 2 for i in nums])
        
        
        
if __name__ == '__main__':
    print(Solution().sortedSquares([-1,0,3,5,9,12]))