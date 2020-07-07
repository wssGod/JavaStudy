package day07.demo05;

import java.util.ArrayList;

/**
 * Demo02ArrayListStudent
 * 自定义四个学生对象，添加到集合并遍历
 * @author wss
 * @date 2020/7/7 4:19 下午
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("赵丽颖", 22);
        Student s2 = new Student("杨幂", 23);
        Student s3 = new Student("刘亦菲", 25);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 遍历对象集合
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("姓名：" + s.getName() + "年龄：" + s.getAge());
        }
    }
}
