package com.bit;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/22 11:34
 * @Description:
 * 每次读取一个数之后，算出他经过k次洗牌后的位置，只用一个长度为2n数组
 * 用来输出，根据当前数的位置可以算出经过一次洗牌后的位置
 * 若当前数<=n（在左手），则它下次出现的位置是2*当前位置-1
 * 若当前位置>n（在右手），则它下次出现的位置是2*（当前位置-n）
 */
public class shuffle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int groups=sc.nextInt();//数组组数
        while (groups-->0){
            int n=sc.nextInt();
            //数字个数的一半
            int k=sc.nextInt();
            //洗牌次数
            int[] res=new int[2*n];//数据总个数
            for (int i = 0; i <2*n ; i++) {//遍历数据数组
                int tmp=i+1;
                //修正内层循环
                for (int j=0;j<k;j++){
                    if (tmp<=n){
                        tmp=2*tmp-1;
                    }else{
                        tmp=2*(tmp-n);
                    }
                }
                res[tmp-1]=sc.nextInt();
                //数组中temp-1的位置的数据，即洗牌后的结果
            }
            //输出
            if (res.length>0){
                System.out.println(res[0]);
            }
            for (int i = 1; i <2*n ; i++) {
                System.out.print(" "+res[i]);
            }
            System.out.println();
        }
    }
}
