package day07.demo04;

import java.util.ArrayList;

/**
 * Demo02ArrayList ArrayList集合概述和基本使用
 *
 * @author wss
 * @date 2020/7/3 11:20 上午
 * 数组的长度与不可发生改变。
 *  但是ArrayList集合的长度是可以随意变化的。
 * 对于ArrayList来说，有一个<E>代表泛型。
 * 泛型，也就是装在集合中的所有元素，全都统一是什么类型。
 * 注意：泛型只能是引用类型，不能是基本类型。
 *
 * 注意事项：
 *  对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
 *  如果内容是空，得到的是空的中括号[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        // 创建了一个ArrayList集合，集合名称是list，里面装的全都是String字符串类型的数据
        // 备注：从JDK1.7开始，右侧尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        // 结果：[]
        System.out.println(list);

        // 向集合中添加一些数据，需要用到add方法
        list.add("aaa");
        System.out.println(list);
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
//        list.add(100); 错误的写法，因为创建的时候尖括号的泛型是字符串类型，添加进去的元素必须是字符串类型
    }
}
