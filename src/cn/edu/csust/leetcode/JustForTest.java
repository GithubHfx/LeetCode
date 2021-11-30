//package cn.edu.csust.leetcode;
//
//import java.util.*;
//class MapSum {
//
//    class TreeNode {
//        int val;
//        TreeNode[] subs = new TreeNode[26];
//    }
//    TreeNode root;
//    public MapSum() {
//        root = new TreeNode();
//    }
//
//    public void insert(String key, int val) {
//        TreeNode p = root;
//        for (int i = 0; i < key.length(); i++) {
//            int index = key.charAt(i) - 'a';
//            if(p.subs[index] == null){
//                p.subs[index] = new TreeNode();
//            }
//            p = p.subs[index];
//        }
//        p.val = val;
//    }
//
//    public int sum(String prefix) {
//        TreeNode p = root;
//        for (int i = 0; i < prefix.length(); i++) {
//            int index = prefix.charAt(i) - 'a';
//            if(p.subs[index] == null)
//                return 0;
//            p = p.subs[index];
//        }
//        return dfsCalculate(p);
//    }
//
//    private int dfsCalculate(TreeNode p) {
//        if(p == null)
//            return 0;
//        int ret = 0;
//        for (int i = 0; i < 26; i++) {
//            if(p.subs[i] != null){
//                ret += dfsCalculate(p.subs[i]);
//            }
//        }
//        ret += p.val;
//        return ret;
//    }
//}
//class Solution{
////    char [] pairs = {'(', ')'};
////    char [] rePairs = {')', '('};
//////    移除无效的括号
////    public List<String> removeInvalidPatheses(String words){
////        List<String> res = new ArrayList<>();
////        removeHandler(res, words, 0, 0, pairs);
////        return res;
////    }
////
////
////    private void removeHandler(List<String> res, String string, int lastI, int lastJ, char[] pa) {
////        int count = 0;
////        for (int i = lastI; i < string.length(); i++) {
////            if(string.charAt(i) == pa[0]){
////                count++;
////            }
////            else if(string.charAt(i) == pa[1]){
////                count--;
////            }
////            if(count < 0) {
////                for (int j = lastJ; j <= i; j++) {
////                    if (string.charAt(j) == pa[1] && (j == 0 || string.charAt(j - 1) != pa[1])) {
////                        String newStr = string.substring(0, j) + string.substring(j + 1);
////                        removeHandler(res, newStr, lastI, lastJ, pa);
////                    }
////                }
////                return;
////            }
////        }
////        StringBuilder stringBuilder = new StringBuilder(string);
////        stringBuilder.reverse();
////        string = stringBuilder.toString();
////        if(pa[0] == '('){
////            removeHandler(res, string, 0, 0,rePairs);
////        }
////        else{
////            res.add(string);
////        }
////    }
////
//////    重新排列得到2的幂
////    public boolean reorderedPowerOf2(int n){
////        int [ ] mapN = new int[10];
////        int countN = getNumberMap(n, mapN);
////        for (int i = 0; i < 30; i++) {
////            int t = (1 << i);
////            int [] mapT = new int[10];
////            int countT = getNumberMap(t, mapT);
////            if(countT == countN && Arrays.equals(mapN, mapT)){
////                return true;
////            }
////        }
////        return false;
////    }
////
////    private int getNumberMap(int n, int[] mapN) {
////        int count = 0;
////        while(n != 0){
////            mapN[n % 10]++;
////            n /= 10;
////            count++;
////        }
////        return count;
////    }
////
//////    只出现一次的数字
////    public int [] singleNumber(int [] nums){
////        int sum = 0;
////        for (int i = 0; i < nums.length; i++) {
////            sum ^= nums[i];
////        }
////        int len = 1;
////        while((sum & 1) == 0){
////            len <<= 1;
////            sum >>= 1;
////        }
////        int []res = new int[2];
////        for(int i = 0;i< nums.length;i++){
////            if((nums[i] & len) == 0){
////                res[0] ^= nums[i];
////            }
////            else{
////                res[1] ^= nums[i];
////            }
////        }
////        return res;
////    }
//////    键盘行
////    public String[] findWords(String[] words) {
////        List<String> res = new ArrayList<>();
////        int [] row = {2, 3, 3, 2, 1, 2, 2,2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
////        for (String word: words) {
////            boolean flag = true;
////            char ch = Character.toLowerCase(word.charAt(0));
////            int first = row[ch - 'a'];
////            int i = 1, j = word.length() - 1;
////            while(i <= j){
////                char left = Character.toLowerCase(word.charAt(i));
////                char right = Character.toLowerCase(word.charAt(j));
////                if(row[left - 'a'] != first || row[right - 'a'] != first){
////                    flag = false;
////                    break;
////                }
////                i++;
////                j--;
////            }
////            if(flag){
////                res.add(word);
////            }
////        }
////        String [] ret = new String[res.size()];
////        return res.toArray(ret);
////    }
////    // DistributeCandies
////    public int distributeCandies(int[] candyType) {
////        Set<Integer> set = new HashSet<>();
////        int len = candyType.length;
////        for (int i = 0; i < len && set.size() < len / 2;i++) {
////            set.add(candyType[i]);
////        }
////        return set.size();
////    }
////    class ListNode {
////        int val;
////        ListNode next;
////        ListNode(int x) { val = x; }
////    }
//////    删除链表中的节点
////    public void deleteNode(ListNode node){
////        node.val = node.next.val;
////        node.next = node.next.next;
////    }
////    class Node{
////        int x;
////        int y;
////        int h;
////        public Node(){}
////
////        public Node(int x, int y, int h){
////            this.x = x;
////            this.y = y;
////            this.h = h;
////        }
////    }
////    public int trapRainWater(int[][] heightMap) {
////        int m = heightMap.length, n = heightMap[0].length;
////        if(m < 3 || n < 3){
////            return 0;
////        }
////        PriorityQueue<Node> queue = new PriorityQueue<>(((o1, o2) -> o1.h - o2.h));
////        boolean [][] visited = new boolean[m][n];
////        for (int i = 0; i < n; i++) {
////            queue.add(new Node(0, i, heightMap[0][i]));
////            queue.add(new Node(m - 1, i, heightMap[m - 1][i]));
////            visited[0][i] = true;
////            visited[m-1][i] = true;
////        }
////
////        for (int i = 1; i < m - 1; i++) {
////            queue.add(new Node(i, 0, heightMap[i][0]));
////            queue.add(new Node(i, n - 1, heightMap[i][n - 1]));
////            visited[i][0] = true;
////            visited[i][n - 1] = true;
////        }
////        int ret = 0;
////        int max = Integer.MIN_VALUE;
////        while(!queue.isEmpty()){
////            Node node = queue.poll();
////            if(max < node.h){
////                max = node.h;
////            }
////            ret += max - node.h;
////            int [][] directions = new int[][]{{node.x + 1, node.y}, {node.x - 1, node.y}, {node.x, node.y + 1}, {node.x, node.y - 1}};
////
////            for (int i = 0; i < directions.length; i++) {
////                int dx = directions[i][0];
////                int dy = directions[i][1];
////                if(dx < 0 || dx >= m || dy < 0 || dy >= n || visited[dx][dy]){
////                    continue;
////                }
////                queue.add(new Node(dx, dy, heightMap[dx][dy]));
////                visited[dx][dy] = true;
////            }
////        }
////        return ret;
////    }
//////   有效的完全平方
////    public boolean isPerfectSquare(int n){
////        int low = 1;
////        int high = n;
////        while(low <= high){
////            int mid = ((high - low) >> 1) + low;
////            int t = n / mid;
////            if(t == mid){
////                return n % mid == 0;
////            }
////            else if(t < mid){
////                high = mid - 1;
////            }
////            else{
////                low = mid + 1;
////            }
////        }
////        return  false;
////    }
////    public int longestSubsequence(int[] arr, int difference) {
////        Map<Integer, Integer>map = new HashMap<>();
////        int max = 0;
////        for (int i = 0; i < arr.length; i++) {
////            Integer val = map.get(arr[i] - difference);
////            if(val != null){
////                val = val + 1;
////            }
////            else{
////                val = 1;
////            }
////            map.put(arr[i], val);
////            max = Math.max(max, val);
////        }
////        return max;
////    }
////
////    public int maxCount(int m, int n, int[][] ops) {
////        int minRow = m;
////        int minCol = n;
////        for (int i = 0; i < ops.length; i++) {
////            minRow = Math.min(ops[i][0], minRow);
////            minCol = Math.min(ops[i][1], minCol);
////        }
////        return minRow * minCol;
////    }
////
////    public String getHint(String secret, String guess) {
////        int len = secret.length();
////        int [] num = new int[len];
////        int countA = 0;
////        int countB = 0;
////        for (int i = 0; i < len; i++) {
////            int charSecret = secret.charAt(i) - '0';
////            int charGuess = guess.charAt(i) - '0';
////            if(charSecret == charGuess){
////                countA ++;
////            }
////            else{
////                if(num[charSecret]-- > 0)countB++;
////                if(num[charGuess]++ < 0) countB++;
////            }
////
////        }
////
////        return countA + "A" + countB + "B";
////    }
//////    定义最大值常量
////    private static final int MAX = 100;
//////    定义缓存哈希表，剪枝避免重复计算
////    private Map<String, Integer> cache = new HashMap<>();
////
//////    寻找最小的消除节点的步数
////    public int findMinStep(String board, String hand){
////        int ans = memorization(board, hand, (1 << hand.length()));
////        return ans == MAX?-1:ans;
////    }
////
////    private int memorization(String board, String hand, int cur) {
////        if(board.length() == 0){
////            return 0;
////        }
////        if(cache.containsKey(board)) return cache.get(board);
////        int ans = MAX;
////        for (int i = 0; i < hand.length(); i++) {
////            if(((cur >> i) & 1) == 1) continue;
////            int next = (1 << i) | cur;
////            for (int j = 0; j < board.length(); j++) {
////                if(j > 0 && j < board.length() - 1 && board.charAt(j) == board.charAt(j - 1)) continue;
////                if(j > 0 && j < board.length() - 1 && board.charAt(j) != hand.charAt(i)) continue;
////                StringBuilder stringBuilder = new StringBuilder();
////                stringBuilder.append(board.substring(0, j)).append(hand.charAt(i)).append(board.substring(j));
////                removeHandler(stringBuilder, j);
////                ans = Math.min(ans, memorization(stringBuilder.toString(), hand, next) + 1);
////            }
////        }
//////        别忘了这行代码
////        cache.put(board, ans);
////        return ans;
////    }
////
////    public void removeHandler(StringBuilder curBoard, int i){
////
////        while(i >= 0 && i < curBoard.length()){
////            char ch = curBoard.charAt(i);
////            int left = i;
////            int right = i;
////            while(left >= 0 && curBoard.charAt(left) == ch) left--;
////            while(right < curBoard.length() && curBoard.charAt(right) == ch) right++;
////            if(right - left > 3){
////                curBoard.delete(left + 1, right);
//////                下面几行代码还不熟悉
////                i = left >= 0?left:right; //No
////            }
////            else{
////                break;//No
////            }
////        }
////    }
////
////
////    public int findPoisonedDuration(int[] timeSeries, int duration) {
////        if(timeSeries.length == 1)
////            return duration;
////        int res = 0;
////        for (int i = 1; i < timeSeries.length; i++) {
////            res += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
////        }
////
////        return res + duration;
////    }
////
////    public int guessNumberHigherOrLower(int n){
////        int [][] dp = new int[n+1][n+1];
////        return cost(1, n, dp);
////    }
////
////    private int cost(int left, int right, int[][] dp) {
////        if(left >= right){
////            return 0;
////        }
////        if(dp[left][right] != 0){
////            return dp[left][right];
////        }
////        int ans = 1000;
////        for (int i = left;i<=right;i++){
////            ans = Math.min(ans, Math.max(cost(left, i - 1, dp), cost(i + 1, right, dp)) + i);
////        }
////        dp[left][right] = ans;
////        return ans;
////    }
////    public int maxmumProductOfWordLengths(String [] words){
////        int len = words.length;
////        int [] hash = new int[len];
////        int ret = 0;
////        for (int i = 0; i < len; i++) {
////            int num = 0;
////            for (int j = 0; j < words[i].length(); j++) {
////                num |= (1 << (words[i].charAt(j) - 'a'));
////            }
////            hash[i] = num;
////            if(i > 0){
////                for (int j = 0; j < i; j++) {
////                    if((hash[i] & hash[j]) == 0){
////                        ret = Math.max(ret, words[i].length() * words[j].length());
////                    }
////
////                }
////            }
////        }
////        return ret;
////    }
////    public boolean perfectRectangle(int [][] rectangles){
////        int left = 100000;
////        int bottom = 100000;
////        int right = 0;
////        int top = 0;
////        int sum = 0;
////        Set<String> set = new HashSet<>();
////        String lb = null;
////        String lt = null;
////        String rb = null;
////        String rt = null;
////        for(int i = 0;i<rectangles.length;i++){
////            left = Math.min(left, rectangles[i][0]);
////            right = Math.max(right, rectangles[i][2]);
////            bottom = Math.min(bottom, rectangles[i][1]);
////            top = Math.max(top, rectangles[i][3]);
////
////           lb = rectangles[i][0] + " " + rectangles[i][1];
////           lt = rectangles[i][0] + " " + rectangles[i][3];
////           rb = rectangles[i][2] + " " + rectangles[i][1];
////           rt = rectangles[i][2] + " " + rectangles[i][3];
////
////            if(!set.contains(lb))set.add(lb);
////            else set.remove(lb);
////
////            if(!set.contains(lt))set.add(lt);
////            else set.remove(lt);
////
////            if(!set.contains(rb))set.add(rb);
////            else set.remove(rb);
////
////            if(!set.contains(rt))set.add(rt);
////            else set.remove(rt);
////
////            sum += (rectangles[i][3] - rectangles[i][1]) * (rectangles[i][2] - rectangles[i][0]);
////        }
////        lb = left + " " + bottom;
////        lt = left + " " + top;
////        rb = right + " " + bottom;
////        rt = right + " " + top;
////        if(set.size() == 4 && set.contains(lb) && set.contains(lt) && set.contains(rb) && set.contains(rt) && sum == ((right - left ) * (top - bottom))){
////            return true;
////        }
////        return false;
////    }
////
////
////    public int kInversePairs(int n, int k) {
////        if(k > n * (n - 1) / 2){
////            return 0;
////        }
////        if(k == 0 || k == n * (n - 1) / 2){
////            return 1;
////        }
////        long mod = 1000000007;
////        long [][] dp = new long[n + 1][k + 1];
////        dp[2][0] = 1;
////        dp[2][1] = 1;
////        for (int i = 3; i <= n; i++) {
////            dp[i][0] = 1;
////            for (int j = 1; j < Math.min(k, n * (n - 1) / 2); j++) {
////                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
////                if(j >= i){
////                    dp[i][j] -= dp[i - 1][j - i];
////                }
////                dp[i][j] = (dp[i][j] + mod) % mod;
////            }
////        }
////        return (int)dp[n][k];
////    }
////
////    public boolean isSelfCrossing(int [] nums){
////        int n = nums.length;
////        if(n < 4){
////            return false;
////        }
////        for (int i = 3; i < n; i++) {
////            if(nums[i] >= nums[i - 2] && nums[i - 1] <= nums[i - 3]){
////                return true;
////            }
////            if(i >= 4){
////                if(nums[i - 1] == nums[i - 3] && nums[i] + nums[i - 4] == nums[i - 2])
////                    return true;
////            }
////            if(i >= 5){
////                if(nums[i] + nums[i - 4] >= nums[i - 2] && nums[i - 1] + nums[i - 5] >= nums[i - 3]
////                && nums[i] <= nums[i - 2]
////                && nums[i - 1] <=  nums[i - 3]
////                && nums[i - 2] >= nums[i - 4]){
////                    return true;
////                }
////            }
////        }
////        return false;
////    }
//    char [] pair = {'(', ')'};
//    char [] rePair = {')', '('};
//    public List<String> removeInvalidParentheses(String s){
//        List<String> res = new ArrayList<>();
//        removeHandler(res, s, 0, 0, pair);
//        return res;
//    }
//    public void removeHandler(List<String> res, String s, int lastI, int lastJ, char [] pa){
//        int count = 0;
//        for (int i = lastI; i < s.length(); i++) {
//            if(s.charAt(i) == pa[0]) count++;
//            if(s.charAt(i) == pa[1]) count--;
//            if(count < 0){
//                for (int j = lastJ; j <= i; j++) {
//                    if(s.charAt(j) == pa[1] && (j == lastJ || s.charAt(j - 1) != pa[1])){
//                        String newStr = s.substring(0, j) + s.substring(j + 1);
//                        removeHandler(res, newStr, i, j, pa);
//                    }
//
//                }
//                return;
//            }
//        }
//        StringBuilder stringBuilder = new StringBuilder(s);
//        s = stringBuilder.reverse().toString();
//        if(pa[0] == '('){
//            removeHandler(res, s, 0, 0, rePair);
//        }
//        else{
//            res.add(s);
//        }
//    }
//
//    public boolean reorderedPowerOf2(int n){
//        int [] mapN = new int[10];
//        int countN = getNumberMap(n, mapN);
//        for (int i = 0; i < 30; i++) {
//            int t = (1 << i);
//            int[] mapT = new int[10];
//            int countT = getNumberMap(t, mapT);
//            if(countT > countN){
//                return false;
//            }
//            if(countT == countN && Arrays.equals(mapN, mapT)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private int getNumberMap(int n, int[] mapN) {
//        int count = 0;
//        while(n != 0){
//            mapN[n % 10] ++;
//            count++;
//            n /= 10;
//        }
//        return count;
//    }
//
//    public int[] singleNumber(int [] nums){
//        int []res = new int[2];
//        int sum = 0;
//        int h = 1;
//        for (int i = 0; i < nums.length; i++) {
//            sum ^= nums[i];
//        }
//        while((sum & h) == 0){
//            h <<= 1;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if((nums[i] & h) == 0){
//                res[0] ^= nums[i];
//            }
//            else{
//                res[1] ^= nums[i];
//            }
//        }
//        return res;
//    }
//}
//
//public class JustForTest {
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list1.addAll(list2);
//        System.out.println(solution.removeInvalidParentheses("()(a))()"));
////        System.out.println(Arrays.toString(solution.findWords(new String []{"Hello","Alaska","Dad","Peace"})));
////        for(int i = 1;i<=10;i++)
////            System.out.println(solution.isPerfectSquare(i));
////        System.out.println(solution.findMinStep("WWRRBBWW", "WRBRW"));
////        MapSum mapSum = new MapSum();
////        mapSum.insert("app", 1);
////        System.out.println(solution.isSelfCrossing(new int []{1, 2, 3, 4}));
////        System.out.println(solution.isSelfCrossing(new int []{2, 1, 1, 2}));
////        System.out.println(solution.isSelfCrossing(new int []{1, 3, 3, 2, 4}));
////        System.out.println(solution.isSelfCrossing(new int []{1, 4, 4, 4, 3}));
////        System.out.println(solution.isSelfCrossing(new int []{2, 2, 5, 5, 3, 4}));
//    }
//}
