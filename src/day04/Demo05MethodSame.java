package day04;

/**
 * Demo05MethodSame
 *
 * @author wss
 * @date 2020/6/29 11:11 上午
 * 题目要求：
 *  定义一个方法，用来判断两个数字是否相等
 */
public class Demo05MethodSame {
    public static void main(String[] args) {
        System.out.println("第1种返回结果：" + isSame(10, 20));
        System.out.println("第2种返回结果：" + isSame2(10, 20));
        System.out.println("第3种返回结果：" + isSame3(10, 20));
    }
    /**
     * 三要素：
     *  返回值类型：boolean
     *  方法名称：isSame
     *  参数列表：int a, int b
     * */
    public static boolean isSame(int a, int b) {
        // 第一种方法
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }
    /**
     * 第二种
     * */
    public static boolean isSame2(int a, int b) {
        boolean same = a == b ? true : false;
        return same;
    }
    /**
     * 第三种
     * */
    public static boolean isSame3(int a, int b) {
        return a == b;
    }
}
