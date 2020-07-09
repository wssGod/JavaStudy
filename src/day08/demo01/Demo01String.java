package day08.demo01;

/**
 * Demo01String
 * 字符串的概念和特点
 * @author wss
 * @date 2020/7/9 9:00 上午
 * java.lang.String类代表字符串
 * API当中说：java程序中的所有字符串字面值(如"abc")都作为此类的实例实现。
 * 其实就是说：程序当中所有的双引号字符串，都是String类的对象。（就算没有new，也照样是）
 *
 * 字符串的特点
 *  1.字符串的内容永不可变。【重点】
 *  2.正是因为字符串不可变，所以字符串是可以共享使用的。
 *  3.字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节数组
 *
 * 创建字符串的3+1种方式：
 *  三种构造方法:
 *      public String(); 创建一个空白字符串，不含有任何字符
 *      public String(char[] array); 根据字符数组内容，来创建对应的字符串
 *      public String(byte[] array); 根据字节数组的内容，来创建对应的字符串
 *  一种直接创建:
 *      String str = "Hello"; // 右边直接用双引号
 *  注意：
 *      直接写上双引号就是字符串对象。
 */
public class Demo01String {
    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String();
        System.out.println(str1);

        // 根据字符数组内容
        char[] array = {'a', 'b', 'c'};
        String str2 = new String(array);
        System.out.println(str2);

        // 根据字节数组的内容
        byte[] array1 = {97, 98, 99};
        String str3 = new String(array1);
        System.out.println(str3);
        
        // 直接创建
        String str4 = "abc";
        System.out.println(str4);
    }
}
