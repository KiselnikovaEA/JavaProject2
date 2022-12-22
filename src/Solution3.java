class Solution3 {
    public static boolean isSymmetric(TreeNode root) {
        return symTree(root.left, root.right);
    }
    private static boolean symTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        return symTree(p.left, q.right) && symTree(p.right, q.left);
    }
}
