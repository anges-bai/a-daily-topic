package com.bit.week2;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/16 20:56
 * @Description:  n!的结果有几个零
 *               末尾0的个数实际上就是2*5的个数（25,125,625）单独考虑
 */
public class factorial_zero {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        int res=0;
        for (int i = n; i>=5 ; i++) {
            int tmp=i;
            while (tmp%5==0){
                res++;
                tmp/=5;
            }
        }
        System.out.println(res);
    }
}
