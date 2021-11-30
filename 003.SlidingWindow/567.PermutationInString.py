import collections
"""
长串中是否存在子串是模式串的一个排列
"""
class Solution:
    # 时间非常慢，空间占用也很多
    def checkInclusion1(self, s1: str, s2: str) -> bool:
        return any([collections.Counter(s1) == collections.Counter(s2[i: i + len(s1)]) for i in range(0, len(s2) - len(s1) + 1)])
        
    # 手动滑动窗口
    
    def checkInclusion(self, s1: str, s2: str) -> bool:
        """
            首先如果s1长度大于s2那么直接false
            再通过滑动窗口统计在一个字符串长度范围内是否存在字符和频率均相等的情况
        
        """
        
        length1 = len(s1)
        length2 = len(s2)
        doc_dic_s1, doc_dic_s2 = {}, {}
        start = 0
        if length1 > length2:
            return False
        for j in range(length1):
            if s1[j] in doc_dic_s1:
                doc_dic_s1[s1[j]] += 1
            else:
                doc_dic_s1[s1[j]] = 1
            if s2[j] in doc_dic_s2:
                doc_dic_s2[s2[j]] += 1
            else:
                doc_dic_s2[s2[j]] = 1
        for i in range(length1, length2):
            if doc_dic_s1 == doc_dic_s2:
                return True
            else:
                doc_dic_s2[s2[i - length1]] -= 1
                if not doc_dic_s2[s2[i - length1]]:
                   del doc_dic_s2[s2[i - length1]]
                if s2[i] in doc_dic_s2:
                    doc_dic_s2[s2[i]] += 1
                else:
                    doc_dic_s2[s2[i]] = 1
        return doc_dic_s1 == doc_dic_s2:
    
if __name__ == "__main__":
    print(Solution().checkInclusion("ab", "eidbaoooo"))