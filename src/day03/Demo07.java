package day03;

/**
 * @author wss
 *
 * switch 语句使用的注意事项
 *  1.多个case后面的数值不能相同。
 *  2.switch后面小括号当中只能是下列数据类型
 *      基本数据类型：byte/short/char/int
 *      引用数据类型：String字符串、enum枚举
 *  3.switch语句格式可以很灵活：前后顺序可以颠倒，而且break语句可以省略。
 */
public class Demo07 {
    public static void main(String [] args) {
        int num = 1;
        switch(num) {
            case 1:
                System.out.println("星期一");
//                break;
            case 2:
                System.out.println("星期二");
//                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("数据不合法");
                break; // 最后一个break可以省略，但是强烈建议不要省略
        }
    }
}
