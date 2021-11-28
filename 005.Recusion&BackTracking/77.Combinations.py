class Solution:
    # 超级慢，超级费空间，能通过
    def combine1(self, n: int, k: int):
        # 从n个数中选择k个数
        # 从n 个数中选1个数
        ret = [[i] for i in range(1, n + 2 - k)]
        
        # 从剩下的n - 1个数选择k - 1次
        while len(ret[0]) < k:
            new_ret = []
            for lis in ret:
                last = lis[-1]
                for j in range(last + 1, n + 1):
                    lis.append(j)
                    new_ret.append(lis.copy())
                    lis.pop()
            ret = new_ret
            
        return ret
        
    # 
    
    def combine(self, n, k):
        if k>n or k==0:
            return []
        if k==1:
            return [[i] for i in range(1,n+1)]
        if k==n:
            return [[i for i in range(1,n+1)]]
        
        answer=self.combine(n-1,k)
        for item in self.combine(n-1,k-1):
            item.append(n)
            answer.append(item)
        
        return answer


if  __name__ == '__main__':
    print(Solution().combine(20, 2))