//package cn.edu.csust.leetcode.algorithm.BinaryTree;
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode() {}
//    TreeNode(int val) { this.val = val; }
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//class Solution{
//    public int findTilt(TreeNode root) {
//        int sum = 0;
//        getNodeValue(root);
//        return getTilt(root);
//    }
//    public int getNodeValue(TreeNode node){
//        if(node == null){
//            return 0;
//        }
//        node.val += getNodeValue(node.left) + getNodeValue(node.right);
//        return node.val;
//    }
//    public int getTilt(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        if(root.left == null && root.right == null)
//            return 0;
//        else if(root.left == null){
//            return Math.abs(root.right.val) + getTilt(root.right);
//        }
//        else if(root.right == null){
//            return Math.abs(root.left.val) + getTilt(root.left);
//        }
//        return  Math.abs(root.left.val - root.right.val) + getTilt(root.left) + getTilt(root.right);
//    }
//}
//public class BinaryTreeTilt {
//    public static void main(String[] args) {
////        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
//        TreeNode root = new TreeNode(-8, new TreeNode(3, new TreeNode(-8, null, new TreeNode(-1, null, new TreeNode(8))), new TreeNode(0)), new TreeNode(0));
//        System.out.println(new Solution().findTilt(root));
//    }
//}
