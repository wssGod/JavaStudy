package day06.demo02;

/**
 * Demo01PhoneOne
 *
 * @author wss
 * @date 2020/7/1 9:52 上午
 */
public class Demo01PhoneOne {
    public static void main(String[] args) {
        // 根据Phone类，创建一个名为one的对象
        Phone one = new Phone();
        // 结果：null 0.0 null
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=========");
        one.brand = "苹果";
        one.price = 23.12;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=========");
        one.call("码云");
        one.sendMessages();

    }
}
