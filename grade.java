package com.bit.week2;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/22 11:46
 * @Description:
 */
public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();//输入的人数
            if (n==0){
                return;
                //若检测到输入的人数为0，则结束
            }
            int[] arr=new int[n];//保存n个人的分数
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=sc.nextInt();
            }
            int t=sc.nextInt();
            //目标分数 输出击中目标分数的个数
            int count=0;
            for (int i = 0; i <arr.length ; i++) {
                if (t==arr[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
