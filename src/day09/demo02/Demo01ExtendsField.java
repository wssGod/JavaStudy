package day09.demo02;

/**
 * Demo01ExtendsField
 *
 * @author wss
 * @date 2020/7/29 9:09 上午
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式：
 *  直接通过子类对象访问成员变量：
 *      等号左边是谁，就优先用谁，没有则向上找
 *  间接通过成员方法访问成员变量：
 *      方法属于谁就优先用谁，没有就向上找
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        // 创建父类对象
        Fu fu = new Fu();
        // 只能使用父类的东西，没有任何子类的东西
        // 结果： 10
        System.out.println(fu.numFu);
        System.out.println("========");
        Zi zi = new Zi();
        // 结果： 10
        System.out.println(zi.numFu);
        // 结果： 20
        System.out.println(zi.numZi);
        System.out.println("========");
        // 等号左边是谁就优先用谁
        // 优先子类：200
        System.out.println(zi.num);
        // System.out.println(zi.abc); 到处都没有，编译报错
        System.out.println("========");
        // 这个方法是子类的，优先用子类的，没有在向上找
        zi.methodZi();
        // 这个方法是在父类当中定义的
        // 100
        zi.methodFu();
    }
}
