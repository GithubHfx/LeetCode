class Solution:

    count_dict = {0: 0, 1: 1, 2: 1, 3: 2, 4: 1, 5: 2, 6: 2, 7: 3, 8: 1, 9: 2, 10: 2, 11: 3, 12: 2, 13: 3, 14: 3, 15: 4}
    # 时间空间均击败70%
    def hammingWeight1(self, n:int)->int:
        num = 1 << 31
        
        count = 0
        for i in range(32):
            count = count + 1 if (num & n) != 0 else count
            n <<= 1
        return count
    # 循环8次， 每次计算4位的速度最快击败95%，空间占用最少：打败85%的用户
    def hammingWeight2(self, n:int)->int:
        count = 0
        for i in range(8):
            
            count += Solution.count_dict[n & 15]
            n >>= 4
        return count
    # 最慢，44ms，内置函数很慢
    def hammingWeight3(self, n):
        return bin(n).count('1')
        
    
if __name__ == "__main__":
    count_dict = {}
    for  i in range(256):
        count_dict[i] = Solution().hammingWeight3(i)
       
    print(count_dict == Solution.count_dict)