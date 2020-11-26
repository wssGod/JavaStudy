package day09.demo07;

/**
 * Demo01Constructor
 * 继承中构造方法的访问特点
 * @author wss
 * @date 2020/10/9 3:32 下午
 * 1. 子类构造方法当中有一个默认的"super()"调用，所以一定是先调用的父类构造，后执行子类构造
 * 2. 可以通过super()关键字在子类构造调用父类重载的构造
 * 3. super的父类构造调用，必须是子类构造方法的第一个语句。不能一个子类调用多次super()构造
 * 总结
 *  子类必须调用父类构造方法，不写则赠送super()，写了则用写的指定的super调用，super有且仅有一个
 */
public class Demo01Constructor {
    public static void main(String[] args) {
        Zi zi = new Zi();
    }
}
