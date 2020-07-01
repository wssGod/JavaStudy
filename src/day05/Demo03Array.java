package day05;

/**
 * Demo03Array
 *
 * @author wss
 * @date 2020/6/30 8:44 上午
 *  使用静态初始化数组的时候，格式还可以省略一下。
 *  标准格式：
 *      数据类型[] 数组名称 = new 数据类型[]{元素1, 元素2, ...};
 *  省略格式：
 *      数据类型[] 数组名称 = {元素1, 元素2, ...};
 *  注意事项：
 *      1.静态初始化没有直接指定长度，但是可以推算出来。
 *      2.静态初始化标准格式可以拆分成两个步骤。
 *      3.动态初始化也可以拆分成两个步骤。
 *      4.静态初始化一旦使用省略格式，就不能拆分成两个步骤
 *   使用建议：
 *      如果不确定数组当中的内容，用动态初始化；否则一经确定了具体内容，用静态初始化。
 */
public class Demo03Array {
    public static void main(String[] args) {
        // 省略静态格式
        int[] arrayA = {5, 15, 20};

        // 静态初始化标准格式可以拆分成两个步骤。
        int[] arrayB;
        arrayB = new int[]{5, 15, 20};

        // 3.动态初始化也可以拆分成两个步骤。
        int [] arrayC;
        arrayC = new int[10];

        // 4.静态初始化一旦使用省略格式，就不能拆分成两个步骤
        // int arrayD;
        // arrayD = {5, 15, 20}; 会报错

    }
}