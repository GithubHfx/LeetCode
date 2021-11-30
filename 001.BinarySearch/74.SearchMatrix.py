from typing import List
"""
编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：

每行中的整数从左到右按升序排列。
每行的第一个整数大于前一行的最后一个整数。

"""
class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row_low = 0
        length = len(matrix)
        row_high = length - 1
        # 行内锁定区间
        while row_low <= row_high:
            row_mid = (row_high - row_low) // 2 + row_low
            
            # 列内查找
            if matrix[row_mid][0] <= target <= matrix[row_mid][-1]:
                
                col_low = 0
                length = len(matrix[row_mid])
                col_high = length - 1
                while col_low <= col_high:
                    col_mid = (col_high - col_low) // 2 + col_low
                    if matrix[row_mid][col_mid] == target:
                        return True
                    elif matrix[row_mid][col_mid] > target:
                        col_high = col_mid - 1
                    else:
                        col_low = col_mid + 1
                return False
                
            elif target < matrix[row_mid][0]:
                row_high = row_mid - 1
            else:
                row_low = row_mid + 1
                
                
        return False
    
    
if __name__ == '__main__':
    solution = Solution()
    mat = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
    for i in range(61):
        print(f"{i}: {solution.searchMatrix(mat, i)}")
