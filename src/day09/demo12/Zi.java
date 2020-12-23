package day09.demo12;

/**
 * Zi
 *
 * @author wss
 * @date 2020/12/16 9:32 上午
 */
public class Zi extends Fu{
    public Zi() {
        System.out.println("子类构造方法执行");
    }
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
