package day07.demo04;

import java.util.ArrayList;

/**
 * Demo05ArrayBasic ArrayList集合中存储基本类型
 *
 * @author wss
 * @date 2020/7/7 10:45 上午
 * 如果希望向集合ArrayList当中存储基本数据类型，必须使用基本类型对应的"包装类"
 *  基本类型    包装类（引用类型，包装类位于java.lang包下）
 *  byte       Byte
 *  short      Short
 *  int        Integer      [特殊]
 *  long       Long
 *  float      Float
 *  double     Double
 *  char       Character    [特殊]
 *  boolean    Boolean
 *
 * 从JDK1.5+开始，支持自动装箱、自动拆箱
 *  自动装箱：基本类型 ---> 包装类型
 *  自动拆箱：包装类型 ---> 基本类型
 */
public class Demo05ArrayBasic {
    public static void main(String[] args) {
        // 集合中存储int类型采用包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        // 取出里面的数据直接采用int进行接收就可以了
        int num = list.get(1);
        System.out.println("第一个索引的数据" + num);
    }
}
