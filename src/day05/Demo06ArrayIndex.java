package day05;

/**
 * Demo06ArrayIndex
 *
 * @author wss
 * @date 2020/6/30 10:35 上午
 *  数组的索引编号从0开始，一直到"数组的长度-1"为止。
 *
 *  如果访问数组元素的时候，索引编号不存在，那么将会发生数组索引越界异常ArrayIndexOutOfBoundsException
 *      原因：索引编号写错了
 *      解决：修改成为存在的正确索引编号
 */
public class Demo06ArrayIndex {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        // 异常
//        System.out.println(array[3]);
    }
}
