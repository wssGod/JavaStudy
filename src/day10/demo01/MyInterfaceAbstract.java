package day10.demo01;

/**
 * MyInterfaceAbstract
 *
 * @author wss
 * @date 2020/12/30 1:34 下午
 * 在任何版本Java中，接口都能定义抽象方法
 * 格式：
 * public abstract 返回值类型 方法名称（参数列表）
 *
 * 注意事项：
 *  1. 接口当中的抽象方法，修饰符必须是两个固定的关键字， public abstract
 *  2. 这两个关键字修饰符，可以选择性忽略。
 *  3. 方法的三要素可以随意定义。
 */
public interface MyInterfaceAbstract {
    /**
     * 这是一个抽象方法
     * */
    public abstract void methodAbs();
    /**
     * 这也是一个抽象方法
     * */
    public void methodAbs1();
    /**
     * 这也是一个抽象方法
     * */
    abstract void methodAbs2();
    /**
     * 这也是一个抽象方法
     * */
    void methodAbs3();
}
