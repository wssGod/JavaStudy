package day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * Demo01ArrayListRandom
 * 生成6个1~33之间的随机整数，添加到集合，并遍历集合
 * @author wss
 * @date 2020/7/7 11:00 上午
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        // 定义一个整数集合
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int count = 6;
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(33) + 1;
            list.add(num);
        }
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
