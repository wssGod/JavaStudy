package day09.demo06;

/**
 * Demo01Phone
 *
 * @author wss
 * @date 2020/10/9 3:30 下午
 */
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("-------");
        NewPhone newPhone = new NewPhone();
        newPhone.show();
    }
}
