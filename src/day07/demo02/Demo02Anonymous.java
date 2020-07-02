package day07.demo02;

import java.util.Scanner;

/**
 * Demo02Anonymous 匿名对象作为方法的参数和返回值
 *
 * @author wss
 * @date 2020/7/2 3:12 下午
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        // 匿名对象方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);
        // 使用匿名对象传参
//        methodParams(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }
    public static void methodParams(Scanner sc) {
        int i = sc.nextInt();
        System.out.println("输入的是：" + i);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }
}
