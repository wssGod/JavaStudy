package day04;

/**
 * Demo06MethodSum
 *
 * @author wss
 * @date 2020/6/29 11:18 上午
 * 题目要求：
 *      定义一个方法，求出1-100之间所有数字的和值
 */
public class Demo06MethodSum {
    public static void main(String[] args) {
        System.out.println("1-100之间的和：" + getSum());
    }
    /**
     * 三要素：
     *  返回值：有返回值，计算结果是一个int数字。
     *  方法名称：getSum。
     *  参数列表：数据范围已经确定，是固定的，所以不需要告诉我任何条件，不需要参数。
     * */
    public static int getSum() {
        int num = 100;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            count += i;
        }
        return count;
    }
}
