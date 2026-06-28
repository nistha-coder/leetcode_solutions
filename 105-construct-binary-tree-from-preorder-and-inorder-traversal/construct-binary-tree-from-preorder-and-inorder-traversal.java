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
    public TreeNode helper(HashMap<Integer,Integer> map, int[] preorder, int[] inorder,int s , int e,int i){
        if(s>e)return null;
        TreeNode node = new TreeNode(preorder[i]);      
        int idx= map.get(preorder[i]);
        int len= idx-s;
        node.left= helper(map,preorder,inorder,s,idx-1,i+1);
        node.right= helper(map,preorder,inorder,idx+1,e,i+len+1);
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(map,preorder,inorder,0,inorder.length-1,0);
    }
}