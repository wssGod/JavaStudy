package day08.demo02;

/**
 * Demo03Substring
 * 字符串的截取方法
 * @author wss
 * @date 2020/7/10 9:14 上午
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        // 结果：HelloWorld 原封不动
        System.out.println(str1);
        // 结果：World
        System.out.println(str2);
        System.out.println("=======");

        String str3 = str1.substring(4, 7);
        // 结果：oWo
        System.out.println(str3);
        System.out.println("========");

        // 下面这种写法，字符串的内容仍然是没有改变的
        // 下面有两个字符串： "Hello" "Java"
        //  strA当中保存的是地址值
        //  本来地址值是Hello的0x666
        //  后来的地址值变成了Java的0x999
        String strA = "Hello";
        // 结果：Hello
        System.out.println(strA);
        strA = "Java";
        // 结果： Java
        System.out.println(strA);

    }
}
