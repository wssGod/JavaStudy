package day08.demo04;

import java.util.Arrays;

/**
 * Demo01Arrays
 *
 * @author wss
 * @date 2020/7/13 9:54 上午
 * java.util.Arrays是一个与数组相关的工具类，类里面提供了大量的静态方法。用来实现数组常见的操作
 *  public static String toString(数组); 将参数数组变成字符串（按照默认格式：[元素1, 元素2, 元素3...]）
 *  public static void sort(数组); 按照默认升序（从小到大）对数组的元素进行排序
 *  备注：
 *      1.如果是数值，sort默认按照升序从小到大
 *      2.如果是字符串，sort默认按照字母升序
 *      3.如果是自定义的类型，那么这个自定义类需要Comparable或者Comparator接口的支持（今后学习）
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 9, 45, 41};
        String result = Arrays.toString(array1);
        System.out.println(result);
        Arrays.sort(array1);
        String result2 = Arrays.toString(array1);
        System.out.println(result2);

        String[] array2 = {"aaa", "ccc", "bbb"};
        Arrays.sort(array2);
        String result3 = Arrays.toString(array2);
        System.out.println(result3);
    }
}
