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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null)return 0;
        q.add(root);
        int level=0;
        int ans=0;
        int max= Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size= q.size();
            level++;
            int sum=0;
            while(size-->0){
                TreeNode a= q.poll();
                if(a.left!=null)q.add(a.left);
                if(a.right!=null)q.add(a.right);
                sum+=a.val;
            }
            if(sum>max){
                ans=level;
                max=sum;
            }
        }
        return ans;
    }
}