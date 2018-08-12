package com.lxn.study.datastructure;

import com.sun.deploy.util.StringUtils;

/**
 *将一个字符串中的单词反转，比如输入Game is over,输出over is Game
 */
public class ReverseStrByWord {
    public static void main(String[] args) {
        System.out.println(reverseStr2("Game is over"));
    }

    /**
     * 思路：
     * 查找最后一个空格的位置，截取最后一个空格到末尾之间的字符串，将剩下的子串作为新的字符串重复上面的步骤
     * 直到查找不到空格
     */
    public static String reverseStr(String str) {
        // 拼接结果，指定长度是为了节省内存
        StringBuilder sb = new StringBuilder(str.length());
        // 当前正在处理的字符串
        String curStr = str;
        // 每次处理后的结果
        String result;
        int index = curStr.lastIndexOf(" ");
        while (index != -1) {
            // 查找结果
            result = curStr.substring(index + 1,curStr.length());
            // 剩下的字符串
            curStr = str.substring(0,index);
            index = curStr.lastIndexOf(" ");
            // 拼接结果
            sb.append(result).append(" ");
        }
        return sb.append(curStr).toString();
    }

    /**
     * 思路：
     * 通过split方法分割字符串，然后倒序拼接
     */
    private static String reverseStr2(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        // \s匹配任何空白字符，包括空格、制表符、换页符等等
        for (String part : str.split("\\s+")) {
            if (!part.isEmpty()) {
                if (sb.length() > 0) {
                    sb.insert(0," ");
                }
                sb.insert(0,part);
            }
        }
        return sb.toString();
    }
}
