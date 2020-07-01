package day06.demo04;

/**
 * Person this关键字的作用
 *
 * @author wss
 * @date 2020/7/1 4:06 下午
 * 当局部变量和类的成员变量重名的时候，根据就近原则，优先使用局部变量
 *  如果需要访问本类当中的成员，需要使用格式：
 *  this.成员变量名
 *
 *  通过谁调用的方法，谁就是this
 */
public class Person {
    /**
     * 我自己的名字
     * */
    String name;
    public void sayHello(String name) {
        System.out.println(name + ", 你好，我是" + this.name);
    }
}
