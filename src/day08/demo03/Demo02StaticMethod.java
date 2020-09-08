package day08.demo03;

/**
 * Demo02StaticMethod
 * 静态static关键字修饰成员方法
 * @author wss
 * @date 2020/7/10 3:46 下午
 * 一旦static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。
 * 如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
 * 如果有了static关键字，那么不需要创建对象，直接通过类名称进行调用
 *
 * 无论是成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法
 *
 * 注意事项：
 *  1.静态不能直接访问非静态。原因：因为在内存中是先有静态内容，后有非静态内容。
 *  2.静态方法中不能用this。原因：this代表当前对象，通过谁调用方法，谁就是当前对象。
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        // 首先创建对象
        MyClass obj = new MyClass();
        // 然后才能使用没有static关键字内容
        obj.method();

        // 对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        // 正确，推荐
        MyClass.methodStatic();
    }
}
