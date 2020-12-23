package day09.demo14;

import java.util.ArrayList;

/**
 * MainRedPacket
 *
 * @author wss
 * @date 2020/12/23 10:05 上午
 */
public class MainRedPacket {
    public static void main(String[] args) {
        Manage manage = new Manage("群主", 100);
        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=============");
        // 群主开始发红包,成员开始接红包在显示各自有多少钱
        ArrayList<Integer> list = manage.send(10, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);
        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=============");
        // 群主发红包多发了一个红包
        ArrayList<Integer> list1 = manage.send(20, 4);
        one.receive(list1);
        two.receive(list1);
        three.receive(list1);
        if (list1.size() > 0) {
            manage.receiveSurplus(list1);
        }
        manage.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=============");
    }
}
