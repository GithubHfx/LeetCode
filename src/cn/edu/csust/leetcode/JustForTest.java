package cn.edu.csust.leetcode;
class Solution{
//    public boolean canJump(int[] nums){
//        int step = 1;
//        if(nums.length == 0)
//            return true;
//        for (int i = nums.length - 2; i >= 0 ; i--) {
//            if(nums[i] >= step){
//                step = 1;
//            }
//            else{
//                step++;
//            }
//
//        }
//        return step <= 1 && nums[0] >= 1;
//    }
    public int jump(int[] nums){
        int nextDist = nums[0];
        int currentDist = nums[0];
        int step = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(i == currentDist){
                currentDist = nextDist;
                step++;
            }
            nextDist = Math.max(nextDist, nums[i] + i);
        }
        return step;
    }
}
public class JustForTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.jump(new int[]{3, 2, 1, 0, 4}));
    }
}