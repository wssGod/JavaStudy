package day08.demo03;

/**
 * Demo01StaticField
 * 静态static关键字修饰成员变量
 * @author wss
 * @date 2020/7/10 3:19 下午
 * 如果一个成员变量使用static关键字，那么这个变量不在属于对象自己，而是属于所在的类。多个对象共享同一个数据
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("国境", 19);
        Student.room = "北京101教室";
        System.out.println("姓名：" + one.getName() + "  年龄：" + one.getAge() + "所在教室：" + Student.room + "学号：" + one.getId());
        Student two = new Student("黄蓉", 16);
        System.out.println("姓名：" + two.getName() + "  年龄：" + two.getAge() + "所在教室：" + Student.room + "学号：" + two.getId());
    }
}
