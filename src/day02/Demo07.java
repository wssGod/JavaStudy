package day02;

/**
 * Demo07：逻辑运算符
 *
 * @author wss
 * @date 2020/6/24 1:54 下午
 *
 * 与 （并且）&& 全都是true，才是true；否则就是false
 * 或 （或者）|| 至少一个是true，就是true；全都是false，才是false
 * 非 （取反）!  本来是true，变成false；本来是false，变成true
 *
 * 短路: 与"&&"，或"||"，具有短路效果，如果根据左边已经判断得到最终结果，那么右边代码将不再之心，从而节省一定的性能
 */
public class Demo07 {
    public static void main(String [] args) {
        // 结果 false
        System.out.println(true && false);
        // true && true --> true
        // 结果 true
        System.out.println(3 < 4 && 10 > 5);
    }
}
