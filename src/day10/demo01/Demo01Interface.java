package day10.demo01;

/**
 * Demo01Interface
 *
 * @author wss
 * @date 2020/12/30 1:09 下午
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型，最重要的内容就是其中的抽象方法
 *
 * 如何定义一个接口的格式
 * public interface 接口名称 {
 *     // 接口内容
 * }
 *
 * 备注：换成关键字interface之后，编译生成的字节码文件仍然是，java --> .class
 *
 * 如果是jdk7，那么接口中可以包含的内容
 * 1. 常量
 * 2. 抽象方法
 * 如果是jdk8，还可以额外包含
 * 3. 默认方法
 * 4. 静态方法
 * 如果是jdk9，还可以额外包含
 * 5. 私有方法
 *
 * 接口使用步骤：
 * 1. 接口不能直接使用，必须有一个实现类来实现该接口
 * 格式
 * public class 实现类名称 implements 接口名称{}
 * 2.
 */
public class Demo01Interface {
}
