package day08.demo04;

import java.util.Arrays;

/**
 * Demo02ArraysTest
 * 请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 * @author wss
 * @date 2020/7/13 10:54 上午
 */
public class Demo02ArraysTest {
    public static void main(String[] args) {
        String line = "cxvffdgwqqwaafgzawdqw";
        char[] chars = line.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i] + " ");
        }
    }
}
