package day07.demo03;

import java.util.Random;

/**
 * Demo01Random Random的概述及基本使用
 *
 * @author wss
 * @date 2020/7/2 3:26 下午
 * Random类用来生成随机数字。使用起来
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数：" + num);
    }
}
