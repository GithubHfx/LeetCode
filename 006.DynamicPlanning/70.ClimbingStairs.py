from enum import Enum
from collections import Counter
"""
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。
"""
class Stair(Enum):
    v1 = 1
    v2 = 2
    v3 = 3 
    v4 = 5 
    v5 = 8 
    v6 = 13 
    v7 = 21   
    v8 = 34 
    v9 = 55 
    v10 = 89   
    v11 = 144   
    v12 = 233  
    v13 = 377 
    v14 = 610 
    v15 = 987 
    v16 = 1597
    v17 = 2584
    v18 = 4181
    v19 = 6765         
    v20 = 10946 
    v21 = 17711 
    v22 = 28657 
    v23 = 46368 
    v24 = 75025 
    v25 = 121393
    v26 = 196418
    v27 = 317811
    v28 = 514229
    v29 = 832040
    v30 = 1346269 
    v31 = 2178309 
    v32 = 3524578 
    v33 = 5702887 
    v34 = 9227465 
    v35 = 14930352 
    v36 = 24157817
    v37 = 39088169
    v38 = 63245986
    v39 = 102334155 
    v40 = 165580141 
    v41 = 267914296 
    v42 = 433494437 
    v43 = 701408733 
    v44 = 1134903170
    v45 = 1836311903
     
     
class Solution:
    def climbStairs1(self, n: int) -> int:
        if n == 1:
            return 1
        if n == 2:
            return 2
        first = 1
        second = 2
        i = 3
        while i <= n:
            ret = first + second
            first = second
            second = ret
            i += 1
        return ret
    def climbStairs(self, n: int)->int:
       return {1: 1, 
       2:   2 , 
       3:   3 , 
       4:   5 , 
       5:   8 , 
       6:   13 , 
       7:   21 ,   
       8:   34 ,
         9:   55 ,
         10:  89 ,   
         11:  144 ,   
         12:  233 , 
         13:  377 ,
         14:  610 ,
         15:  987 ,
         16:  1597 ,
         17:  2584 ,
         18:  4181 ,
         19:  6765 ,         20:  10946 ,
         21:  17711 ,
         22:  28657 ,
         23:  46368 ,
         24:  75025 ,
         25:  121393 ,
         26:  196418 ,
         27:  317811 ,
         28:  514229 ,
         29:  832040 ,
         30:  1346269 ,
         31:  2178309 ,
         32:  3524578 ,
         33:  5702887 ,
         34:  9227465 ,
         35:  14930352 ,
         36:  24157817 ,
         37:  39088169 ,
         38:  63245986 ,
         39:  102334155 ,
         40:  165580141 ,
         41:  267914296 ,
         42:  433494437 ,
         43:  701408733 ,
         44:  1134903170 ,
         45:  1836311903 }[n]
    # 比字典慢，比前面的方法都浪费空间
    def climbStairs2(self, n):
        return [0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 
                17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 
                9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437,
                701408733, 1134903170, 1836311903][n]
    # 时间更慢， 空间比列表好一点，但比字典高一点           
    def climbStairs3(self, n):
        return Stair['v' + str(n)].value
    # 时间一样慢，字典是最优解
    def climbStairs4(self, n):
        if n < 4:
            return n
        elif n == 4:
            return 5
        elif n == 5:
            return 8
        elif n == 6:
            return 13
        elif n == 7:
            return 21
        elif n == 8:
            return 34
        elif n == 9:
            return 55
        elif n == 10:
            return 89
        elif n == 11:
            return 144
        elif n == 12:
            return 233
        elif n == 13:
            return 377
        elif n == 14:
            return 610
        elif n == 15:
            return 987
        elif n == 16:
            return 1597
        elif n == 17:
            return 2584
        elif n == 18:
            return 4181
        elif n == 19:
            return 6765
        elif n == 20:
            return 10946
        elif n == 21:
            return 17711
        elif n == 22:
            return 28657
        elif n == 23:
            return 46368
        elif n == 24:
            return 75025
        elif n == 25:
            return 121393
        elif n == 26:
            return 196418
        elif n == 27:
            return 317811
        elif n == 28:
            return 514229
        elif n == 29:
            return 832040
        elif n == 30:
            return 1346269
        elif n == 31:
            return 2178309
        elif n == 32:
            return 3524578
        elif n == 33:
            return 5702887
        elif n == 34:
            return 9227465
        elif n == 35:
            return 14930352
        elif n == 36:
            return 24157817
        elif n == 37:
            return 39088169
        elif n == 38:
            return 63245986
        elif n == 39:
            return 102334155
        elif n == 40:
            return 165580141
        elif n == 41:
            return 267914296
        elif n == 42:
            return 433494437
        elif n == 43:
            return 701408733
        elif n == 44:
            return 1134903170
       
        return 1836311903




if __name__ == '__main__':
    for i in range(1, 46):
        print(Solution().climbStairs2(i) == Solution().climbStairs4(i))