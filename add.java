package com.bit.week2;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/21 18:26
 * @Description:两个数相加，但不使用+号
 * 异或运算^ 与相加结果相同
 * 与运算& 与相加进位相同
 */
public class add {
    public static int add(int a,int b){
        if (b==0){
            return a;
        }
        int sum=a^b;//相加但不进位
        int jin=(a&b)<<1;//进位但不相加
        return add(sum,jin);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(add(a,b));
    }
}
