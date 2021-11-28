//package cn.edu.csust.leetcode.Array;
//
//import java.util.PriorityQueue;
//
//// 构建堆
//// 调整小根堆
//// 出堆入堆
//// 深度优先
//class Node {
//    int height;
//    int row;
//    int col;
////    全参构造
//    public Node(int height, int row, int col){
//        this.height = height;
//        this.row = row;
//        this.col = col;
//    }
////    无参构造
//    public Node(){
//
//    }
//}
//class Solution{
//    /**
//     * 根据当前的围墙构造，返回当前的围墙可盛水数量，一个立方的水为一个单位
//     * 先把最外围的一圈作为围栏， 选择一个最低的围栏，
//     * 如果这个围栏的邻节点都比它大， 此围栏可删除，
//     * 邻节点作为新的围栏； 如果邻节点比它小，
//     * 那么邻节点可储蓄的水为 二者高度之差，
//     * 此时在邻节点设置围栏，高度为当前围栏高度即可。
//     * @param heightMap 围墙高度图
//     * @return 返回最大可盛水量
//     */
//    public int trapRainWater(int[][] heightMap) {
//        int m = heightMap.length;
//        int n = heightMap[0].length;
//        boolean [][] visited = new boolean[m][n];
//        int sum = 0, maxH = 0;
//        if(m <= 2 || n <= 2)
//            return 0;
////        初始化堆
//        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o1.height - o2.height);
////        Node [] heap = new Node[m * n];
//        int countEnd = 0;
////        遍历矩阵周围， 入堆，调整堆得到最小的围墙高度
//        for(int i = 0; i < m;i++){
//            queue.add(new Node(heightMap[i][0], i, 0));
//            queue.add(new Node(heightMap[i][n - 1], i, n - 1));
//            visited[i][0] = true;
//            visited[i][n - 1] = true;
//        }
//        for(int i = 1; i < n - 1;i++){
//            queue.add(new Node(heightMap[0][i], 0, i));
//            queue.add(new Node(heightMap[m - 1][i], m - 1, i));
//            visited[0][i] = true;
//            visited[m - 1][i] = true;
//        }
//        while(!queue.isEmpty()){
////                    出堆
//            Node node = queue.poll();
//            int [][] direction = new int[][]{
//                    {node.row + 1, node.col},
//                    {node.row - 1, node.col},
//                    {node.row, node.col + 1},
//                    {node.row, node.col - 1}};
//            maxH = Math.max(maxH, node.height);
//            sum += maxH - node.height;
//            for (int i = 0; i < 4; i++) {
//                int nrow = direction[i][0];
//                int ncol = direction[i][1];
////                    边界判断
//                if(nrow < 0 || nrow >= m || ncol < 0 || ncol >= n || visited[nrow][ncol]){
//                    continue;
//                }
//                //                    标记访问
//                visited[nrow][ncol] = true;
////                    新的围墙入堆
//                queue.add(new Node(heightMap[nrow][ncol], nrow, ncol));
//
//            }
////            调整堆
////            minHeapDown(heap, countStart - 1, countEnd - 1);
//        }
//        return sum;
//    }
//
//    /**
//     * 根据当前的围墙构造，返回当前的围墙可盛水数量，一个立方的水为一个单位
//     * 先把最外围的一圈作为围栏， 选择一个最低的围栏，
//     * 如果这个围栏的邻节点都比它大， 此围栏可删除，
//     * 邻节点作为新的围栏； 如果邻节点比它小，
//     * 那么邻节点可储蓄的水为 二者高度之差，
//     * 此时在邻节点设置围栏，高度为当前围栏高度即可。
//     * @param heightMap 围墙高度图
//     * @return 返回最大可盛水量
//     */
//    public int trapRainWater2(int[][] heightMap) {
//        int m = heightMap.length;
//        int n = heightMap[0].length;
//        boolean [][] visited = new boolean[m][n];
//        int sum = 0, maxH = 0;
//        if(m <= 2 || n <= 2)
//            return 0;
////        初始化堆
//        PriorityQueue<Node> queue = new PriorityQueue<>((o1, o2) -> o1.height - o2.height);
////        Node [] heap = new Node[m * n];
//        int countEnd = 0;
////        遍历矩阵周围， 入堆，调整堆得到最小的围墙高度
//        for(int i = 0; i < m;i++){
//            queue.add(new Node(heightMap[i][0], i, 0));
//            queue.add(new Node(heightMap[i][n - 1], i, n - 1));
//            visited[i][0] = true;
//            visited[i][n - 1] = true;
//        }
//        for(int i = 1; i < n - 1;i++){
//            queue.add(new Node(heightMap[0][i], 0, i));
//            queue.add(new Node(heightMap[m - 1][i], m - 1, i));
//            visited[0][i] = true;
//            visited[m - 1][i] = true;
//        }
//        while(!queue.isEmpty()){
////                    出堆
//            Node node = queue.poll();
//            int [][] direction = new int[][]{
//                    {node.row + 1, node.col},
//                    {node.row - 1, node.col},
//                    {node.row, node.col + 1},
//                    {node.row, node.col - 1}};
//            for (int i = 0; i < 4; i++) {
//                int nrow = direction[i][0];
//                int ncol = direction[i][1];
////                    边界判断
//                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && !visited[nrow][ncol]){
//                    //                    标记访问
//                    visited[nrow][ncol] = true;
//                    //                    新的围墙入堆
//                    queue.add(new Node(heightMap[nrow][ncol], nrow, ncol));
//                    if(node.height > heightMap[nrow][ncol]){
//                        sum += node.height - heightMap[nrow][ncol];
//                        heightMap[nrow][ncol] = node.height;
//                    }
//                }
//
//
//            }
////            调整堆
////            minHeapDown(heap, countStart - 1, countEnd - 1);
//        }
//        return sum;
//    }
//}
//public class TrappingRainWater3 {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.trapRainWater(new int[][]{
//                {3,3,3,3,3},
//                {3,2,2,2,3},
//                {3,2,1,2,3},
//                {3,2,2,2,3},
//                {3,3,3,3,3}
//        }));
//        System.out.println(solution.trapRainWater(new int[][]{
//                {1,4,3,1,3,2},
//                {3,2,1,3,2,4},
//                {2,3,3,2,3,1}}));
//        System.out.println(solution.trapRainWater(new int[][]{
//                {78, 16, 94, 36},
//                {87,93,50,22},{63,28,91,60},{64,27,41,27},{73,37,12,69},{68,30,83,31},{63,24,68,36}
//
//        }));
//    }
//}
