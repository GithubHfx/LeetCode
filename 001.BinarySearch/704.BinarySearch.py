class Solution:
    def search(num, target):
        l = 0
        h = len(num) - 1
        while l <= h:
            mid = (l + h) // 2
            if num[mid] > target:
                h = mid - 1
            elif num[mid] < target:
                l = mid + 1
            else:
                return mid
        return -1
        
        
if __name__ == '__main__':
    print(Solution.search([-1,0,3,5,9,12], 2))