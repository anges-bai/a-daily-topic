package com.bit.week3;


import java.util.Scanner;

/**
 * @Author: BaiMiao
 * @Date: 2020/7/6 19:04
 * @Description:兔子三个月生一次，通过月数计算兔子总数
 * rabbit(n)=rabbit(n-1)+rabbit(n-2)
 */
public class rabbit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(rabbit(n));
        }
        sc.close();
    }
    //1.必须先写一个方法
    //2.要有出口条件
    //3.必须有一定的规律
    public static int rabbit(int n){
        if (n<=2)
            return 1;
        else {
            return rabbit(n-1)+rabbit(n-2);
        }
    }
}
