package day02;

/**
 * Demo10
 *
 * @author wss
 * @date 2020/6/24 4:52 下午
 *
 * 对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，那么javac编译器会自动隐含地为我们补上一个(byte)(short)(char)
 *  1.如果没有查过左侧的范围，编译器补上强转。
 *  2.如果右侧超过左侧范围，那么直接编译器报错。
 */
public class Demo10 {
    public static void main(String[] args){
        // 右侧确实是一个int数字，但是没有超过左侧的范围，就是正确的
        // int --> byte 不是自动类型转换
        byte num1 = 30;
        // 结果: 30
        System.out.println(num1);
        // byte num2 = 128; // 右侧超过了左侧的范围

        // int --> char 没有超过范围
        // 编译器将会自动补上一个隐含的(char)
        char num3 = 65;
        System.out.println(num3);
    }
}
