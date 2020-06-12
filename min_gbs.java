package com.bit.week1;


import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/12 20:29
 * @Description:
 */
public class min_gbs {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        int b=s1.nextInt();
        System.out.println(gbs(a,b));
    }
    public static int gys(int a,int b){
        if (b==0)
            return a;
        return gys(b,a%b);
    }
    public static int gbs(int a,int b){
        return (a*b)/gys(a,b);
    }
}
