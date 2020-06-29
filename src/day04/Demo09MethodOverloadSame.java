package day04;

/**
 * Demo09MethodOverloadSame 重载的练习1
 *
 * @author wss
 * @date 2020/6/29 1:15 下午
 * 题目要求：
 *      比较两个数据是否相等
 *      参数类型分别为两个byte类型、两个short类型、两个int类型、两个long类型
 *      并在main方法中进行测试
 */
public class Demo09MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short) a, (short) b));
        System.out.println(isSame((int) a, (int) b));
        System.out.println(isSame(10L, 20L));
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数方法的执行");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        System.out.println("两个short参数方法的执行");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        System.out.println("两个int参数方法的执行");
        return a == b;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("两个long参数方法的执行");
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
