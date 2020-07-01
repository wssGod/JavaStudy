package day06.demo02;

/**
 * Demo02Param 使用户对象类型作为方法的参数
 *
 * @author wss
 * @date 2020/7/1 10:48 上午
 */
public class Demo02Param {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.color = "金色";
        phone.price = 20.32;
        phone.brand = "三星";
        method(phone);
    }
    public static void method(Phone phone) {
        System.out.println(phone.color);
        System.out.println(phone.price);
        System.out.println(phone.brand);
    }
}
