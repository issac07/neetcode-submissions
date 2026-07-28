/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution {    
    public bool IsSubtree(TreeNode root, TreeNode subRoot) 
    {
        if (subRoot == null)
        {
            return true;
        }

        if (root == null)
        {
            return false;
        }

        if (IsSameTree(root, subRoot))
        {
            return true;
        }

        return IsSubtree(root.left, subRoot) || 
            IsSubtree(root.right, subRoot);
    }

    public bool IsSameTree(TreeNode n1, TreeNode n2) 
    {
        if (n1 == null && n2 == null)
        {
            return true;
        }

        if ( n1 != null && n2 != null && n1.val == n2.val)
        {
            return IsSameTree(n1.left, n2.left) && 
                IsSameTree(n1.right, n2.right);
        }
        else
        {
            return false;
        }
    }
}
