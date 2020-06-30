package day05;

/**
 * Demo09Array 数组的遍历
 *
 * @author wss
 * @date 2020/6/30 10:52 上午
 */
public class Demo09Array {
    public static void main(String[] args) {
        int[] array = {15, 25, 30, 40, 50, 60};
        // 原始方式
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("========");
        // 使用循环
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("========");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
