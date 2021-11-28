//package cn.edu.csust.leetcode.BinaryTree;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
///*
//// Definition for a Node.*/
//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};
//
//
//class Solution {
//    public int maxDepth(Node root) {
//        if(root == null){
//            return 0;
//        }
//        int max = 0;
//        for (int i = 0; root.children != null && i < root.children.size(); i++) {
//            max = Math.max(maxDepth(root.children.get(i)), max);
//        }
//        return max + 1;
//    }
//}
//public class MaxmumDepthOfNAryTree {
//    public static void main(String[] args) {
//        List<Node> list = new ArrayList<>();
//        List<Node> sub = new ArrayList<>();
//        Collections.addAll(sub, new Node(5), new Node(6));
//        Collections.addAll(list, new Node(3, sub), new Node(2), new Node(4));
//        Node root = new Node(1, list);
//        Solution solution = new Solution();
//        System.out.println(solution.maxDepth(root));
//    }
//}
