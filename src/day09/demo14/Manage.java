package day09.demo14;

import java.util.ArrayList;

/**
 * Manage
 *
 * @author wss
 * @date 2020/12/23 9:27 上午
 */
public class Manage extends User{
    public Manage() {

    }

    public Manage(String name, int money) {
        super(name, money);
    }

    /**
     * 发红包的方法
     * @param totalMoney 总共发多少钱
     * @param count 发多少个红包
     * */
    public ArrayList<Integer> send(int totalMoney, int count) {
        // 首先需要一个集合存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        // 首先看群主有多少钱,群主当前的余额
        int leftMoney = super.getMoney();
        if (leftMoney < totalMoney) {
            System.out.println("余额不足");
            return redList;
        }

        // 扣钱就是重新设置一下余额
        super.setMoney(leftMoney - totalMoney);

        // 发红包要平均分配成count份
        int avg = totalMoney / count;
        // 余数也就是甩下的零头
        int mod = totalMoney % count;
        // 除不开的零头要放在最后一个红包内
        // 下面把红包一个个放在集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        int last = avg + mod;
        redList.add(last);
        return redList;
    }
    /**
     * 发出去的红包还有剩余，红包会退还到群主的钱包当中
     * @param list 剩余的红包
     * */
    public void receiveSurplus(ArrayList<Integer> list) {
        // 总共剩余多少钱
        int count  = 0;
        for (int i = 0; i < list.size(); i++) {
            count = count + list.get(i);
        }
        super.setMoney(super.getMoney() + count);
    }
}
