package com.bit.week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/15 19:46
 * @Description:一个数组，每隔两个数删除一个数字，最后剩下的是哪个
 */
public class deleteNumber {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        List<Integer> list=new ArrayList<>();

            for (int i = 0; i <n ; i++) {
                list.add(i);
            }
            int i=0;
            while (list.size()>1){
                i=(i+2)%list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }

}
