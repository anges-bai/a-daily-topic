package com.bit.week3;


/**
 * @Author: BaiMiao
 * @Date: 2020/7/5 17:50
 * @Description:
 */
class ListNode{
    int val;
    ListNode next=null;

    public ListNode(int val) {
        this.val = val;
    }
}
public class partition {
    public ListNode partition(ListNode pHead,int x){
        if (pHead==null || pHead.next==null){
            return pHead;
        }
        ListNode cur=pHead;
        //两个头指针
        ListNode sHead=new ListNode(-1);
        ListNode bHead=new ListNode(-1);

        ListNode sTmp=sHead;
        ListNode bTmp=bHead;
        while (cur!=null){
            if (cur.val<x){
                //值小于x的点
                sTmp.next=new ListNode(cur.val);
                sTmp=sTmp.next;
            }else {
                //值大于x的点
                bTmp.next=new ListNode(cur.val);
                bTmp=bTmp.next;
            }
            cur=cur.next;
        }
        //第一个链表的头
        cur=sHead;
        while (cur.next!=null&&cur.next.val!=-1){
            cur=cur.next;
        }
        //cur的next指向第二个节点的next
        //相当于将第一个链表和第二个链表连接
        cur.next=bHead.next;
        return sHead.next;
        //返回第一个节点next（不包含头节点）
    }
}
