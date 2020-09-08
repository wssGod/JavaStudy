package day08.demo03;

/**
 * Person
 * 静态代码块
 * @author wss
 * @date 2020/7/13 9:35 上午
 * public class 类名称 {
 *     static {
 *         // 静态代码块的内容
 *     }
 * }
 * 特点：当第一次用到本类时，静态代码块执行唯一一次
 */
public class Person {
    static {
        System.out.println("静态代码块执行");
    }

    public Person() {
        System.out.println("构造方法执行");
    }
}
