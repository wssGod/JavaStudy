package day08.demo02;

/**
 * Demo04StringConvert
 * 字符串转换的相关方法
 * @author wss
 * @date 2020/7/10 9:29 上午
 * String 当中与转换相关的常用方法有：
 *  public char[] toCharArray(); 将当前字符串拆分成字符数组作为返回值
 *  public byte[] getBytes(); 获得当前字符串底层的字节数组
 *  public String replace(CharSequence oldString, CharSequence new String);
 *      将所有新出现的来字符串替换成为新的字符串，返回替换之后的结果新字符串
 *      备注：CharSequence意思就是说可以接收字符串类型
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        String str1 = "Hello";
        char[] chars = str1.toCharArray();
        // 结果：H
        System.out.println(chars[0]);
        System.out.println("======");
        // 转换成个字节数组
        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("======");
        String str2 = "How do you do?";
        String str3 = str2.replace("o", "*");
        System.out.println(str3);
    }
}
