class Solution:
    """
        循环很慢
    """
    def reverseBits2(self, n: int) -> int:
        tmp = 0
        ret = 0
        for i in range(32):
            tmp = n & 1
            ret ^= tmp
            ret <<= 1
            n >>= 1
        
        return ret >> 1
    
    
    def reverseBits(self, n: int) -> int:
        n = (n & 0xaaaaaaaa) >> 1 | (n & 0x55555555) << 1
        n = (n & 0xcccccccc) >> 2 | (n & 0x33333333) << 2
        n = (n & 0xF0F0F0F0) >> 4 | (n & 0x0F0F0F0F) << 4
        n = (n & 0xFF00FF00) >> 8 | (n & 0x00FF00FF) << 8
        return (n & 0xFFFF0000) >> 16 | (n & 0x0000FFFF) << 16


if __name__ == '__main__':
    obj = Solution()
    for i in range(10):
        print(obj.reverseBits(i) == obj.reverseBits2(i))