package com.bit.week3;

/**
 * @Author: BaiMiao
 * @Date: 2020/7/5 17:40
 * @Description:某个数出现的次数超过了总数的一半，找出该数
 * 若没有超过该数的一半，返回0
 */
public class gift {
    public int getValue(int[] gifts,int n){
        if (gifts.length<n)
            return 0;
        if (gifts.length==0)
            return 0;
        int count=0,temp=0;
        for (int i = 0; i <n ; i++) {
            if (count==0){
                temp=gifts[i];
                count=1;
            }else {
                if (temp==gifts[i])
                    count++;
                else 
                    count--;
            }
        }
        int size=0;
        for (int i = 0; i <n ; i++) {
            if (temp==gifts[i])
                size++;
        }
        return (size>n/2)?temp:0;
    }
}
