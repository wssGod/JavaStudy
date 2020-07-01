package day06.demo03;

/**
 * Student 使用private定义学生类
 *
 * @author wss
 * @date 2020/7/1 3:59 下午
 * 对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式而setXxx方式不变
 */
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
    public boolean isMale() {
        return male;
    }
}
