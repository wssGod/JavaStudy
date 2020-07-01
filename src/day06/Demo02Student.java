package day06;

/**
 * Demo02Student
 *
 * @author wss
 * @date 2020/7/1 9:22 上午
 * 定义一个类：用来模拟"学生"事物，其中有两个部分组成：
 *  属性（是什么）
 *      姓名
 *      年龄
 *  行为（能做什么）
 *      吃饭
 *      睡觉
 *      学习
 * 对应java类中：
 *  成员变量（属性）：
 *      String name; // 姓名
 *      int age; // 年龄
 *  成员方法（行为）：
 *      public void eat() {} // 吃饭
 *      public void sleep() {} // 睡觉
 *      public void study() {} // 学习
 * 注意事项：
 *  1.成员变量是直接定义在类中的，在方法外边
 *  2.成员方法不要写static关键字
 */
public class Demo02Student {
    /**
     * 成员变量
     *  姓名
     *  年龄
     * */
    String name;
    int age;
    /**
     * 成员方法
     * */
    public void eat() {
        System.out.println("吃饭饭");
    }
    public void sleep() {
        System.out.println("睡觉");
    }
    public void study() {
        System.out.println("学习");
    }
}
