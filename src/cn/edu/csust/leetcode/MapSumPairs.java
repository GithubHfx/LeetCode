//package cn.edu.csust.leetcode;
///**
// * Your MapSum object will be instantiated and called as such:
// * MapSum obj = new MapSum();
// * obj.insert(key,val);
// * int param_2 = obj.sum(prefix);
// * 时间效率很低
//*/
////class MapSum1 {
////    Map<String, Integer> map = new HashMap<>();
////    public MapSum() {
////
////    }
////
////    public void insert(String key, int val) {
////        map.put(key, val);
////    }
////
////    public int sum(String prefix) {
////        Set<String> keySet = map.keySet();
////        int total = 0;
////        for (String key: keySet) {
////            if(key.startsWith(prefix)){
////                total += map.get(key);
////            }
////        }
////        return total;
////    }
////}
////
////// 广度优先前缀树
////class MapSum2{
////    int ret;
////    TrieNode root;
////    class TrieNode{
////        int val = 0;
////        TrieNode[] next = new TrieNode[26];
////    }
////    public MapSum(){
////        ret = 0;
////        root = new TrieNode();
////    }
////
////    public void insert(String key, Integer val){
////        TrieNode cur = root;
////        for (int i = 0; i < key.length(); i++) {
////            int k = key.charAt(i) - 'a';
////            if(cur.next[k] == null){
////                cur.next[k] = new TrieNode();
////            }
////            cur = cur.next[k];
////        }
////        cur.val = val;
////    }
////
////    public int sum(String prefix) {
////        TrieNode cur = root;
////        ret = 0;
////        for(int i =0 ;i < prefix.length();i++){
////            int u = prefix.charAt(i) - 'a';
////            if(cur.next[u] == null){
////                return 0;
////            }
////            cur = cur.next[u];
////        }
////        Queue<TrieNode> q = new LinkedList<>();
////        q.add(cur);
////        while(!q.isEmpty()) {
////            TrieNode node = q.poll();
////            ret += node.val;
////            for(int i = 0; i < 26; i++) {
////                if(node.next[i]!=null) q.add(node.next[i]);
////            }
////        }
////        return ret;
////    }
////}
////深度优先
//class MapSum{
//    int ret;
//    TrieNode root;
//    class TrieNode{
//        int val = 0;
//        TrieNode[] next = new TrieNode[26];
//    }
//    public MapSum(){
//        ret = 0;
//        root = new TrieNode();
//    }
//
//    public void insert(String key, Integer val){
//        TrieNode cur = root;
//        for (int i = 0; i < key.length(); i++) {
//            int k = key.charAt(i) - 'a';
//            if(cur.next[k] == null){
//                cur.next[k] = new TrieNode();
//            }
//            cur = cur.next[k];
//        }
//        cur.val = val;
//    }
//
//    public int sum(String prefix) {
//        TrieNode cur = root;
//        for(int i =0 ;i < prefix.length();i++){
//            int u = prefix.charAt(i) - 'a';
//            if(cur.next[u] == null){
//                return 0;
//            }
//            cur = cur.next[u];
//        }
//
//        return dfs(cur);
//    }
//    private int dfs(TrieNode node){
//        if(node == null)
//            return 0;
//        int sum = 0;
//        for(int i = 0; i < 26;++i){
//            sum += dfs(node.next[i]);
//        }
//        return node.val + sum;
//    }
//}
//public class MapSumPairs {
////    public static void main(String[] args) {
////        MapSum mapSum = new MapSum();
////        mapSum.insert("apple", 3);
////        System.out.println(mapSum.sum("ap"));
////        mapSum.insert("app", 2);
////        System.out.println(mapSum.sum("ap"));
////    }
//        public static void main(String[] args) {
//            MapSum mapSum = new MapSum();
//            mapSum.insert("a", 3);
//            System.out.println(mapSum.sum("ap"));
//            mapSum.insert("b", 2);
//            System.out.println(mapSum.sum("a"));
//            System.out.println(mapSum.root.next[0].val);
//        }
//}
