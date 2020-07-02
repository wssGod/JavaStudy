package day07.demo02;

/**
 * Demo01Anonymous 匿名对象的说明
 *
 * @author wss
 * @date 2020/7/2 1:07 下午
 * 创建对象的标准格式：
 *  类名称 对象名 = new 类名称();
 *
 * 匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 *  new 类名称();
 * 注意事项：匿名对象只能使用唯一一次，下次在用不得不再创建一个新的对象
 * 使用建议：如果确定有一个对象只需要使用唯一的一次，就可以使用匿名对象
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person one = new Person();
        one.name = "欧媛媛";
        one.showName();
        System.out.println("======");

        // 匿名对象
        new Person().name = "赵又廷";
        // 结果：null
        new Person().showName();
    }
}
