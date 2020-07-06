package com.bit.week3;

import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/7/6 19:10
 * @Description:
 */
public class decode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String value=sc.nextLine();
            char[] chars=value.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                char c=chars[i];
                if ('A'<=c){
                    //密码字母：A B C D E
                    //原文字母：V W X Y Z
                    //F->A --- F-5
                    //B->W --- B+21
                    c=(char)('E'<c?(c-5):(c+21));
                    chars[i]=c;
                }
            }
            System.out.println(chars);
        }
    }
}
