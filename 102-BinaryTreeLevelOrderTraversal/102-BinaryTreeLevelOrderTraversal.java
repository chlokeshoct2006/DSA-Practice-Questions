// Last updated: 7/16/2026, 1:29:25 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if (root == null) return ans;
21        q.offer(root);
22        while (!q.isEmpty()){
23            List<Integer> row = new ArrayList<>();
24            int n = q.size();
25            for (int i =0; i< n ; i++){
26                TreeNode front = q.poll();
27                row.add(front.val);
28                if (front.left != null) q.offer(front.left);
29                if (front.right != null) q.offer(front.right);
30            }
31            ans.add(row);
32        }
33        return ans;
34    }
35}