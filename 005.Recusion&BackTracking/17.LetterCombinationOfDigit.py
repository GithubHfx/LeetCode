"""
给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。

给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
0 <= digits.length <= 4
digits[i] 是范围 ['2', '9'] 的一个数字。
"""
from typing import List
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        map_dict = {'2': "abc", '3': "def", '4': "ghi", '5': "jkl", '6': "mno", '7': "pqrs", '8': "tuv", '9': "wxyz"}
        answer = []
        # def helper():
        #     if 
        for digit in digits:
            if answer == []:
                answer = list(map_dict[digit])
            else:
                tmp = []
                for s in map_dict[digit]:
                    tmp += (s + " ").join(answer+["#"]).split(" ")[:-1]
                answer = tmp
        return answer
    def letterCombinations1(self, digits):
        """
        动态规划看起来动态规划时间比较快，也比较稳定
        
        dp[i]: 前i个字母的所有组合
        由于dp[i]只与dp[i-1]有关,可以使用变量代替列表存储降低空间复杂度
        :type digits: str
        :rtype: List[str]
        """
        if not digits:
            return []
        d = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
             '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
        n = len(digits)
        dp = [[], []]
        dp[0] = [x for x in d[digits[0]]]
        for i in range(1, n):
            dp[1] = [x + y for x in dp[0] for y in d[digits[i]]]
            dp[0] = dp[1]
        return dp[0]

    def letterCombinations2(self, digits):
        """
        使用变量代替上面的列表
        降低空间复杂度
        :type digits: str
        :rtype: List[str]
        """
        if not digits:
            return []
        d = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
             '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
        n = len(digits)
        res = ['']
        for i in range(n):
            res = [x + y for x in res for y in d[digits[i]]]
        return res

    def letterCombinations3(self, digits):
        """
        递归
        :param digits:
        :return:
        """
        d = {'2': 'abc', '3': 'def', '4': 'ghi', '5': 'jkl',
             '6': 'mno', '7': 'pqrs', '8': 'tuv', '9': 'wxyz'}
        if not digits:
            return []
        if len(digits) == 1:
            return [x for x in d[digits[0]]]
        return [x + y for x in d[digits[0]] for y in self.letterCombinations3(digits[1:])]    

if __name__ == '__main__':
    obj = Solution()
    
    digits1 = "23"
    answer1 = ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    
    digits2 = "2"
    answer2 = ["a", "b", "c"]
    
    digits3 = ""
    answer3 = []
    ret = obj.letterCombinations(digits3)
    print(ret)
    print(ret == answer3)