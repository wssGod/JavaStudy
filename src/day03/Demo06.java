package day03;

/**
 * Demo06
 *
 * @author wss
 * @date 2020/6/28 10:50 上午
 *
 * 题目：使用三元运算符和标准的if-else语句分别实现，取两个数字当中的最大值
 */
public class Demo06 {
    public static void main(String[] args) {
        int a = 105;
        int b = 20;
        // 首先使用三元运算符
        int max = a > b ? a : b;

        // 使用if语句
        if(a > b) {
            max = a;
        } else {
            max = b;
        }
        System.out.println("最大值：" + max);
    }
}
