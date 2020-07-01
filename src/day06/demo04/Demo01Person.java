package day06.demo04;

/**
 * Demo01Person this关键字的作用
 *
 * @author wss
 * @date 2020/7/1 4:08 下午
 */
public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        // 设置我自己的名字
        person.name = "王健林";
        person.sayHello("王思聪");
    }
}
