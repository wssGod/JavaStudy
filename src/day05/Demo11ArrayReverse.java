package day05;

/**
 * Demo11ArrayReverse 数组元素反转
 *
 * @author wss
 * @date 2020/6/30 11:09 上午
 * 本来的样子：【1，2，3，4】
 * 之后的样子：【4，3，2，1】
 */
public class Demo11ArrayReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
//        第一种
//        int template;
//        for (int i = 0; i < array.length/2; i++) {
//            template = array[i];
//            array[i] = array[array.length- 1 - i];
//            array[array.length - 1 - i] = template;
//        }
        int temp;
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        // 遍历输出
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
