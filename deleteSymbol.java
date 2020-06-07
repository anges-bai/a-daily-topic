package com.bit.week1;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/7 18:46
 * @Description:两串字符，去掉第一串字符中包含的第二串中的字母
 */
public class deleteSymbol {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
     /*   while (s1.hasNext()){
            char[] ch=s1.nextLine().toCharArray();
            String str=s1.nextLine();
            for (int i = 0; i <ch.length ; i++) {
               if (!str.contains(String.valueOf(ch[i]))){
                   System.out.print(ch[i]);
               }
            }

        }*/
     while (s1.hasNext()){
         String str1=s1.nextLine();
         String str2=s1.nextLine();
         for (int i = 0; i <str1.length() ; i++) {
             if (!str2.contains(String.valueOf(str1.charAt(i)))){
                 System.out.print(str1.toString().charAt(i));
             }
         }
     }
    }
}
