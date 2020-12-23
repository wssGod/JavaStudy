package day09.demo11;

/**
 * Animal
 *
 * @author wss
 * @date 2020/11/30 8:57 上午
 * 抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束
 * 抽象类：抽象方法所在的类必须是抽象类，在class之前写上abstract
 *
 * 如何使用抽象类，抽象方法
 *  1.不能直接创建new抽象类对象。
 *  2.必须用一个子类继承抽象类。
 *  3.子类必须覆盖重写抽象类中的所有抽象方法。
 *  覆盖重写(实现)：子类去掉抽象方法的abstract关键字，然后补上方法体的大括号
 *  4.创建子类对象进行使用
 */
public abstract class Animal {
    /**
     * 这就是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定
     * @param
     * */
    public abstract void eat();
    /**
     * 这是一个普通的成员方法
     * */
    public void normalMethod() {

    }
}
