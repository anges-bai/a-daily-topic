package com.bit.week1;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/4 19:38
 * @Description:
 */
public class isHuiwen {
    public static boolean isHuiwen(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //两个字符串判断有几种插入方式可以使它变成回文串
    //str1=aba ;  str2=b ;
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String str1=s1.nextLine();
        String str2=s1.nextLine();
        int count=0;
        for (int i = 0; i <str1.length() ; i++) {
            StringBuilder sb=new StringBuilder(str1);
            sb.insert(i,str2);
            if (isHuiwen(sb.toString())){
                count++;
            }
            
        }
        System.out.println(count);
    }
}
