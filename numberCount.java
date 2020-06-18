package com.bit.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/18 19:17
 * @Description:一串数字中每个数字出现的次数
 */
public class numberCount {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        String N=s1.next();
        char[] chars=N.toCharArray();
        List<Integer> list=new ArrayList<>();
        //list有10个item表示0-9，每个item的值表示数字的个数
        for (int i = 0; i <10 ; i++) {
            list.add(0);//初始化每个item都是0
        }
        for (int i = 0; i <chars.length ; i++) {
            //每遇到一个数字，值+1
            list.set(chars[i]-'0',list.get(chars[i]-'0')+1);
        }
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>0){
                System.out.println(i+":"+list.get(i));
            }
        }
    }
}
