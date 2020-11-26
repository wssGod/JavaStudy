package day09.demo08;

/**
 * Zi
 *
 * @author wss
 * @date 2020/11/26 11:07 上午
 * super 关键字的三种用法：
 *      1.在子类的成员方法中，访问父类的成员变量。
 *      2.在子类的成员方法中，访问父类的成员方法。
 *      3.在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu{

    public Zi() {
        super();
    }

    public void method() {
        // 访问父类中的method
        super.methodFu();
        // 父类中的num
        System.out.println(super.num);
    }
}
