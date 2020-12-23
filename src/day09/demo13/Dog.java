package day09.demo13;

/**
 * Dog
 *
 * @author wss
 * @date 2020/12/22 9:53 上午
 * 子类也是一个抽象类
 */
public abstract class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

//    @Override
//    public void sleep() {
//
//    }
}
