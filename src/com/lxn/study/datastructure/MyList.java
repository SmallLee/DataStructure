package com.lxn.study.datastructure;

/**
 * 自定义List
 */
public interface MyList {
    // 添加元素
    void add(Object obj);
    // 指定位置添加元素
    void add(int index,Object obj);
    // 删除指定元素
    void remove(Object obj);
    // 删除指定位置元素
    void remove(int index);
    // 获取指定位置元素
    Object get(int index);
    // 修改元素
    void set(int index,Object obj);
    // 元素索引
    int indexOf(Object obj);
    // 判空
    boolean isEmpty();
    // 集合容量
    int size();
    // 清空集合
    void clear();
}
