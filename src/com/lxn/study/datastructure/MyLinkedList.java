package com.lxn.study.datastructure;

import java.util.LinkedList;

/**
 * 定义一个你自己的LinkedList(双向链表)类的基本设计(类，接口，成员等)，并写一个函数实现其逆转
 * Java实现
 */
public class MyLinkedList<T> {
    // 表头
    private DNode mHead;
    // 节点个数
    private int mCount;
    private class DNode{
        private DNode pre;
        private DNode next;
        private T value;

        DNode(DNode pre, DNode next, T value) {
            this.pre = pre;
            this.next = next;
            this.value = value;
        }
    }

    public MyLinkedList(){
        mHead = new DNode(null,null,null);
    }
}
