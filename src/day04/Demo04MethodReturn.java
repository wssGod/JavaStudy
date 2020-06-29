package day04;

/**
 * Demo04MethodReturn
 *
 * @author wss
 * @date 2020/6/29 10:57 上午
 *
 * 题目要求：定义一个方法，用来【求出】两个数字之和。(你帮我算，算完之后结果告诉我)
 * 题目变形：定义一个方法，用来【打印】两个数字之后。(你来计算，算完之后你自己负责显示结果，不用告诉我)
 * 注意事项：
 *  对于有返回值的方法可以使用单独调用，打印调用，赋值调用。
 *  对于没有返回值的方法只能使用单独调用。
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        // 我是main方法，我来调用你
        // 我调用你，你来帮我计算，算完之后，把结果告诉我
        int sum = getSum(10, 10);
        System.out.println("返回值是：" + sum);
        System.out.println("------");
        printSum(20, 20);

    }
    /**
     * 我是一个方法，我负责两个数相加
     * 我有返回值int、谁调用我，我就把计算结果告诉谁
     * */
    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }
    /**
     * 我是一个方法，我负责两个数相加。
     * 我没有返回值，不会把结果告诉任何人，而是我自己打印输出。
     * */
    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}
