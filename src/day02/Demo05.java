package day02;

/**
 * Demo05
 *
 * @author wss
 * @date 2020/6/23 4:47 下午
 *
 * 赋值运算符分为：
 *  基本赋值运算符: 就是一个"="，代表将右侧的数据交给左侧的变量。
 *      int a = 30；
 * 复合赋值运算符
 *      +=  a += 3 相当于 a = a + 3
 *      -=  a -= 3 相当于 a = a - 3
 *      *=  a *= 3 相当于 a = a * 3
 *      /=  a /= 3 相当于 a = a / 3
 *      %=  a %= 3 相当于 a = a % 3
 * 注意事项:
 *  1. 只有变量才能使用赋值运算符，常量不能进行赋值。
 *  2. 复合赋值运算符其中隐含了一个强制类型转换。
 */
public class Demo05 {
    public static void main(String [] args){
        int i = 5;
        // 计算方式 i = i+ 5 变量i先+5在赋值给i
        i += 5;
        // 结果：10
        System.out.println(i);
        System.out.println("=========");
        int x = 10;
        x %= 3;
        // 结果：1
        System.out.println(x);
        System.out.println("=========");

        byte num = 30;
        // num = num + 5
        // num = byte + int
        // num = int + int
        // num = int
        // num = (byte) int
        num += 5;
        System.out.println(num);
    }
}
