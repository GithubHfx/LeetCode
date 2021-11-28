"""
给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，
判断二者是否相等，并返回结果。 # 代表退格字符。

注意：如果对空文本输入退格字符，文本继续为空。
提示：

1 <= S.length <= 200
1 <= T.length <= 200
S 和 T 只含有小写字母以及字符 '#'。

执行结果：通过
执行用时：32 ms, 在所有 Python3 提交中击败了79.25%的用户
内存消耗：14.9 MB, 在所有 Python3 提交中击败了77.98%的用户

"""
class Solution:
    def backspaceCompare(self, n: str, t: str)->bool:
        i = 0
        list_n = []
        len_n = len(n)
        list_t = []
        len_t = len(t)
        while i < len_n and i < len_t:
            if n[i] == '#' and list_n != []:
                list_n.pop()
            elif n[i] != '#':
                list_n.append(n[i])
            if t[i] == '#' and list_t != []:
                list_t.pop()
            elif t[i] != '#':
                list_t.append(t[i])
            i += 1
        while i < len_n:
            if n[i] == '#' and list_n != []:
                list_n.pop()
            elif n[i] != '#':
                list_n.append(n[i])
                
            i += 1
        while i < len_t:
            if t[i] == '#' and list_t != []:
                list_t.pop()
            elif t[i] != '#':
                list_t.append(t[i])
            i+= 1
        return list_n == list_t
 
if __name__ == '__main__':
    print(Solution().backspaceCompare("a#c", "b"))