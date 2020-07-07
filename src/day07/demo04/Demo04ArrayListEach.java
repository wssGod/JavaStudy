package day07.demo04;

import java.util.ArrayList;

/**
 * Demo04ArrayListEach
 *
 * @author wss
 * @date 2020/7/7 10:39 上午
 */
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
