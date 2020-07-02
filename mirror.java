package com.bit.week2;


/**
 * @Author: BaiMiao
 * @Date: 2020/7/2 20:01
 * @Description:
 */
public class mirror {
    public class TreeNode{
        private Object data;
        private TreeNode left;
        private TreeNode right;
    }
    public static void Mirror(TreeNode root){
        //节点为null不处理
        if (root==null)
            return;;
            //节点的左右子节点为null（叶子节点）同样不处理
        if (root.left==null && root.right==null)
            return;
        //节点的左右节点交换
        TreeNode pTemp=root.left;
        root.left=root.right;
        root.right=pTemp;
        //递归处理
        if (root.left!=null)
            Mirror(root.left);
        if (root.right!=null)
            Mirror(root.right);
    }
}
