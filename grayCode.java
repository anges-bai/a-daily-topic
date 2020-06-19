package com.bit.week2;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/19 18:54
 * @Description:
 * 一个函数内不使用任何临时变量，直接交换两个数的值
 * 给定一个int数组AB，其第零个元素和第一个元素为待交换的值
 * 请返回交换后的数组
 * 输入：[1,2]输出：[2,1]
 * 不使用额外空间进行两个数交换，用加减法或位运算
 */
public class exchangeNumber {
    public static int[] exchangeAB(int[] AB){
        AB[0]^=AB[1];
        AB[1]^=AB[0];
        AB[0]^=AB[1];
        return AB;
    }

    public static void main(String[] args) {
        int[] ab={1,2};

        System.out.println(exchangeAB(ab));
    }
}
