package day04;

/**
 * Demo07MethodPrint
 *
 * @author wss
 * @date 2020/6/29 11:24 上午
 * 题目要求：
 *  定义一个方法，用来打印指定次数的Hello Word
 */
public class Demo07MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }
    /**
     * 三要素：
     *  返回值类型： 只是进行一大堆打印的操作而已，没有计算，也没有结果要告诉调用处
     *  方法名称：printCount
     *  参数列表：打印的次数
     * */
    public static void printCount(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello Word");
        }
    }
}
