package day09.demo03;

/**
 * Zi
 *
 * @author wss
 * @date 2020/7/29 9:39 上午
 */
public class Zi extends Fu{
    int num = 20;
    public void method() {
        int num = 30;
        // 局部变量 30
        System.out.println(num);
        // 本类中的变量 20
        System.out.println(this.num);
        // 父类中的变量 10
        System.out.println(super.num);
    }
}
