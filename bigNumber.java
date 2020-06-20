package com.bit.week2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/20 16:58
 * @Description:超长正整数相加
 */
public class bigNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while (s.hasNext()){
            String s1=s.next();
            String s2=s.next();
            BigInteger num1=new BigInteger(s1);
            BigInteger num2=new BigInteger(s2);
            System.out.println(num1.add(num2));
        }
    }
}
