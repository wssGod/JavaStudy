package day02;

/**
 * Demo2
 *
 * @author zqx
 * @date 2020/6/15 4:53 下午
 */
public class Demo2 {
    public static void main(String[] args) {
        int i = (int)1.5;

        short j = 10 + 1;

        int a = 600000000;

        int b = 10;
        int c = 3;
        int result = b / c;
        int result1 = b % c;
        System.out.println(i);
        // 结果：3
        System.out.println("除法:" + result);
        // 结果: 1
        System.out.println("取模%:" + result1);
        // int + double ---> double + double
        double result3 = b + 2.5;
        // 结果: 12.5
        System.out.println(result3);
    }
}
