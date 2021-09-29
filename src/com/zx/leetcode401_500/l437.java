package com.zx.leetcode401_500;

import com.zx.TreeNode;

/**
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 *
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class l437 {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.right = new TreeNode(2);
        t.right.right= new TreeNode(3);
        t.right.right.right = new TreeNode(4);
        t.right.right.right.right = new TreeNode(5);
        l437 l = new l437();
        System.out.println(l.pathSum(t,3));
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int path = rootSum(root,targetSum);
        path += pathSum(root.left,targetSum);
        path += pathSum(root.right,targetSum);
        return path;
    }

    // 递归查找该node节点下符合 路径==target的数量
    private int rootSum(TreeNode root, int targetSum){
        if (root == null) {
            return 0;
        }
        int path = 0;
        if (targetSum == root.val){
            path++;
        }
        path += rootSum(root.left, targetSum-root.val);
        path += rootSum(root.right, targetSum-root.val);
        return path;
    }
}
