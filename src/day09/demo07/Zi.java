package day09.demo07;

/**
 * Zi
 *
 * @author wss
 * @date 2020/11/26 9:59 上午
 */
public class Zi extends Fu{
    /**
     * 子类构造方法
     * */
    public Zi() {
//        super(); // 调用父类中的无参数构造方法
        // 调用父类中的有参数构造方法
        super(10);
        System.out.println("子类构造方法");
    }

    public void method() {
//        super(); 错误的写法，只能在构造函数中才能调用父类的构造方法
    }
}
