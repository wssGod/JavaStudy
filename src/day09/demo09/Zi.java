package day09.demo09;

/**
 * Zi
 *
 * @author wss
 * @date 2020/11/26 2:29 下午
 * super关键字用来访问父类中的内容，this关键字用来访问本类中的内容
 *  1. 在本类成员方法中，访问本类的成员变量。
 *  2. 在本类的成员方法中，访问本类的另一个成员方法
 *  3. 在本类的构造方法中，访问本类的另一个构造方法
 *  在第三种方法中要注意：
 *      A. this(...)调用也必须是构造方法的第一个语句，唯一一个
 *      B. super和this两种构造调用，不能够同时使用
 */
public class Zi extends Fu{
    int num = 20;

    public Zi() {
//        super(); 这一行不在赠送
        this(10);
    }

    public Zi(int a) {

    }

    public void method() {
        int num = 10;
        // 访问的是局部变量
        System.out.println(num);
        // 访问本类中的成员变量
        System.out.println(this.num);
    }

    public void methodA() {
        System.out.println("A");
    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");
    }
}
