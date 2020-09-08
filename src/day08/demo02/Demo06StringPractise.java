package day08.demo02;

/**
 * Demo06StringPractise
 * 定义一个方法，把数组{1,2,3}按照指定的格式拼接成一个字符串。格式参照如下：[word1#word2#word3]
 * @author wss
 * @date 2020/7/10 1:42 下午
 * 分析：
 *  1.准备一个int[] 数组，内容是：1，2，3
 *  2.定义一个方法，用来将数组变成字符串
 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    };
}
