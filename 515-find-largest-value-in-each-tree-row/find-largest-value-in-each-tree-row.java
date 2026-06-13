/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null)return list;
        q.add(root);
        while(!q.isEmpty()){
            int size= q.size();
            int max= Integer.MIN_VALUE;
            while(size-->0){
                TreeNode a= q.poll();
                if(a.left!=null)q.add(a.left);
                if(a.right!=null)q.add(a.right);
                max=Math.max(max,a.val);
            }
            list.add(max);
        }
        return list;
    }
}