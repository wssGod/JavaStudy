package day02;

/**
 * Demo10
 *
 * @author wss1
 * @date 2020/6/24 4:52 下午
 *
 * 对于byte/short/char三种类型来说，如果右侧赋值的数值没有超过范围，那么javac编译器会自动隐含地为我们补上一个(byte)(short)(char)
 *  1.如果没有查过左侧的范围，编译器补上强转。
 *  2.如果右侧超过左侧范围，那么直接编译器报错。
 *
 *  在给变量进行赋值的时候，如果右侧的表达式当中全部是常量，没有任何变量，
 *  那么编译器javac将会直接将若干个常量表达式计算得到的结果，short result = 5 + 8; 等号右侧全都是常量，没有人设变量参与运算
 *  编译之后，得到的.class字节码文件当中相当于【直接就是】：short result = 13;
 *      这称为"编译器的常量优化"
 *      但是注意：一旦表达式当中有变量参与，那么就不能进行这种优化了。
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

        // 正确写法，右侧没有超过左侧的范围
        short num2 = 10;
        short a = 5;
        short b = 8;
        // short + short --> int + int ---> int
        // short result = a + b;

        // 右侧不用变量，而是采用常量，而且只有两个常量，没有别人
        short result = 5 + 8;
        System.out.println(result);
    }
}
