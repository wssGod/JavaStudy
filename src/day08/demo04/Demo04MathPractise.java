package day08.demo04;

/**
 * Demo04MathPractise
 * 计算在 -10.8 到 5.9 之间，绝对值大于6或者小于2.1的整数有多少个
 * @author wss
 * @date 2020/7/28 1:28 下午
 * 分析：
 *  1. 既然已经确定范围， for循环
 *  2. 起点位置-10.8应该ceil转换成-10，两种办法：
 *      2.1 可以使用Math.ceil方法，向上（向正方向）取整
 *      2.2 强转成int， 自动舍弃所有小数位
 *  3. 每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的
 *  4. 如何拿到绝对值： Math.abs方法
 *  5. 一旦发现一个数字，需要计数器++ 进行统计
 *  备注：如果使用Math.ceil方法，-10.8可以变成-10.0，注意double也是可以++的
 */
public class Demo04MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        // 这样处理，变量i就是取件之内的所有整数
        for (int i = (int)min; i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count++;
            }
        }
        System.out.println("正确答案：" + count + "个");
    }
}
