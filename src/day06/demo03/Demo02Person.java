package day06.demo03;

/**
 * Demo02Person private关键字的作用及使用
 *
 * @author wss
 * @date 2020/7/1 2:18 下午
 */
public class Demo02Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "烧死奥";
//        person.age = 20; 直接访问private内容是错误的
        person.setAge(-20);
        person.show();
    }
}
