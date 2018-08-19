package com.lxn.study.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,2,8,4,9,1};
        // 外层循环控制进行多少趟排序
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            // 从剩下的i+1之后的记录中查找最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]){
                    index = j; // 记录找到最小值得索引
                }
            }
            if (i != index) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
            System.out.println("第" + (i + 1) + "趟排序后的结果为" + Arrays.toString(arr));
        }
        System.out.println("排序后的结果为" + Arrays.toString(arr));
    }
}
