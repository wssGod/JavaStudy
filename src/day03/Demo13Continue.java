package day03;

/**
 * @author wss
 *
 * 循环控制语句-Continue
 *  一旦执行，立刻跳出当前次循环剩余的内容，马上开始下一次循环
 */
public class Demo13Continue {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 1; i <= num; i++) {
            // 如果当前是第四层
            if (i == 4) {
                // 那么跳过当次循环，马上开始第五层
                continue;
            }
            System.out.println("第" + i + "层到了");
        }
    }
}
