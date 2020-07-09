package day08.demo01;

/**
 * Demo02StringPool
 * 字符串的常量池
 * @author wss
 * @date 2020/7/9 9:16 上午
 *
 * 字符串常量池：程序中直接写上双引号的字符串，就在字符串常量池中
 * 对于基本类型来说：==是进行数值的比较
 * 对于引用类型来说：==是进行【地址值】的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] array = {'a', 'b', 'c'};
        String str3 = new String(array);
        // 结果：true
        System.out.println(str1 == str2);
        // 结果：false
        System.out.println(str1 == str3);
        // 结果：false
        System.out.println(str2 == str3);
    }
}
