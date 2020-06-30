package day05;

/**
 * Demo12ArrayParam 数组作为方法参数进行传参
 *
 * @author wss
 * @date 2020/6/30 1:34 下午
 * 数组可以作为方法的参数。
 * 当调用方法的时候，向方法的小括号进行传参，传递进去的其实是数组的地址。
 */
public class Demo12ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30};
        printArray(array);
    }
    /**
     * 三要素
     * 返回值类型：只是进行打印而已，不需要计算，也没有结果，用void
     * 方法名称：printArray
     * 参数列表：必须给我数组，我才能打印其中的元素
     * */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
