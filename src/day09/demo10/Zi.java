package day09.demo10;

/**
 * Zi
 *
 * @author wss
 * @date 2020/11/26 2:58 下午
 */
public class Zi extends Fu{
    int num = 20;

    @Override
    public void method() {
        // 调用父类中的方法
        super.method();
        System.out.println("子类方法");
    }

    public void show() {
        int num = 30;
        // 30
        System.out.println(num);
        // 20
        System.out.println(this.num);
        // 10
        System.out.println(super.num);
    }
}
