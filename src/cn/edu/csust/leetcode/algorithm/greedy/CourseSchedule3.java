package cn.edu.csust.leetcode.algorithm.greedy;

import java.util.Arrays;
import java.util.PriorityQueue;

//贪心算法
// backpack[i-1][j] + backpack[i][j-1]
class  Solution{
    public int scheduleCourse(int [][] courses){
//        将课程排序：按照截止日期升序再按学习时间升序，尽可能把快要截止的课程先学了，在此基础上哪个学得快学哪个
        Arrays.sort(courses,(o1, o2)->o1[1] == o2[1]?o1[0] - o2[0]:o1[1] - o2[1]);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2)->o2-o1);
//        已经学习了多少天了
        int lastDeadline = 0;
//        已经学了多少门课了
        int count = 0;

//
        for (int i = 0; i < courses.length; i++) {
//            如果需要学习的时间超过了截止日期
            if(courses[i][0] > courses[i][1]) {
                continue;
            }
//
            if(courses[i][0] + lastDeadline <= courses[i][1]){
                count++;
                lastDeadline = courses[i][0] + lastDeadline;
                priorityQueue.add(courses[i][0]);
            }
            else{
                if(!priorityQueue.isEmpty()){
                    //如果优先队列不为空,说明我们之前学习了一些课,那么这门课的学习与否还有操作的余地
                    int temp = lastDeadline - priorityQueue.peek() + courses[i][0];
                    //通过peek()得到之前学习课程中最大的花费代价,将那门课换成当前的课
                    if(temp <= courses[i][1]){//能够学习,要么就是1换1,要么就是不学
//                        虽然课程数量count没有变,但是我们可以选择最有方案让累计天数尽可能小
                        if(lastDeadline > temp){ //1换1的方案
                            lastDeadline = temp;
                            priorityQueue.poll();
                            priorityQueue.add(courses[i][0]);
                        }
                    }
                }
            }

        }
        return count;
    }
}
public class CourseSchedule3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [][] courses =  new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
        System.out.println(solution.scheduleCourse(courses));
    }
}
