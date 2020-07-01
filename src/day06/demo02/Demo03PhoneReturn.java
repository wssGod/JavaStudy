package day06.demo02;

/**
 * Demo03PhoneReturn 对象类型作为方法的返回值
 *
 * @author wss
 * @date 2020/7/1 10:59 上午
 */
public class Demo03PhoneReturn {
    public static void main(String[] args) {
        Phone phone = getPhone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "华为";
        one.price = 20.32;
        one.color = "红色";
        return one;
    }
}
