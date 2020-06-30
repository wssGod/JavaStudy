package day05;

/**
 * Demo04ArrayUse
 *
 * @author wss
 * @date 2020/6/30 8:53 上午
 *  直接打印数组名称，得到的是数组对应的，内存地址哈希值。
 *  访问数组元素的格式：数组名称[索引值]
 *      索引值：就是一个int数字，代表数组当中元素编号。
 *      【注意】：索引值从0开始，一直到"数组的长度-1"为止。
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] arrayA = {5, 10, 20};
        // 结果：[I@60e53b93
        System.out.println(arrayA);

        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);

        // 也可以将数组当中的某个元素赋值交给变量
        int num = arrayA[1];
        System.out.println(num);
    }
}
