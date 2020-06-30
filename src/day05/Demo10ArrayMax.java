package day05;

/**
 * Demo10ArrayMax 求出数组当中的最大值
 *
 * @author wss
 * @date 2020/6/30 11:03 上午
 */
public class Demo10ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 30, 20, 10000};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            // 如果当前元素比台上的更大，换人
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 谁最后厉害，就留下谁的战斗力
        System.out.println("最大值：" + max);
    }
}
