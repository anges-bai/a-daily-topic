package com.bit.week1;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/6 17:41
 * @Description:输入一串字符，判断最长的一串数字，并输出
 */
public class numberLong {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        while (s1.hasNext()){
            String str=s1.nextLine();
            int max=0,count=0,end=0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)>'0'&&str.charAt(i)<'9'){
                    count++;
                    if (max<count){
                        max=count;
                        end=i;
                    }
                }else {
                    count=0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}
