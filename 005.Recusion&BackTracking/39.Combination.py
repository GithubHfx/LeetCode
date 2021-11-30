from typing import List
"""
39. 组合总和

给定一个无重复元素的正整数数组 candidates 和一个正整数 target ，找出 candidates 中所有可以使数字和为目标数 target 的唯一组合。
candidates 中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。 
对于给定的输入，保证和为 target 的唯一组合数少于 150 个。

 

示例 1：

输入: candidates = [2,3,6,7], target = 7
输出: [[7],[2,2,3]]
示例 2：

输入: candidates = [2,3,5], target = 8
输出: [[2,2,2,2],[2,3,3],[3,5]]
示例 3：

输入: candidates = [2], target = 1
输出: []
示例 4：

输入: candidates = [1], target = 1
输出: [[1]]
示例 5：

输入: candidates = [1], target = 2
输出: [[1,1]]
 

提示：

1 <= candidates.length <= 30
1 <= candidates[i] <= 200
candidate 中的每个元素都是独一无二的。
1 <= target <= 500


"""
class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        def helper(aim):
            ans = []
            
            for candidate in candidates:
                times = aim // candidate + 1
                index = candidates.index(candidate)
                candidates.remove(candidate)
                for t in range(1, times):
                    if candidate * t == aim:
                        ans.append([candidate] * t)
                    else:
                        
                        for item in helper(aim - candidate * t):
                            if candidate < item[0]:
                                temp = [candidate]  * t + item
                                ans.append(temp)
                candidates.insert(index, candidate)
            return ans
        
        
        candidates = sorted(candidates)
        return helper(target)
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        n = len(candidates)
        res = []
        def backtrack(i, tmp_sum, tmp):
            if  tmp_sum > target or i == n:
                return 
            if tmp_sum == target:
                res.append(tmp)
                return 
            for j in range(i, n):
                if tmp_sum + candidates[j] > target:
                    break
                backtrack(j,tmp_sum + candidates[j],tmp+[candidates[j]])
        backtrack(0, 0, [])
        return res
if __name__ == '__main__':
    obj = Solution()
    
    candidate = [2, 3, 6, 7]
    target = 8
    print(obj.combinationSum(candidate, target))