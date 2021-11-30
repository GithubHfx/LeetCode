from typing import List
"""
给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。

异位词 指字母相同，但排列不同的字符串。
提示:

1 <= s.length, p.length <= 3 * 10^4
s 和 p 仅包含小写字母

执行结果：通过
执行用时：76 ms, 在所有 Python3 提交中击败了89.95%的用户
内存消耗：15.2 MB, 在所有 Python3 提交中击败了56.23%的用户
"""
class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        sub_dict = {}
        str_dict = {}
        length_s = len(s)
        length_p = len(p)
        answer = []
        if length_p > length_s:
            return answer
        for i in range(length_p):
            sub_dict[p[i]] = 1 if p[i] not in sub_dict else sub_dict[p[i]] + 1
            # if p[i] not in sub_dict:
            #     sub_dict[p[i]] = 1
            # else:
            #     sub_dict[p[i]] += 1
            str_dict[s[i]] = 1 if s[i] not in str_dict else str_dict[s[i]] + 1
            # if s[i] not in str_dict:
            #     str_dict[s[i]] = 1
            # else:
            #     str_dict[s[i]] += 1
        
        for i in range(length_p, length_s):
            if str_dict == sub_dict:
                answer.append(i - length_p)
            str_dict[s[i]] = 1 if s[i] not in str_dict else str_dict[s[i]] + 1
            # if s[i] in str_dict:
            #     str_dict[s[i]] += 1
            # else:
            #     str_dict[s[i]] = 1
            str_dict[s[i - length_p]] -= 1
            if str_dict[s[i - length_p]] == 0:
                del str_dict[s[i - length_p]]
                
        if str_dict == sub_dict:
            answer.append(length_s - length_p)
        return answer
    # 
    def findAnagrams2(self, s: str, p: str) -> List[int]:
    	if len(s) < len(p):
    		return []
    	Num = []
    	n = len(p)
    	A = [0] * 26
    	for i in range(n):
    		A[ord(p[i]) - ord('a')] += 1
    		A[ord(s[i]) - ord('a')] -= 1
    	if A == [0] * 26:
    		Num.append(0)
    	for i in range(n, len(s)):
    		A[ord(s[i]) - ord('a')] -= 1
    		A[ord(s[i - n]) - ord('a')] += 1
    		if A == [0] * 26:
    			Num.append(i + 1 - n)
    	return Num


if __name__ == '__main__':
    obj = Solution()
    string = "abab"
    sub = "ab"
    print(obj.findAnagrams(string, sub))