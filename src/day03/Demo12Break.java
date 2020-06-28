package day03;

/**
 * @author wss
 *
 * break 关键字的用法有常见的两种
 *  1. 可以用在switch语句中，一旦执行，整个switch语句立刻结束。
 *  2. 可以用在循环语句中，一旦执行，整个循环语句立刻结束。
 */
public class Demo12Break {
    public static void main(String[] args) {
        int num = 10;
        for(int i = 1; i <= num; i++) {
            // 从第四次开始后面全部不要，就要打断循环
            if (i == 4) {
                break;
            }
            System.out.println("我是正确的");
        }
    }
}
