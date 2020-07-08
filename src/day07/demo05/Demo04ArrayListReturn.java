package day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * Demo04ArrayListReturn
 * 用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。
 * 要求使用自定义的方法来进行实现筛选
 * @author wss
 * @date 2020/7/7 4:47 下午
 *
 * 分析：
 *  1.需要创建一个集合，用来存储int数字，<Integer>
 *  2.随机数字就用Random nextInt
 *  3.循环20次，把随机数字放入大集合：for循环、add方法
 *  4.定义一个方法，用来进行筛选
 * 筛选：根据大集合，筛选负荷要求的元素，得到小集合
 *  返回值类型：ArrayList小集合（里面的元素个数不确定）
 *  方法名称：getSmallList
 *  参数列表：ArrayList大集合（装着20个随机数）
 *  5.判断(if)是偶数，num%2 == 0
 *  6.如果是偶数，就放到小集合中，否则不放
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int count = 20;
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(100) + 1;
            list.add(num);
        }
        System.out.print("随机的20个数：");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println();

        ArrayList<Integer> smallList = getSmallList(list);
        System.out.print("小集合中的偶数：");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i) + ",");
        }
        System.out.println();
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list) {
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                smallList.add(list.get(i));
            }
        }
        return smallList;
    }
}
