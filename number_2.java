package com.bit.week1;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/11 20:49
 * @Description:输入一串数字，找出其中一个数字出现的次数>整串数字/2
 * str.split(" "):按照空格切分字符串
 * Integer.valueOf(str):将数字字符串转为int
 */
public class number_2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        while (s1.hasNext()){
            String str=s1.nextLine();
            String[] strs=str.split(" ");
            int[] arr=new int[strs.length];
            for (int i = 0; i <arr.length ; i++) {
                arr[i]=Integer.valueOf(strs[i]);
            }
            int num=arr[0];
            int count=0;
            for (int j=0;j<arr.length;j++){
                if (arr[j]==num){
                    count++;
                }else if (count>0){
                    count--;
                }else {
                    num=arr[j];
                }
            }
            System.out.println(num);
        }
    }
}
