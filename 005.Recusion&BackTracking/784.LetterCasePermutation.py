from typing import List
"""
给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
示例：
输入：S = "a1b2"
输出：["a1b2", "a1B2", "A1b2", "A1B2"]

输入：S = "3z4"
输出：["3z4", "3Z4"]

输入：S = "12345"
输出：["12345"]
"""
class Solution:
    # 空间击败87%,时间很慢
    def letterCasePermutation1(self, s: str) -> List[str]:
        str_list = list(s.lower())
        lower_index = [i for i, letter in enumerate(str_list) if letter.islower()]
        length = len(lower_index)
        
        ret = []
        for i in range(length+1):
            res = self.combine(length, i)
            
            for index_list in res:
                answer_tmp = str_list.copy()
                for index in index_list:
                    answer_tmp[lower_index[index]] = answer_tmp[lower_index[index]].upper()
                
                ret.append(''.join(answer_tmp))
        return ret
        
    def combine(self, n, k):
        if k>n or k==0:
            return [[]]
        if k == 1:
            return [[i] for i in range(n)]
        if k == n:
            return [[i for i in range(n)]]
        answer = self.combine(n - 1, k)
        for item in self.combine(n - 1, k - 1):
            item.append(n - 1)
            answer.append(item)
        return answer
    
    # BitMap法，更慢，比我的方法增加了0.1MB空间
    def letterCasePermutation2(self, s: str)->List[str]:
        l = len(s)
        n = 2 ** l
        res = set()
        for i in range(n):
            tmp = ""
            for j in range(l):
                if not s[j].isalpha():
                    tmp += s[j]
                elif (2 ** j) & i == 0:
                    tmp += s[j].lower()
                else:
                    tmp += s[j].upper()
            res.add(tmp)
        return list(res)
    # 深度优先广度优先， 时间击败99.24%的用户，空间69%
    def letterCasePermutation(self, s: str)->List[str]:
        res = list(set([s[0].upper(), s[0].lower()]))
        for i in range(1, len(s)):
            if s[i].isalpha():
                tmp = res.copy()
                res = [s_tmp + s[i].upper() for s_tmp in res]
                res.extend([s_tmp + s[i].lower() for s_tmp in tmp])
            else:
                res = [s_tmp + s[i] for s_tmp in res]
        return res


if __name__ == '__main__':
    print(Solution().letterCasePermutation('mQe'))
    print(Solution().letterCasePermutation('a1b1'))