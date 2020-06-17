package com.bit.week2;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/17 17:42
 * @Description:给你一个N，想让其变成Fibonacci数，每一步可以把
 *              当前数字X变成X-1或者X+1，现在给你一个数N求最少需
 *              要多少步可以变成Fibonacci数
 */
public class fibonacci_feet {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=0;
        int a=0,b=1,c=1;
        if (s1.hasNext()){
            n=s1.nextInt();
        }
        while (c<n){
            a=b;
            b=c;
            c=a+b;
        }
        int dis1=n-b;
        int dis2=c-b;
        System.out.println(dis1<dis2?dis1:dis2);
    }
}
