class Solution:
    # 时间超过98%的提交者
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        length = len(s)
        i = 0
        j = length - 1
        for i in range(length//2):
            s[i], s[j-i] = s[j-i], s[i]