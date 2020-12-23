package day09.demo14;

import java.util.ArrayList;
import java.util.Random;

/**
 * Member
 *
 * @author wss
 * @date 2020/12/23 9:56 上午
 * 普通成员
 */
public class Member extends User{
    public Member() {

    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包中抽取一个给自己
        // 随机获取一个集合中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引从集合中删除掉，并得到该索引的红包，给自己
        int delta = list.remove(index);
        // 当前成员自己本来有多少钱
        int money = super.getMoney();
        // 加法，并且重新设置回去
        super.setMoney(money + delta);
    }
}
