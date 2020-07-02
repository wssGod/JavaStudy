package day07.demo03;

import java.util.Random;

/**
 * Demo02Random  Random生成指定范围的随机数
 *
 * @author wss
 * @date 2020/7/2 3:45 下午
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            // 范围 0-9
            int num = r.nextInt(10);
            System.out.print(num);
        }
    }
}
