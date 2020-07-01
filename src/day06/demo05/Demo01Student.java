package day06.demo05;

/**
 * Demo01Student
 *
 * @author wss
 * @date 2020/7/1 4:43 下午
 */
public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("热巴");
        stu.setAge(20);
        System.out.println("姓名：" + stu.getName() + ", 年龄：" + stu.getAge());
        System.out.println("===========");

        Student stu2 = new Student("赵露思", 20);
        System.out.println("姓名：" + stu2.getName() + ", 年龄：" + stu2.getAge());

        stu2.setAge(21);
        System.out.println("姓名：" + stu2.getName() + ", 年龄：" + stu2.getAge());
    }
}
