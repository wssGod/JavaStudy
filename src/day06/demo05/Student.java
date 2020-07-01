package day06.demo05;

/**
 * Student 定义一个标准的类
 *
 * @author zqx
 * @date 2020/7/1 4:37 下午
 * 一个标准的类通常要拥有下面四个组成步骤：
 *  1.所有的成员变量都要使用private关键字修饰
 *  2.为每一个成员变量编写一对Getter/Setter违法
 *  3.编写一个无参数的构造方法
 *  4.编写一个全参数的构造方法
 */
public class Student {
    private String name;
    private int  age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
