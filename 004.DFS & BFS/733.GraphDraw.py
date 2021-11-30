"""
有一幅以二维整数数组表示的图画，
每一个整数表示该图画的像素值大小，
数值在 0 到 65535 之间。
给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，
让你重新上色这幅图像。
为了完成上色工作，
从初始坐标开始，
记录初始坐标的上下左右四个方向上像素值与初始坐标相同的相连像素点，
接着再记录这四个方向上符合条件的像素点与他们对应四个方向上像素值
与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为新的颜色值。
最后返回经过上色渲染后的图像。

"""
# 广度优先较优
class Solution:
    def floodFill1(self, image, sr, sc, newColor):
        queue = [(sr, sc)]
        visited = {}
        old_color = image[sr][sc]
        while queue != []:
            # 取出队列中的第一个像素坐标
            pix = queue[0]
            r, c = pix
           
           # 将像素坐标从队列中移除
            queue.remove(pix)
            
            # 上色
            image[r][c] = newColor
            
            # 查看周围联通的像素点
            if r + 1 < len(image) and (r + 1, c) not in visited and image[r+1][c]  == old_color:
                visited[(r + 1, c)] = True
                queue.append((r + 1, c))
            if r - 1 >= 0 and (r - 1, c) not in visited  and image[r-1][c]  == old_color:
                visited[(r + 1, c)] = True
                queue.append((r - 1, c))
            if c + 1 < len(image[r]) and (r, c + 1) not in visited and image[r][c + 1]  == old_color:
                visited[(r, c + 1)] = True
                queue.append((r, c + 1))
            if c - 1 >= 0 and (r, c - 1) not in visited and image[r][c-1]  == old_color:
                visited[(r, c - 1)] = True
                queue.append((r, c - 1))
        return image
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        
        
        
        or_color = image[sr][sc]
        if or_color == newColor:
            return image
        
        image[sr][sc] = newColor
        if sr + 1 < len(image) and image[sr + 1][sc] == or_color:
            self.floodFill(image, sr + 1, sc, newColor)
        if sr - 1 >= 0 and image[sr - 1][sc] == or_color:
            self.floodFill(image, sr - 1, sc, newColor)
        if sc + 1 < len(image[sr]) and image[sr][sc + 1] == or_color:
            self.floodFill(image, sr, sc + 1, newColor)
        if sc - 1 >= 0 and image[sr][sc-1] == or_color:
            self.floodFill(image, sr, sc - 1, newColor)
       
        return image
        
        
# list.remove(x)方法：移除的是一个对象，不是下表
if __name__ == '__main__':
    print(Solution().floodFill([[1,1,1],[1,1,0],[1,0,1]], 1, 1, 2))
