//package cn.edu.csust.leetcode;
//
//import java.util.HashSet;
//import java.util.Set;
//
//class Solution{
//    /**
//     *  如果是完美矩形 那么一定满足两点：
//     *  （1）最左下 最左上 最右下 最右上 的四个点只出现一次 其他点成对出现
//     *  （2）四个点围城的矩形面积 = 小矩形的面积之和
//     * @param rectangles 给定的矩形
//     * @return 返回能否形成完美矩形的结果
//     */
//    public boolean isRectangleCover(int [][] rectangles){
//
//
//        int left = 1000000;
//        int bottom = 1000000;
//        int right = 0;
//        int top = 0;
//
//        String lb = null;
//        String lt = null;
//        String rb = null;
//        String rt = null;
//
//        int areaSum = 0;
//        Set<String> set = new HashSet<>();
//
//        for (int i = 0; i < rectangles.length; i++) {
//            left = Math.min(left, rectangles[i][0]);
//            bottom = Math.min(bottom, rectangles[i][1]);
//            right = Math.max(right, rectangles[i][2]);
//            top = Math.max(top, rectangles[i][3]);
//
//            lb = (rectangles[i][0] + " " + rectangles[i][1]);
//            lt = (rectangles[i][0] + " " + rectangles[i][3]);
//            rb = (rectangles[i][2] + " " + rectangles[i][1]);
//            rt = (rectangles[i][2] + " " + rectangles[i][3]);
//
//            if(set.contains(lb)) set.remove(lb);
//            else   set.add(lb);
//            if(set.contains(lt)) set.remove(lt);
//            else set.add(lt);
//            if(set.contains(rb)) set.remove(rb);
//            else set.add(rb);
//            if(set.contains(rt)) set.remove(rt);
//            else set.add(rt);
//
//            areaSum += (rectangles[i][2] - rectangles[i][0]) * (rectangles[i][3] - rectangles[i][1]);
//        }
//
//        lb = left + " " + bottom;
//        lt = left + " " + top;
//        rb = right + " " + bottom;
//        rt = right + " " + top;
//// 这一步判断是否完美镶嵌
//        boolean isCover = set.size() == 4 && set.contains(lb) && set.contains(lt) && set.contains(rb) && set.contains(rt);
////        这一步判断面积是否重叠，如果重叠新生成面积必定大于原来面积，如果有空缺那么新生成面积小于原来面积
//        isCover = isCover && (right - left) * (top - bottom) == areaSum;
//
//        return isCover;
//    }
//}
//public class PerfectRectangle {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
////        int [][] rectangles = {{1,1,3,3},{3,1,4,2},{1,3,2,4},{3,2,4,4}};
//        int [][] rectangles = {{1,1,3,3},{3,1,4,2},{1,3,2,4},{2,2,4,4}};
//        System.out.println(solution.isRectangleCover(rectangles));
//    }
//}
