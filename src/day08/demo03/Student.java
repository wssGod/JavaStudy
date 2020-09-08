package day08.demo03;

/**
 * Student
 *
 * @author wss
 * @date 2020/7/10 3:20 下午
 */
public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    /**学号计数器，每当new一个新对象时，计数器++*/
    private static int idCounter = 0;

    public Student() {
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }
}
