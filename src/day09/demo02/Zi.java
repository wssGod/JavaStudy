package day09.demo02;

/**
 * Zi
 *
 * @author wss
 * @date 2020/7/29 9:06 上午
 */
public class Zi extends Fu{
    int numZi = 20;
    int num = 200;
    public void methodZi() {
        // 因为本类当中有num，所以这里使用的是本类当中的num
        System.out.println(num);
    }
}
