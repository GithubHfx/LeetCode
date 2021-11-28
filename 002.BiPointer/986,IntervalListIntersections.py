"""
给定两个由一些 闭区间 组成的列表，firstList 和 secondList ，其中 firstList[i] = [starti, endi] 而 secondList[j] = [startj, endj] 。每个区间列表都是成对 不相交 的，并且 已经排序 。

返回这 两个区间列表的交集 。

形式上，闭区间 [a, b]（其中 a <= b）表示实数 x 的集合，而 a <= x <= b 。

两个闭区间的 交集 是一组实数，要么为空集，要么为闭区间。例如，[1, 3] 和 [2, 4] 的交集为 [2, 3] 。
"""
from typing import List
class Solution:
    # 48ms有点小慢
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        answer = []
        i = 0
        length_first = len(firstList)
        j = 0
        length_second = len(secondList)
        while i < length_first and j < length_second:
            # 如果条件成立，则添加集合answer
            if firstList[i][0] <= secondList[j][1] and secondList[j][0] <= firstList[i][1]:
                # 
                answer.append([max(firstList[i][0], secondList[j][0]), min(firstList[i][1], secondList[j][1])])
            if firstList[i][1] < secondList[j][1]:
                i += 1
            elif firstList[i][1] > secondList[j][1]:
                j += 1
            else:
                i += 1
                j += 1
    
        return answer
    def intervalIntersection(self, A: List[int], B: List[int]) -> List[List[int]]:
        """
        :type A: List[List[int]]
        :type B: List[List[int]]
        :rtype: List[List[int]]
        """
        res=[]
        n,m=len(A),len(B)
        i,j=0,0
        while i<n and j<m:
            left=max(A[i][0],B[j][0])
            right=min(A[i][1],B[j][1])
            #判断是否有交集的条件
            if left<=right:
                res.append([left,right])
            #哪个右区间元素较小，指针就向前移动一位
            if A[i][1]<B[j][1]:
                i+=1
            else:
                j+=1   
        return res
    
    # 多使用四元表达式会提高效率
    def intervalIntersection(self, A: List[List[int]], B: List[List[int]]) -> List[List[int]]:
        """
        :type A: List[List[int]]
        :type B: List[List[int]]
        :rtype: List[List[int]]
        """
        res=[]
        n,m=len(A),len(B)
        i,j=0,0
        while i<n and j<m:
            left=A[i][0] if A[i][0] > B[j][0] else B[j][0]
            right=A[i][1] if A[i][1] < B[j][1] else B[j][1]
            #判断是否有交集的条件
            if left<=right:
                res.append([left,right])
            #哪个右区间元素较小，指针就向前移动一位
            i, j = (i + 1, j) if A[i][1] < B[j][1] else (i, j + 1)
        return res

if __name__ == '__main__':
    print(Solution().intervalIntersection([[0,2],[5,10],[13,23],[24,25]], [[1,5],[8,12],[15,24],[25,26]]))
    print(Solution().intervalIntersection(firstList = [[1,3],[5,9]], secondList = []))