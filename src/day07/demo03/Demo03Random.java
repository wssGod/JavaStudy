package day07.demo03;

import java.util.Random;

/**
 * Demo03Random 练习1：生成1-n的随机数
 *
 * @author wss
 * @date 2020/7/2 3:48 下午
 * 题目要求：
 *  根据int变量n的值，来获取随机数字，范围是[1, n]，可以取到1也可以取到n
 * 思路：
 *  1.定义int变量n，随机赋值
 *  2.要使用Random，三个步骤：导包、创建、使用
 *  3.如果写10，那么就是0~9，然而想要的是1~10，可以发现，整体加1即可
 *  4.打印随机数
 */
public class Demo03Random {
    public static void main(String[] args) {
        int n = 10;
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            // 原来的范围[0, n) 整体+1之后的范围[1, n+1) 也就是[1, n]
            int num = random.nextInt(n) + 1;
            System.out.println(i);
        }
    }
}
