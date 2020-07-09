package day08.demo02;

/**
 * Demo01StringEquals
 * 字符串比较的相关方法
 * @author wss
 * @date 2020/7/9 9:44 上午
 * ==是进行地址值的比较，如果需要字符串的内容比较可以使用两个方法：
 *  1.public boolean equals(Object obj); 参数可以是任何对象，只有参数是一个字符串并且内容相同才会返回true，否则返回false。
 *      注意事项：
 *          1.任何对象都能用Object接收。
 *          2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
 *          3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
 *          推荐："abc".equals(str) 不推荐：str.equals("abc")
 *  2.public boolean equalsIgnoreCase(); 忽略大小写的
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(array);
        // 结果: true
        System.out.println(str1.equals(str2));
        // 结果: true
        System.out.println(str2.equals(str3));
        // 结果: true
        System.out.println(str3.equals("Hello"));

        // 为什么采用推荐的写法原因
        String str5 = null;
        // 结果: false
        System.out.println("abc".equals(str5));
        // 报空指针异常的错误
        System.out.println(str5.equals("abc"));
    }
}
