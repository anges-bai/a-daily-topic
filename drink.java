package com.bit.week1;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/5 19:19
 * @Description:
 * 三瓶饮料瓶可以换购一瓶饮料，那么10瓶饮料可以换购几瓶饮料？
 */
public class drink {
    public static int drink(int n){
        int total=0;
        while (n>2){
            total=total+n/3;
            n=n/3+n%3;
            if (n==2){
                total=total+1;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        while (s1.hasNext()){
            int n=s1.nextInt();
            System.out.println(drink(n));
        }

    }
}
