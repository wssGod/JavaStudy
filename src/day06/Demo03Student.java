package day06;
/**
 * Demo03Student 对象的创建及使用
 *
 * @author wss
 * @date 2020/7/1 9:32 上午
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
 *  1.导包，也就是指出需要使用的类在什么位置。
 *      import 包名称.类名称;
 *      import day06.Demo02Student;
 *      对于当前类属于同一个包的情况，可以省略导包语句不写。
 *  2.创建，格式：
 *      类名称 对象名 = new 类名称();
 *      Demo02Student demo02Student = new Demo02Student();
 *  3.使用,分为两种情况:
 *      使用成员变量：对象名.成员变量名
 *      使用成员方法：对象名.成员方法名(参数)
 *      (也就是，想用谁，就用对象名点谁)
 * 注意事项：
 *  如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class Demo03Student {
    public static void main(String[] args) {
        // 1.导包
        // 我需要使用后的Demo02Student类与当前类处在同一个包下所以省略引包语句
        // 2. 创建格式
        Demo02Student demo02Student = new Demo02Student();
        // 3.使用其成员变量
        // null
        System.out.println(demo02Student.name);
        // 0
        System.out.println(demo02Student.age);
        // 改变对象当中成员变量的数值内容
        demo02Student.name = "wss";
        demo02Student.age = 18;
        // wss
        System.out.println(demo02Student.name);
        // 18
        System.out.println(demo02Student.age);
        demo02Student.eat();
        demo02Student.sleep();
        demo02Student.study();
    }
}
