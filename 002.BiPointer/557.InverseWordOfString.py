class Solution:
    # 最简单
    def reverseWords1(self, s: str) -> str:
        return " ".join([string[::-1] for string in s.split(' ')])
    # 空间打败99.6%的提交人
    def reverseWords(self, s: str) -> str:
        i = 0
        j = 0
        t = 0
        s_list = s.split(' ')
        for  index, i in enumerate(s_list):
            m = list(i)
            t = len(i) - 1
            j = 0
            while j < t:
                m[j], m[t] = m[t], m[j]
                j = j + 1
                t = t - 1
            s_list[index] = ''.join(m)
        return ' '.join(s_list)
if __name__ == '__main__':
    print(Solution().reverseWords("Let's take LeetCode contest"))