package day02;

/**
 * Demo3
 *
 * @author wss
 * @date 2020/6/23 3:54 下午
 * 四则运算中的加号"+"有常见的三种用法
 *  1.对于数值来说，那就是加法
 *  2.对于字符char来说，在计算之前，char会提升为int，然后在计算。char类型字符，和int类型数字，之间的关系表: ASCII、Unicode
 *  3.对于字符串String（首字母大写，并不是关键字）来说，加号代表字符串连接操作。
 */
public class Demo3 {
    public static void main(String [] args) {
        // 字符串类型的变量的基本使用
        // 数据类型 变量名称 = 数据值
        String str1 = "Hello";
        // 结果: Hello
        System.out.println(str1);
        // 结果: Hello  Word
        System.out.println("Hello" + "  Word");
        String str2 = "Java";
        // 结果: Java20  String + int --> String
        System.out.println(str2 + 20);
        // 优先级的问题 结果: Java2030
        System.out.println(str2 + 20 + 30);
        // 优先级的问题 结果: Java50
        System.out.println(str2 + (20 + 30));
    }
}
