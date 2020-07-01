package day06.demo03;

/**
 * Demo03Student 使用private定义学生类
 *
 * @author wss
 * @date 2020/7/1 4:03 下午
 */
public class Demo03Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("少帅");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们：：" + stu.isMale());
    }
}
