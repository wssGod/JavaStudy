package day04;

/**
 * Demo08MethodOverload
 *
 * @author wss
 * @date 2020/6/29 12:56 下午
 * 对于类型的方法来说，因为参数列表不一样，却需要记住那么多不同方法的名称，太麻烦。
 * 方法的重载(Overload), 多个方法的名称一样，但是参数列表不一样
 * 只需要记住唯一一个方法的名称，就可以实现类似的多个功能。
 *
 * 方法重载与下列因素相关
 *  1.参数个数不同
 *  2.参数类型不同
 *  3.参数的多类型顺序不同
 *
 * 方法的重载与下列因素无关
 *  1.与参数的名称无关
 *  2.与方法的返回值类型无关
 */
public class Demo08MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30));
    }

    public static  int sum(int a, int b) {
        System.out.println("有两个参数的时候执行");
        return a + b;
    }

    public static int sum(int b, double a) {
        return (int)(a + b);
    }

    public static  int sum(int a, int b, int c) {
        System.out.println("有三个参数的时候执行");
        return a + b + c;
    }

    public static  int sum(int a, int b, int c, int d) {
        System.out.println("有四个参数的时候执行");
        return a + b + c + d;
    }
}
