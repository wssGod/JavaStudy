package day05;

/**
 * Demo05ArrayUse
 *
 * @author wss
 * @date 2020/6/30 9:24 上午
 *  使用动态初始化的时候，其中元素会自动有个默认值，规则如下：
 *      整形：0
 *      浮点型：0.0
 *      字符型：'\u0000'
 *      布尔类型： false
 *      引用类型：null
 *  注意事项：
 *      1.静态初始化也有默认值的过程，只不过系统默认将大括号中的数值赋值给数组。
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        // 动态初始化数组
        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=========");
        // 将123赋值交个数组arrayA当中的1号元素
        arrayA[1] = 123;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
    }
}
