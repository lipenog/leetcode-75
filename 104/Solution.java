class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int dl = maxDepth(root.left) + 1;
        int dr = maxDepth(root.right) + 1;
        return Integer.max(dl, dr);
    }
}