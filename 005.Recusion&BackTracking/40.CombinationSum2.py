"""
组合总和
给定一个数组candidates和一个目标数target找出可以使数和为target的组合
candidates中的每个数字只能使用一次
"""
from typing import List
class Solution:
    # 很慢
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates = sorted(candidates)
        counter = {}
        res = []
        for candidate in candidates:
            counter[candidate] = counter.get(candidate, 0) + 1
        def helper(tmp_sum, tmp_res):
            if tmp_sum  == target:
                res.append(tmp_res)
                return
            for k, v in list(counter.items()):
                if tmp_res != [] and  k < tmp_res[-1]:
                    continue 
                # print(k, v, counter.items())
                del counter[k]
                for j in range(1, v + 1):
                    print(f"num:{k}, times:{j}, temp sum:{tmp_sum + k * j}, tmp_res:{tmp_res + [k] * j}, counter:{counter}")
                    if tmp_sum + k * j > target:
                        break
                    helper(tmp_sum + k * j, tmp_res + [k] * j)
                counter[k] = v
        helper(0, [])
        return res
    def combinationSum22(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        path = []
        def backtrack(candidates,target,sum,startIndex):
            if sum == target: res.append(path[:])
            for i in range(startIndex,len(candidates)):  #要对同一树层使用过的元素进行跳过
                if sum + candidates[i] > target: return 
                if i > startIndex and candidates[i] == candidates[i-1]: continue  #直接用startIndex来去重,要对同一树层使用过的元素进行跳过
                sum += candidates[i]
                path.append(candidates[i])
                backtrack(candidates,target,sum,i+1)  #i+1:每个数字在每个组合中只能使用一次
                sum -= candidates[i]  #回溯
                path.pop()  #回溯
        candidates = sorted(candidates)  #首先把给candidates排序，让其相同的元素都挨在一起。
        backtrack(candidates,target,0,0)
        return res
        
        
if __name__ == '__main__':
    obj = Solution()
    candidates = [23,16,5,28,20,17,27,20,12,21,12,29,12,20,22,32,7,26,20,30,28,17,7,26,5,24,20,27,5,8,9,15,19,31,9,5,13,31,12,20,10,11,6,17,27,16,7,21,7,22,16,30,26,10,21,27,29,28,11,21]
    target = 27
    print(obj.combinationSum22(candidates, target))