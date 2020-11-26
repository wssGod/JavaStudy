package day09.demo06;

/**
 * NewPhone
 * 定义一个新手机，使用老手机作为父类
 * @author wss
 * @date 2020/10/9 3:28 下午
 */
public class NewPhone extends Phone{
    @Override
    public void show() {
        System.out.println("显示姓名");
        System.out.println("显示头像");
        // 把父类的show方法拿过来重新利用
        super.show();
    }
}
