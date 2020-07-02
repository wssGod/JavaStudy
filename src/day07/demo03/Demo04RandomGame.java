package day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * Demo04RandomGame  练习2：猜数字小游戏
 *
 * @author wss
 * @date 2020/7/2 3:58 下午
 * 题目：
 *  用代码模拟器猜数字的小游戏
 * 思路:
 *  1.首先需要产生一个随机数字，并且一旦产生不再变化，用Random的nextInt方法
 *  2.需要键盘输入，所以用到Scanner
 *  3.获取键盘输入的数字，用Scanner当中的nextInt方法
 *  4.已经得到了两个数字，判断(if)一下
 *      如果太大，提示太大，并且重试
 *      如果太小，提示太小，并且重试
 *      如果猜中了，游戏结束
 *  5.重试就是再来一次，循环次数不确定，用while(true)
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random random = new Random();
        // 随机生成一个1-100之间的数
        int randomNum = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜测的数字：");
            int num = scanner.nextInt();
            if (num > randomNum) {
                System.out.println("太大了请重试");
            } else if (num < randomNum) {
                System.out.println("太小了请重试");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
