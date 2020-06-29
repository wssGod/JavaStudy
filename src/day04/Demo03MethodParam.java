package day04;

/**
 * Demo03MethodParam
 *
 * @author wss
 * @date 2020/6/29 10:25 上午
 * 有参数： 小括号当中有内容，当一个方法需要一些数据条件，才能完成任务的时候就是有参数，
 *          例如两个数字相加，必须知道两个数字各自是多少才能相加。
 * 无参数： 小括号当中留空。一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数。
 */
public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10, 10);
        System.out.println("------------");
        method2();
    }

    /**
     *  两个数字相乘，必须知道两个数字是多少，否则无法计算
     *  有参数
     * */
    public static void method1(int a, int b) {
        int result = a * b;
        System.out.println("相乘结果为：" + result);
    }

    /**
     * 例如打印输出固定的10次文本字符串
     * */
    public static void method2() {
        int num = 10;
        for (int i = 0; i < num; i++) {
            System.out.println("Hello Word");
        }
    }
}
