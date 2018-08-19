package com.lxn.study.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,3,8,2,9,1};
        // 外层循环控制有多少趟排序
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环控制每趟排序的次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("第" + (i + 1) + "趟排序后的结果为" + Arrays.toString(arr));
        }
        System.out.println("最终结果" + Arrays.toString(arr));
    }
}
