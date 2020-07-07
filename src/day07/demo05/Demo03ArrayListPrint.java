package day07.demo05;

import java.beans.IntrospectionException;
import java.util.ArrayList;

/**
 * Demo03ArrayListPrint
 * 定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分割每个元素，格式参照{元素@元素@元素}。
 * @author wss
 * @date 2020/7/7 4:33 下午
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("柳岩");
        list.add("迪丽热巴");
        printArrayList(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        printArrayList(list2);
    }

    public static void printArrayList(ArrayList list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + "@");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.println("}");
    }
}
