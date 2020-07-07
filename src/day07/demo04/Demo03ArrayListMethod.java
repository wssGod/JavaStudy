package day07.demo04;

import java.util.ArrayList;

/**
 * Demo03ArrayListMethod ArrayList集合的常用方法和遍历
 *
 * @author wss
 * @date 2020/7/7 10:24 上午
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 结果： []
        System.out.println(list);
        // 向集合中添加元素，采用add方法
        list.add("留言");
        // 结果：[留言]
        System.out.println(list);
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        // 结果：[留言, 高圆圆, 赵又廷, 李小璐, 贾乃亮]
        System.out.println(list);

        // 从集合中获取元素是get，索引值从0开始
        String name = list.get(2);
        // 结果：第二号索引位置：赵又廷
        System.out.println("第二号索引位置：" + name);

        // 从集合中删除元素，remove，索引从0开始
        String whoRemove = list.remove(3);
        System.out.println("被删除的人是：" + whoRemove);
        System.out.println(list);

        // 获取集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("数组的长度为：" + size);
    }
}
