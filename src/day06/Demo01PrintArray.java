package day06;

import java.util.Arrays;

/**
 * Demo01PrintArray 面向对象思想的概述
 *
 * @author zqx
 * @date 2020/6/30 7:38 下午
 * 面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲历亲为，详细处理每一个细节。
 * 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人来帮我做事。
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        // 要求打印的格式为：[10, 20, 30, 40, 50]
        System.out.print('[');
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("=======");
        // 使用面向对象
        // 找一个JDK给我们提供好的Arrays类
        // 其中toString方法，直接就能把数组变成想要的格式字符串
        System.out.println(Arrays.toString(array));
    }
}
