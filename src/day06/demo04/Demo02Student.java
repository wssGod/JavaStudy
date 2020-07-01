package day06.demo04;

/**
 * Demo02Student
 *
 * @author zqx
 * @date 2020/7/1 4:22 下午
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        Student stu2 = new Student("张三", 20);
        System.out.println("输出：" + stu2.getName() + "年龄：" + stu2.getAge());
    }
}
