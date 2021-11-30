"""
给你一个字符串 s，找到 s 中最长的回文子串。

示例 1：
输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。
示例 2：
输入：s = "cbbd"
输出："bb"
示例 3：
输入：s = "a"
输出："a"
示例 4：
输入：s = "ac"
输出："a"
 
提示：
1 <= s.length <= 1000
s 仅由数字和英文字母（大写和/或小写）组成

"""
from typing import List
class Solution:
    def longestPalindrome(self, s: str) -> str:
        if s is None or s == "":
            return ""
        index = [0, 0]
        length = len(s)
        i = 0
        while i < length:
            
            t = self.findLongest(s, i , index)
            if t != i:
                i = t
            else:
                i += 1
        return s[index[0]:index[1] + 1]
            
    def findLongest(self, s: str, low: int, index: List[int]) -> int:
        high = low
        length = len(s)
        while high < length  - 1 and s[high + 1] == s[low]:
            high += 1
        ans = high 
        while low > 0 and high < length - 1 and s[low - 1] == s[high + 1]:
            low -= 1
            high += 1
        if high - low > index[1] - index[0]:
            index[0] = low
            index[1] = high
        return ans
        

if __name__ == '__main__':
    obj = Solution()
    string = "ac"
    print(obj.longestPalindrome(string))