# 最长无重复字符子串
"""
    解题思路：利用滑动窗口，记录每次上一个同样字符出现时最大的长度，
    到遇到下一个时记录当前字符到前一个同样字符的长度与上一次的最大值，如果没有出现同样字符就统计从开始到现在的长度
    
"""
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        st = {}
        i, ans = 0, 0
        for j in range(len(s)):
            if s[j] in st:
                i = max(st[s[j]], i)
            ans = max(ans, j - i + 1)
            st[s[j]] = j + 1
        return ans