package day09.demo04;

/**
 * Demo01ExtendsMethod
 * 继承中成员方法访问特点
 * @author wss
 * @date 2020/9/7 1:57 下午
 * 在父子类的继承关系中，创建子类对象，访问成员方法规则
 *      创建的对象是谁，就优先用谁，如果没有则向上找
 * 注意事项：
 *  无论成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。
 *
 * 重写
 */
public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        zi.method();
    }
}
