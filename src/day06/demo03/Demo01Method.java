package day06.demo03;

/**
 * Demo01Method 面向对象的三大特性之封装性
 *
 * @author wss
 * @date 2020/7/1 11:24 上午
 */
public class Demo01Method {
    public static void main(String[] args) {
        int[] array = {5,15,25,20,100};
        int max = getMax(array);
        System.out.println(max);
    }
    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
