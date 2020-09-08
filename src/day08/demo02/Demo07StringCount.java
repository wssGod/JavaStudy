package day08.demo02;

import java.util.Scanner;

/**
 * Demo07StringCount
 *
 * @author wss
 * @date 2020/7/10 2:06 下午
 * 题目：
 *  键盘输入一个字符串，并且统计其中各种字符出现的次数。
 *  种类有：大写字母，小写字母，数字，其它
 * 思路：
 *  1.既然用到键盘输入，肯定是Scanner
 *  2.键盘输入的事字符串，那么String str = sc.next();
 *  3.定义四个变量，分别代表四种字符各自出现的次数
 *  4.需要对字符串一个字、一个字的检查，String --> char[], 方法就是toCharArray()
 *  5.遍历char[]字符串数组，对当前字符的种类进行判断，并且四个变量进行++操作
 *  6.打印输出四个变量，分别代表四种字符出现的次数
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 大写字母的数量
        int countUp = 0;
        // 小写字母的数量
        int countLower = 0;
        // 数字的数量
        int countNum = 0;
        // 其它的数量
        int countOther = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                countUp++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                countLower++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                countNum++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写字母的数量：" + countUp);
        System.out.println("小写字母的数量：" + countLower);
        System.out.println("数字的数量：" + countNum);
        System.out.println("其它数量：" + countOther);
    }
}
