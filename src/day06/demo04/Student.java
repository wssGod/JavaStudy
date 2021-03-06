package day06.demo04;

/**
 * Student 构造方法
 *
 * @author wss
 * @date 2020/7/1 4:19 下午
 * 构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法
 *  格式：
 *      public 类名称 (参数类型 参数名称) {
 *          方法体
 *      }
 *
 * 注意事项：
 *  1.构造方法的名称必须和所有的类名称完全一样，就连大小写也要一样。
 *  2.构造方法不要写返回值类型，连void都不写。
 *  3.构造方法不能return一个具体的返回值。
 *  4.如果没有编写任何构造方法，那么编译器会默认赠送一个构造方法，没有参数，方法什么事情都不做。
 *      public Student() {}
 *  5.一旦编写了至少一个构造函数，那么编译器将不再赠送
 *  6.构造方法是可以重载的。
 */
public class Student {
    private String name;
    private int age;
    public Student() {
        System.out.println("无参数构造方法执行了");
    }

    public Student(String name, int age) {
        System.out.println("全参数构造方法");
        this.age = age;
        this.name = name;
    }

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
}
