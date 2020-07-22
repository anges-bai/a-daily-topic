package com.bit.week3;

import java.util.*;

/**
 * @Author: BaiMiao
 * @Date: 2020/7/22 17:04
 * @Description:
 */
class TreeNode{
    private Object root;
    private TreeNode right;
    private TreeNode left;

    public TreeNode(Object root, TreeNode right, TreeNode left) {
        this.root = root;
        this.right = right;
        this.left = left;
    }
}

public class balanceTree {
    public boolean isBalance(TreeNode root) {
        //判断根元素是否为null
        if(root == null){
            return true;
        }
        //获取左边子树高度
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        //左右子树的高度大于1表示不是平衡二叉树
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        //isBalance()检查是否平衡
        return isBalance(root.left) && isBalance(root.right);
    }
    //计算树的高度
    public static int getTreeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left),
                getTreeHeight(root.right)) + 1;
    }
}

