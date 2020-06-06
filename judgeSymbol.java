package com.bit.week1;

import java.util.Stack;

/**
 * @Author: BaiMiao
 * @Date: 2020/6/6 17:47
 * @Description:给定一个字符串A和它的长度n，判断括号的使用是否正确
 */
public class judgeSymbol {
    public boolean chkSymbol(String A,int n){
        Stack<Character> lefts=new Stack<Character>();
        if (A==null || A.length()!=n){
            return false;
        }
        for (int i = 0; i <n ; i++) {
            if (A.charAt(i)=='('){
                lefts.push(A.charAt(i));
            }else if (A.charAt(i)==')'){
                if (lefts.empty()){
                    return false;
                }else {
                    lefts.pop();
                }
            }else {
                return false;
            }
        }
        if (!lefts.empty()){
            return false;
        }else {
            return true;
        }
    }

}
