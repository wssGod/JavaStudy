package day08.demo04;

/**
 * Demo03Math
 *
 * @author wss
 * @date 2020/7/13 11:17 上午
 * 数学工具Math
 * java.util.Math类是数学相关的工具类里面提供了大量的静态方法，完成与数学运算相关的操作
 *  public static double abs(double num); 获取绝对值
 *  public static double ceil(double num); 向上取整
 *  public static double floor(double num); 向下取整
 *  public static long round(double num); 四舍五入
 *
 *  Math.PI 近似的圆周率常量
 */
public class Demo03Math {
    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("===============");
        // 向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println("===============");
        // 向下取整
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.0));
        System.out.println("===============");
        // 四舍五入
        System.out.println(Math.round(3.9));
        System.out.println(Math.round(3.1));
        System.out.println(Math.round(3.0));
        System.out.println("===============");
    }
}
