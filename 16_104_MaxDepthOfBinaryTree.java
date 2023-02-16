class Solution {
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    private int height(TreeNode root){
        if(root==null)
        return 0;
        int leftAns = 1+height(root.left);
        int rightAns = 1+height(root.right);
        return Math.max(leftAns,rightAns);
    }
}
