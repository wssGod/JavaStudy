package day05;

/**
 * Demo08ArrayLength 获取数组的长度
 *
 * @author wss
 * @date 2020/6/30 10:43 上午
 * 如何获取数组的长度：
 *  数组名称.length
 *  将会得到一个int数字，代表数组的长度
 *  数组的长度在程序运行期间，长度不可改变。
 */
public class Demo08ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10,20,5,4,51,61,646,65465,45122,12};
        System.out.println(arrayB.length);

        int[] arrayC = new int[3];
        // 结果3
        System.out.println(arrayC.length);
        arrayC = new int[5];
        // 结果5
        System.out.println(arrayC.length);
    }
}
