package com.bit.week1;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/7 18:41
 * @Description:有装8个和6个的袋子，要买20个糖果，则需要买几袋
 */
public class buyCandy {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        while (s1.hasNext()){
            int n=s1.nextInt();
            System.out.println(count(n));
        }
    }
    public static int count(int n){
        if (n%2!=0||n==10||n<6){
            return -1;
        }
        if (n%8==0){
            return n/8;
        }
        return 1+n/8;
    }
}
