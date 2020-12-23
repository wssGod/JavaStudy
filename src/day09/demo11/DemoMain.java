package day09.demo11;

/**
 * DemoMain
 *
 * @author wss
 * @date 2020/12/16 9:15 上午
 */
public class DemoMain {
    public static void main(String[] args) {
//        Animal animal = new Animal(); 错误的写法！不能直接创建抽象类对象
        Cat cat = new Cat();
        cat.eat();
    }
}
