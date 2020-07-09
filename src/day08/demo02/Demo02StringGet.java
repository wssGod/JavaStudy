package day08.demo02;

/**
 * @author wss
 * String当中与获取相关的常用方法
 *  1.public int length(); 获取字符串当中含有的字符个数，拿到字符串长度
 *  2.public String concat(String str); 将当前字符串与参数字符串拼接之后返回
 *  3.public char charAt(int index); 获取指定索引位置的单个字符。（索引从0开始）
 *  4.public int indexOf(String str); 查找参数字符串在本字符串中的位置，如果没有返回值-1
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "adsasdasdasdsad".length();
        System.out.println("字符串的长度是：" + length);

        // 拼接字符串
        String str1 = "Hello";
        String str2 = "Word";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        // 获取指定索引位置的单个字符
        char ch = str1.charAt(1);
        System.out.println("字符串Hello位置1的字符：" + ch);

        // 查找参数字符串在本字符串中的位置
        String str4 = "qwerddsasdfvtgrbbnjjmnj";
        int index = str4.indexOf('a');
        System.out.println("a在字符串中的位置" + index);
    }
}
