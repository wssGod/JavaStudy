package day07.demo01;

import java.util.Scanner;

/**
 * Demo03ScannerMax 练习二：键盘输入三个数字求出最大值
 *
 * @author wss
 * @date 2020/7/2 12:57 下午
 *  思路：
 *    1.既然需要键盘输入，那么就用Scanner
 *    2.Scanner的三个步骤：导包，创建，使用
 *    3.需要的三个数字，所以需要调用三个nextInt方法
 *    4.既然是三个数字，应该转换成为两个步骤
 *      4.1 首先判断前两个中谁最大，拿到两个最大值
 *      4.2 拿着两个的最大值，在和第三个数字比较，得到三个数字当中的最大值
 *    5.将结果打印输出
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大的数：" + max);
    }
}
