package day08.demo02;

/**
 * Demo05StringSplit
 * 字符串的分割方法
 * @author wss
 * @date 2020/7/10 10:09 上午
 *
 * public String[] split(String regex); 按照参数的规则，将字符串切分成为若干部分
 * 注意事项：
 *  split方法的参数其实是一个"正则表达式"，
 *  今天要注意：如果按照英文句点"."进行切分，必须写"\\."(两个反斜杠)
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("=======");
        String str2 = "aaa.bbb.ccc";
        String[] array2 = str2.split(".");
        for (int i = 0; i < array2.length; i++) {
            // 结果是什么都没有
            System.out.println(array2[i]);
        }
    }
}
